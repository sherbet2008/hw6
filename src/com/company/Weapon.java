package com.company;

public class Weapon {

    private String type;
    private String name;

    public Weapon(String type, String name) {
        this.name = name;
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Weapon {" + "type='" + type + '\'' + ", name='" + name + '\'' + '}';

    }
}