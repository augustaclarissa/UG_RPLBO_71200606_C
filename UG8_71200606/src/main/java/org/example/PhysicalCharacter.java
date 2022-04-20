package org.example;

public abstract class PhysicalCharacter extends Character{
    public PhysicalCharacter(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    protected int armor;

    public void showCharacterInfo(){
        System.out.println("Hero    : " + name);
        System.out.println("Health  : " + health);
        System.out.println("Damage  : " + damage);
        System.out.println("Armor    : " + armor);
    }

    public void attacked(int){

    }
}
