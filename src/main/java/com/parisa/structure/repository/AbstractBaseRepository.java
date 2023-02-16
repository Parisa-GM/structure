package com.parisa.structure.repository;

import com.parisa.structure.model.AbstractBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@NoRepositoryBean
//@Repository
public interface AbstractBaseRepository<T extends AbstractBaseEntity, ID extends Serializable> extends JpaRepository<T, ID>,AbstractBaseRepositoryCustom {

}

