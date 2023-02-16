package com.parisa.structure.repository;

import com.parisa.structure.model.AbstractBaseEntity;

import java.io.Serializable;
import java.util.List;

public interface AbstractBaseRepositoryCustom<T extends AbstractBaseEntity,ID extends Serializable> {
    List<T> findAllByFilter(String textQuery);
}
