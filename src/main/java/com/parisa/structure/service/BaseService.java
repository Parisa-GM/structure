package com.parisa.structure.service;

import com.parisa.structure.model.AbstractBaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public class BaseService<E extends AbstractBaseEntity,ID extends Serializable> {
    protected JpaRepository<E, ID> repository;

    public BaseService(JpaRepository<E, ID> repository) {
        this.repository = repository;
    }

    public Page<E> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public E findById(ID id) {
        return repository.findById(id).get();
    }

    public E save(E entity) {
        return repository.save(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
