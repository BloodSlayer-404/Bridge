package org.example.equipment;


public interface Equipment {

    /**
     * Returns the durability of the equipment
     * @return The durability of the equipment
     */
    int getDurability();

    /**
     * Returns the damage that deals the equipment
     * @return The damage that deals the equipment
     */
    int getDamage();

    /**
     * Sets a new durability fot the equipment
     * @param durability: The new durability of the equipment
     */
    void setDurability(int durability);

    /**
     * Sets the new damage that deals the equipment
     * @param damage: The new damage that deals the equipment
     */
    void setDamage(int damage);

    /**
     * Returns a description of the attack action for the equipment
     * @return A description of the attack action for the equipment
     */
    String attack();
}
