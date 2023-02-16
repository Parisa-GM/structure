package com.parisa.structure.service;

import com.parisa.structure.model.AbstractBaseEntity;
import com.parisa.structure.repository.AbstractBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

public class BaseService<T extends AbstractBaseEntity, ID extends Serializable> {
    protected JpaRepository<T, ID> repository;

    @Autowired
    AbstractBaseRepository<T, ID> abstractBaseRepository;

    public Class<T> getDomainClass() {
        return domainClass;
    }

    private Class<T> domainClass;


    public BaseService(JpaRepository<T, ID> repository, Class<T> domainClass) {
        this.repository = repository;
        this.domainClass = domainClass;
    }

    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<T> findAll(Sort var1) {
        return repository.findAll(var1);
    }

    public T findById(ID id) {
        return repository.findById(id).get();
    }

    public T save(T entity) {
        // Object currentUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (entity.getId() == null) {
            entity.setCreatedAt(LocalDateTime.now());
        } else {
            entity.setUpdatedAt(LocalDateTime.now());
        }
        return repository.save(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
