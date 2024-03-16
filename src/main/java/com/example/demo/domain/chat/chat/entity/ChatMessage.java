package com.example.demo.domain.chat.chat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import global.jpa.entity.BaseTime;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
public class ChatMessage extends BaseTime {
    @ManyToOne
    @JsonIgnore
    private ChatRoom chatRoom;
    private String writerName;
    private String body;
}
