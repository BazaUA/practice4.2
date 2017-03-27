package com.google.devrel.training.conference.domain;

/**
 * Created by Вiталiй on 27.03.2017.
 */
public class Announcement {
    private String message;

    public Announcement(){}

    public Announcement(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
