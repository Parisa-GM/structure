package com.parisa.example.service.myDomain;

import com.parisa.example.model.MyDomain;
import com.parisa.example.repository.myDomain.MyDomainRepository;
import com.parisa.structure.repository.AbstractBaseRepository;
import com.parisa.structure.service.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class MyDomainService extends AbstractBaseServiceImpl<MyDomain, Long> {
    @Autowired
    MyDomainRepository myDomainRepository;

    @Override
    protected Class<MyDomain> getDomainClass() {
        return MyDomain.class;
    }

    @Transactional
    public void deleteById(Long id) {
        myDomainRepository.deleteById(id);
    }
}

