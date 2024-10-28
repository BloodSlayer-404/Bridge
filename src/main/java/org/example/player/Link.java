package org.example.player;

public interface Link {

    /**
     * The action that improves the durability of the equipped equipment
     */
    void repair();

    /**
     * The action that reduces the durability of the equipped equipment
     */
    void use();

    /**
     * The action that improve the damage that deals the equipped equipment
     */
    void upgrade();

    /**
     * The action that reduce the damage that deals the equipped equipment
     */
    void downgrade();
}
