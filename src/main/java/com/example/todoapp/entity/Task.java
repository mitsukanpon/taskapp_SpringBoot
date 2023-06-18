package com.example.todoapp.entity;

import java.sql.Date;

public class Task {
    private long id;
    private String title;
    private int complete_flg;
    private String due_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getComplete_flg() {
        return complete_flg;
    }

    public void setComplete_flg(int complete_flg) {
        this.complete_flg = complete_flg;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
}
