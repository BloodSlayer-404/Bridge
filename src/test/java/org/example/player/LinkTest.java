package org.example.player;

import org.example.equipment.Equipment;
import org.example.equipment.Shield;
import org.example.equipment.Staff;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkTest {
    Equipment equipment;

    /**
     * Checks if the methods of the basic version of Link works properly with the
     * equipped equipment
     */
    @Test
    void basicLink(){
        equipment = new Shield();
        BasicLink link = new BasicLink(equipment);

        link.repair();
        assertEquals(510, equipment.getDurability());

        link.use();
        assertEquals(505, equipment.getDurability());

        link.upgrade();
        assertEquals(25, equipment.getDamage());

        link.downgrade();
        assertEquals(15, equipment.getDamage());


    }

    /**
     * Checks if the methods of the Super Link works properly with the
     * equipped equipment
     */
    @Test
    void superLink(){
        equipment = new Staff();
        SuperLink link = new SuperLink(equipment);

        link.repair();
        assertEquals(25, equipment.getDurability());

        link.use();
        assertEquals(20, equipment.getDurability());

        link.upgrade();
        assertEquals(205, equipment.getDamage());

        link.downgrade();
        assertEquals(195, equipment.getDamage());

        link.buff();
        assertEquals(1195, equipment.getDamage());

    }
}