package com.example.demo.domain.chat.chat.entity;

import com.example.demo.global.initData.entity.BaseTime;
import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
public class ChatRoom extends BaseTime {
    private String name;
}
