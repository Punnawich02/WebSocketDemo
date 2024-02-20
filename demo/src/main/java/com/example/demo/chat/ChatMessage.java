package com.example.demo.chat;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;

    private int active;
    private static int online;
    public static int countUp(){
        return ++online;
    }
    public static int countDown(){
        return --online;
    }
    public void setActive(int online){
        active = online;
    }

}
