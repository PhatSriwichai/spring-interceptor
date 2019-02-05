package com.aiwine.simple.interceptor.model;

public class Home {

    private String name;

    private int room;

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", room=" + room +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
