package com.example.dictionary.service;

import com.example.dictionary.model.Data;
import com.example.dictionary.model.Dictionary;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface DictionaryService {
    List<Dictionary> findAllDictionary();
    Dictionary saveDictionary(Dictionary dictionary);
    List<Dictionary> findDictionaryByCode(String code);

    Data saveData(Data data);
    List<Data> findAllData();
}
