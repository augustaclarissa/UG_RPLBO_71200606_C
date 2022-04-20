package org.example;

import sun.font.TrueTypeFont;

public abstract class Character {
    public Character(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    protected int damage;
    protected String name;
    protected int health;

    public void showCharacterInfo{

    }
    public boolean isDie{
        if (health <= 0){
            this.health = 0;
            return True;
        }else{
            return False;
        }
    }
    public abstract void attacked(int);
}
