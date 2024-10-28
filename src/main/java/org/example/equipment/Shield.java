package org.example.equipment;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Shield implements Equipment{
    private int durability = 500;
    private int damage = 20;

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
     * @return The shield pushes the enemy away
     */
    @Override
    public String attack() {
        return "The shield pushes the enemy away";
    }
}
