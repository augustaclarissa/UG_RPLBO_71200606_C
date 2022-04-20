package org.example;

public class LegionCommander extends PhysicalCharacter implements TargetSkill{
    public LegionCommander(){
        LegionCommander c1 = new LegionCommander();
        c1.name = "Legion Commander";
        c1.health = 1200;
        c1.damage = 120;
        c1.armor = 30;
    }
    private int kill;

    public void attack(Character c1){
        c1.attacked(this.damage);
        if (c1.isDie()){
            kill+=1 && this.damage+=10;
        }
    }

    public boolean skill(Character c1){
        while(this.health != 0 || c1.health !=0){
            LegionCommander.attacked(c1.damage);
            c1.attacked(this.damage);
            if LegionCommander.isDie()){
                this.health = 0;
                break;
            }else if(c1.isDie()){
                kill+=1;
                this.damage+=10;
                break;
            }
        }
        return True;
    }
}
