package com.parisa.example.repository.eventLog;

import com.parisa.example.model.EventLog;
import com.parisa.structure.repository.AbstractBaseRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Repository;

@Repository
public interface EventLogRepository extends AbstractBaseRepository<EventLog, ID>,EventLogRepositoryCustom {
}
