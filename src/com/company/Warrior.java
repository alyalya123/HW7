package com.company;

public class Warrior extends Hero{
    public Warrior(int health, int damage){
            super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useSuperAbility(Hero[] heroes) {
        System.out.println("Hero: " + getClass().getSimpleName() + " use super ability:  " + ability);
    }
}
