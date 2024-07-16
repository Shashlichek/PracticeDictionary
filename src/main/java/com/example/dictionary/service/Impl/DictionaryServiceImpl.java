package com.example.dictionary.service.Impl;

import com.example.dictionary.model.Data;
import com.example.dictionary.model.Dictionary;
import com.example.dictionary.repository.DataRepository;
import com.example.dictionary.repository.DictionaryRepository;
import com.example.dictionary.service.DictionaryService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Primary
public class DictionaryServiceImpl implements DictionaryService {
    private final DictionaryRepository repository;
    private final DataRepository dataRepository;

    @Override
    public List<Dictionary> findAllDictionary() {
        return repository.findAll();
    }

    @Override
    public Dictionary saveDictionary(Dictionary dictionary) {
        return repository.save(dictionary);
    }

    @Override
    public List<Dictionary> findDictionaryByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public Data saveData(Data data) {
        return dataRepository.save(data);
    }

    @Override
    public List<Data> findAllData() {
        return dataRepository.findAll();
    }
}
