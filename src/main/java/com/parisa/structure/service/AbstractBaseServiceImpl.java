package com.parisa.structure.service;

import com.parisa.structure.model.AbstractBaseEntity;
import com.parisa.structure.repository.AbstractBaseRepository;
import com.parisa.structure.service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/*
@Service
@Transactional*/
public abstract class AbstractBaseServiceImpl<T extends AbstractBaseEntity, ID extends Serializable>
        implements AbstractBaseService<T, ID> {
    @Autowired
    private AbstractBaseRepository<T, ID> abstractBaseRepository;

    protected abstract Class<T> getDomainClass();

    protected Class<T> domainClass = this.getDomainClass();


  /*  @Autowired
    public AbstractBaseServiceImpl(AbstractBaseRepository<T, ID> abstractBaseRepository) {
        this.abstractBaseRepository = abstractBaseRepository;
    }*/

    @Override
    public T save(T entity) {
        if (entity.getId() == null) {
            entity.setCreatedAt(LocalDateTime.now());
        } else {
            entity.setUpdatedAt(LocalDateTime.now());
        }
        return (T) abstractBaseRepository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return abstractBaseRepository.findAll();
    }

    @Override
    public Optional<T> findById(ID entityId) {
        return abstractBaseRepository.findById(entityId);
    }

    @Override
    public T update(T entity) {
        return (T) abstractBaseRepository.save(entity);
    }

    @Override
    public T updateById(T entity, ID entityId) {
        Optional<T> optional = abstractBaseRepository.findById(entityId);
        if (optional.isPresent()) {
            return (T) abstractBaseRepository.save(entity);
        } else {
            return null;
        }
    }

    @Override
    public void delete(T entity) {
        abstractBaseRepository.delete(entity);
    }

    @Override
    public void deleteById(ID entityId) {
        abstractBaseRepository.deleteById(entityId);
    }

}

