package com.company;

public abstract class Hero implements HavingSuperAbility{
    protected int health;
    protected int damage;
    AbilityType ability;

    public Hero(int health, int damage, AbilityType ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }
}
