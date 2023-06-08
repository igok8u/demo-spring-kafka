package com.k8u.igo.demo.springkafka.web;

import com.k8u.igo.demo.springkafka.model.dto.EventDto;
import com.k8u.igo.demo.springkafka.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventsController {

    private final EventService eventService;

    @PostMapping
    public ResponseEntity<String> logEvent(@RequestBody EventDto aEventDto) {

        eventService.log(aEventDto);

        return ResponseEntity.ok("OK");
    }

}
