package com.parisa.example.model;

import com.parisa.structure.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class EventLog extends AbstractBaseEntity {
    private String action;
}
