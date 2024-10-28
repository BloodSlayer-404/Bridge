package org.example.equipment;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Staff implements Equipment{
    private int durability = 15;
    private int damage = 200;

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
     * @return The staff controls the earth
     */
    @Override
    public String attack() {
        return "The staff controls the earth";
    }
}
