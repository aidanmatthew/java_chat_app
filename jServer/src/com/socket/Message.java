package com.socket;

import java.io.Serializable;

public class Message implements Serializable{
    
    private static final long serialVersionUID = 1L;
    public String type, sender,recipient, content;
    
    public Message(String type, String sender, String content, String recipient){
        this.type = type; 
        this.sender = sender; 
        this.recipient = recipient;
        this.content = content; 
    }
    
    @Override
    public String toString(){
        return "{type='"+type+"', sender='"+sender+"', content='"+content+"', recipient='"+recipient+"'}";
    }
}
