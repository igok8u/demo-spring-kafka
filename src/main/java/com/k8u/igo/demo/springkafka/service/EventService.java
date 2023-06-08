package com.k8u.igo.demo.springkafka.service;

import com.k8u.igo.demo.springkafka.config.ApplicationConfiguration;
import com.k8u.igo.demo.springkafka.model.dto.EventDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {
    private final KafkaTemplate kafkaTemplate;

    public void log(EventDto aEventDto) {
        log.info("Log event {}", aEventDto);
        kafkaTemplate.send(ApplicationConfiguration.TOPIC_NAME, aEventDto.getType());
    }
}
