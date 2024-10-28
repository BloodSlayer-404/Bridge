package org.example.equipment;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Sword implements Equipment{

    private int durability = 250;
    private int damage = 75;

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     *
     * @return The sword cuts the enemy
     */
    @Override
    public String attack() {
        return "The sword cuts the enemy";
    }
}
