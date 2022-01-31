package com.gregoryszymanski.roomcleanernotifier;

public class AsyncPayload {

    private long id;
    private String model;

    public void setId(long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
