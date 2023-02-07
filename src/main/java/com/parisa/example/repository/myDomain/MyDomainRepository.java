package com.parisa.example.repository.myDomain;

import com.parisa.example.model.MyDomain;
import com.parisa.structure.repository.AbstractBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDomainRepository extends AbstractBaseRepository<MyDomain, Long> {

}
