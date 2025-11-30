package com.springboot.project.lovable_clone.entity;

import com.springboot.project.lovable_clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessages {

    Long Id;

    ChatSession chatSession;

    String content;

    String toolCalls;

    Integer tokensUsed;

    Instant createdAt;

    MessageRole messageRole;

}
