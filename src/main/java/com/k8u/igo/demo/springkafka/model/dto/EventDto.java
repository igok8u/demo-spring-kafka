package com.k8u.igo.demo.springkafka.model.dto;

import com.k8u.igo.demo.springkafka.model.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private EventType type;
}
