package org.example;

public abstract class MagicCharacter extends Character{
    public MagicCharacter(String name, int health, int damage, int mana){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.mana = mana;
    }
    protected int mana;

    public void attacked(int){

    }

    public void showCharacterInfo(){
        System.out.println("Hero    : " + name);
        System.out.println("Health  : " + health);
        System.out.println("Damage  : " + damage);
        System.out.println("Mana    : " + mana);
    }
}
