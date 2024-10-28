package org.example.player;

import org.example.equipment.Equipment;

public class SuperLink extends BasicLink{

    public SuperLink(Equipment equipment){
        super.equipment = equipment;
    }

    /**
     * Buff the equipped equipment damage in 1000 points
     */
    public void buff(){
        equipment.setDamage(equipment.getDamage() + 1000);
    }
}
