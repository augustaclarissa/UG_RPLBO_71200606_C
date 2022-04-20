package org.example;

public class App
{
    public static void main( String[] args ){
        Lina l = new Lina();
        DragonKnight k = new DragonKnight();
        LegionCommander c = new LegionCommander();

        Lina.skill(DragonKnight);
        DragonKnight.skill();
        DragonKnight.skill();
        LegionCommander.skill(Lina);
        Lina.skill(LegionCommander);

        Lina.showCharacterInfo();
        DragonKnight.showCharacterInfo();
        LegionCommander.showCharacterInfo();


    }
}
