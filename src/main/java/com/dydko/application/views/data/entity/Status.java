package com.dydko.application.views.data.entity;

import com.dydko.application.views.data.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Status extends AbstractEntity {
    public Status() {
    }

    private String name;

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
