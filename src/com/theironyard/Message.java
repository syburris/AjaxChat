package com.theironyard;

import java.sql.Timestamp;

/**
 * Created by stevenburris on 10/17/16.
 */
public class Message {
    int id;
    String author;
    String text;
    Timestamp timestamp;

    public Message() {
    }

    public Message(String author, String text, Timestamp timeStamp) {
        this.author = author;
        this.text = text;
        this.timestamp = timeStamp;
    }

    public Message(int id, String author, String text, Timestamp timeStamp) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.timestamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
