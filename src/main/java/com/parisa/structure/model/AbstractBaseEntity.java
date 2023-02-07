package com.parisa.structure.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class AbstractBaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Version
    private int version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public AbstractBaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}

