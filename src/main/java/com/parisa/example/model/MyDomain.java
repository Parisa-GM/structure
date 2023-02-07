package com.parisa.example.model;

import com.parisa.structure.model.AbstractBaseEntity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class MyDomain extends AbstractBaseEntity {

    private String attribute1;
    private String attribute2;
    // getters and setters
}

