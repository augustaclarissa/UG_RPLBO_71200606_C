package org.example;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    public DragonKnight(){
        DragonKnight k1 = new DragonKnight();
        k1.name = "Dragon Knight";
        k1.health = 1800;
        k1.damage = 95;
        k1.armor = 50;
    }
    private int dragonFormAttack;

    public void skill(){
        dragonFormAttack = 2;

    }

    public void attack(Character k1){
        if(dragonFormAttack > 0){
            k1.attacked(this.damage += 90) && dragonFormAttack -= 1;
        }
    }
}
