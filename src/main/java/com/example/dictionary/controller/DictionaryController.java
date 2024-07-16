package com.example.dictionary.controller;

import com.example.dictionary.model.Data;
import com.example.dictionary.model.Dictionary;
import com.example.dictionary.service.DictionaryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "main_methods")
@RestController
@RequestMapping("/api/v1/dictionaries")
@AllArgsConstructor
public class DictionaryController {
    private final DictionaryService service;

    @Operation(
            summary = "Показывает всю таблицу dictionary",
            description = "Выводит все данные столбцов id, code и description из таблицы dictionary"
    )
    @GetMapping
    public List<Dictionary> findAllDictionary() {
        return service.findAllDictionary();
    }

    @Operation(
            summary = "Добавляет новую запись в dictionary",
            description = "При заполнении значений code и description автоматически создает UUID id pk"
    )
    @PostMapping
    public String saveDictionary(@RequestBody Dictionary dictionary) {
        service.saveDictionary(dictionary);
        return "Dictionary created successfully";
    }

    @Operation(
            summary = "Находит все записи code из таблицы dictionary",
            description = "Выводит все данные столбцов id, code и description из таблицы dictionary с данным code"
    )
    @GetMapping("/{code}")
    public List<Dictionary> findDictionary(@PathVariable String code) {
        return service.findDictionaryByCode(code);
    }


    @Operation(
            summary = "Добавляет новую запись в data",
            description = "Для добавления новой записи в таблицу data необходимо заполнить данные code и description, а так же заполнить dictionary_id из сушествующих id в таблице dictionary."
    )
    @PostMapping("/records")
    public String saveData(@RequestBody Data data) {
        service.saveData(data);
        return "Data created successfully";
    }

    @Operation(
            summary = "Показывает всю таблицу data",
            description = "Выводит все данные столбцов id, dictionary_id, code и description из таблицы data"
    )
    @GetMapping("/records")
    public List<Data> findAllRecords() {
        return service.findAllData();
    }
}
