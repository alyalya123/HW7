package com.company;

public class Main {

    public static void main(String[] args) {
        for (Hero hero : createHeroes()) {
            hero.useSuperAbility(createHeroes());
        }

    }

    private static Hero[] createHeroes() {
        Hero heroes[] = new Hero[3];
        heroes[0] = new Magic(100, 10);
        heroes[1] = new Medic(100, 10);
        heroes[2] = new Warrior(100, 10);
        return heroes;
    }
}