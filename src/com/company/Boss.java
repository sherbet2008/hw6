package com.company;

public class Boss extends GameEntity{
    private int health;
    private int damage;
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String toString() {
        return "Weapon {" + "type='" + type + '\'' + ", name='" + name + '\'' + '}';

    }


}
