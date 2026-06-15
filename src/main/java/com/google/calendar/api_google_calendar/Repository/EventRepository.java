package com.google.calendar.api_google_calendar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.calendar.api_google_calendar.Entity.Event;

@Repository
public interface EventRepository
        extends JpaRepository<Event, Long> {

}
