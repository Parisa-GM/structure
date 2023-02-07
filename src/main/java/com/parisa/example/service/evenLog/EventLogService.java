package com.parisa.example.service.evenLog;

import com.parisa.example.repository.eventLog.EventLogRepository;
import com.parisa.structure.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EventLogService extends BaseService {
    private final EventLogRepository eventLogRepository;

    public EventLogService(JpaRepository repository, EventLogRepository eventLogRepository) {
        super(repository);
        this.eventLogRepository = eventLogRepository;
    }
}
