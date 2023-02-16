package com.parisa.structure.repository;

import com.parisa.structure.model.AbstractBaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

public class AbstractBaseRepositoryCustomImpl<T extends AbstractBaseEntity,ID extends Serializable>  implements AbstractBaseRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List findAllByFilter(String textQuery) {
        Query query=entityManager.createQuery(textQuery);
        return query.getResultList();
    }
}
