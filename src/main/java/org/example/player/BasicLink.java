package org.example.player;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.equipment.Equipment;

@NoArgsConstructor
@AllArgsConstructor
public class BasicLink implements Link{

    protected Equipment equipment;

    @Override
    public void repair() {
        equipment.setDurability(equipment.getDurability() + 10);
    }

    @Override
    public void use() {
        equipment.setDurability(equipment.getDurability() - 5);
    }

    @Override
    public void upgrade() {
        equipment.setDamage( equipment.getDamage() + 5);
    }

    @Override
    public void downgrade() {
        equipment.setDamage( equipment.getDamage() - 10);
    }
}
