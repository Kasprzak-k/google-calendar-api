package com.google.calendar.api_google_calendar.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import com.google.calendar.api_google_calendar.dto.EventResponse;

import lombok.RequiredArgsConstructor;

@Service
// era @Data porem, é inadequado: services geralmente não têm estado mutável
// para expor via setters. O correto seria usar:
@RequiredArgsConstructor

public class EventService {
    private final RestClient restClient;

    @Value("${google.api.key}")
    private String apiKey;

    public EventResponse getEvent() {
        return restClient.get()
                .uri("https://content.googleapis.com/calendar/v3/calendars/primary/events?orderBy=startTime&singleEvents=true&timeMax=2026-12-31T00%3A00%3A00Z&timeMin=2026-01-01T00%3A00%3A00Z&fields=items(summary%2Cstart%2Cend)&key=" + apiKey)
                .retrieve()
                .body(EventResponse.class);

    }

}
