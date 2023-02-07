package com.parisa.example.repository.myDomain;

import com.parisa.example.model.MyDomain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class MyDomainRepositoryCustomImpl implements MyDomainRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<MyDomain> getAllMyDomainCustom() {
        Query query=entityManager.createQuery(" select  e from MyDomain e");
        query.getFirstResult();
        return null;
    }
}
