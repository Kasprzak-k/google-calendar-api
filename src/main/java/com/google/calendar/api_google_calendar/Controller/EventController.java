package com.google.calendar.api_google_calendar.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.calendar.api_google_calendar.Service.EventService;
import com.google.calendar.api_google_calendar.dto.EventResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor

public class EventController {
    private final EventService eventService;

    @GetMapping("/event")
    public EventResponse getEvent() {
        return eventService.getEvent();
    }
}
