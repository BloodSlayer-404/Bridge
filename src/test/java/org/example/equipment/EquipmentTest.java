package org.example.equipment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {

    Equipment equipment;


    /**
     * Check if all the method of the Shield works properly
     * Checks the getters, setters and the attack method
     */
    @Test
    void shieldTest(){
        equipment = new Shield();
        assertEquals("The shield pushes the enemy away", equipment.attack());

        assertEquals(500, equipment.getDurability());
        equipment.setDurability(100);
        assertEquals(100, equipment.getDurability());
        assertNotEquals(500, equipment.getDurability());

        assertEquals(20, equipment.getDamage());
        equipment.setDamage(50);
        assertEquals(50, equipment.getDamage());
        assertNotEquals(20, equipment.getDamage());
    }

    /**
     * Check if all the method of the Sword works properly
     * Checks the getters, setters and the attack method
     */
    @Test
    void swordTest(){
        equipment = new Sword();
        assertEquals("The sword cuts the enemy", equipment.attack());

        assertEquals(250, equipment.getDurability());
        equipment.setDurability(100);
        assertEquals(100, equipment.getDurability());
        assertNotEquals(250, equipment.getDurability());

        assertEquals(75, equipment.getDamage());
        equipment.setDamage(50);
        assertEquals(50, equipment.getDamage());
        assertNotEquals(75, equipment.getDamage());
    }

    /**
     * Check if all the method of the Staff works properly
     * Checks the getters, setters and the attack method
     */
    @Test
    void staffTest(){
        equipment = new Staff();
        assertEquals("The staff controls the earth", equipment.attack());

        assertEquals(15, equipment.getDurability());
        equipment.setDurability(100);
        assertEquals(100, equipment.getDurability());
        assertNotEquals(15, equipment.getDurability());

        assertEquals(200, equipment.getDamage());
        equipment.setDamage(50);
        assertEquals(50, equipment.getDamage());
        assertNotEquals(200, equipment.getDamage());
    }
}