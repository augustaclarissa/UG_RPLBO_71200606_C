package org.example;

public class Lina extends MagicCharacter implements TargetSkill{
    public Lina(){
        Lina l1 = new Lina();
        l1.name = "Lina";
        l1.health = 800;
        l1.damage = 70;
        l1.mana = 120;
    }
    public boolean skill(Character){
        mana -= 60;
        damage += 600;
    }

    public void attack(Character){
        
    }
}
