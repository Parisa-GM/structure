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
public class MyDomainServiceImpl extends AbstractBaseServiceImpl<MyDomain, Long> {
//    private MyDomainRepository myDomainRepository;
//
//    public MyDomainServiceImpl(MyDomainRepository myDomainRepository) {
//        super(myDomainRepository);
//    }

    // other specialized methods from the MyDomainService interface
    @Autowired
    MyDomainRepository myDomainRepository;

    @Override
    protected Class<MyDomain> getDomaimClass() {
        return MyDomain.class;
    }

    public MyDomainServiceImpl(AbstractBaseRepository<MyDomain, Long> abstractBaseRepository) {
        super(abstractBaseRepository);
    }
}

