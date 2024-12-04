package br.com.senac.producer.models;

import java.io.Serializable;

public class Producer implements Serializable {

    private String userStatus;

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
