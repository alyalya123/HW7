package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage) {
        super(health, damage, AbilityType.HEAL);
}

    @Override
    public void useSuperAbility(Hero[] heroes) {

    }
}
