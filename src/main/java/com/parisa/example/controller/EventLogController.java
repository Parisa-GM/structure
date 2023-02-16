package com.parisa.example.controller;

import com.parisa.example.model.EventLog;
import com.parisa.example.service.evenLog.EventLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class EventLogController {
    @Autowired
    EventLogService eventLogService;

    @GetMapping("/find/{id}")
    public EventLog fine(@PathVariable  Long id)
    {
        return eventLogService.findById(id);
    }

}
