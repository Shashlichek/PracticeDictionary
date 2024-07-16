package com.example.dictionary.model;

import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;
import jakarta.persistence.*;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dictionary")
public class Dictionary {
    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String code;

    @NonNull
    private String description;

    public Dictionary(UUID id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }

    public Dictionary() {
    }
}
