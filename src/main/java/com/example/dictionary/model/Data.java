package com.example.dictionary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table (name = "data")
public class Data {
    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private UUID dictionary_id;

    @NonNull
    private String code;

    @NonNull
    private String description;

    public Data(UUID id, UUID dictionary_id, String code, String description) {
        this.id = id;
        this.dictionary_id = dictionary_id;
        this.code = code;
        this.description = description;
    }

    public Data() {
    }
}
