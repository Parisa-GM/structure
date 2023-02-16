package com.parisa.example.service.evenLog;

import com.parisa.example.model.EventLog;
import com.parisa.example.repository.eventLog.EventLogRepository;
import com.parisa.structure.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventLogService extends BaseService<EventLog, Long> {
    private final EventLogRepository eventLogRepository;

    public EventLogService(JpaRepository repository, EventLogRepository eventLogRepository) {
        super(repository, EventLog.class);
        this.eventLogRepository = eventLogRepository;
    }

    @Transactional
    public EventLog save(EventLog eventLog) {
        return super.save(eventLog);
    }

    @Transactional
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
