package com.google.calendar.api_google_calendar.dto;

import java.util.List;

// 1. Objeto Raiz retornado pela API
public record EventResponse(
    List<EventItem> items
) {
    // 2. Cada Item da lista de eventos
    public record EventItem(
        String summary,
        EventDate start,
        EventDate end
    ) {}

    // 3. Objeto interno para datas (start e end)
    public record EventDate(
        String date,
        String dateTime
    ) {}
}
