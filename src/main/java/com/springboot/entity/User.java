package com.springboot.entity;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {

    private int Id;

    private String name;

    private String password;

    public User(int Id, String name, String password){
        this.Id = Id;
        this.name = name;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
