package com.k8u.igo.demo.springkafka.listener;

import com.k8u.igo.demo.springkafka.config.ApplicationConfiguration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class EventListener {
    @KafkaListener(topics = ApplicationConfiguration.TOPIC_NAME, groupId = "EventListenerConsumerGroup")
    public void readEvent(String type) {
        log.info("Received event : {}", type);
    }
}
