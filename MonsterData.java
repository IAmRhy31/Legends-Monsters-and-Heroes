import java.util.*;

public class MonsterData { //class for data regarding different monsters and their types

    private ArrayList<Monster> monsters;

    public MonsterData() {
        monsters = new ArrayList<>();
        init();
    }
    
    public void init() {

        //initializing the type "Dragon" Monster Data
        monsters.add(new Monster("Dragon", "Desghidorrah", 3, 300, 400, 35));
        monsters.add(new Monster("Dragon", "Chrysophylax", 2, 200, 500, 20));
        monsters.add(new Monster("Dragon", "BunsenBurner", 4, 400, 500, 45));
        monsters.add(new Monster("Dragon", "Natsunomeryu", 1, 100, 200, 10));
        monsters.add(new Monster("Dragon", "TheScaleless", 7, 700, 600, 75));
        monsters.add(new Monster("Dragon", "Kas-Ethelinh", 5, 600, 500, 60));
        monsters.add(new Monster("Dragon", "Alexstraszan", 10, 1000, 9000, 55));
        monsters.add(new Monster("Dragon", "Phaarthurnax", 6, 600, 700, 60));
        monsters.add(new Monster("Dragon", "D-Maleficent", 9, 900, 950, 85));
        monsters.add(new Monster("Dragon", "TheWeatherbe", 8, 800, 900, 80));
        monsters.add(new Monster("Dragon", "Igneel", 6, 600, 400, 60));
        monsters.add(new Monster("Dragon", "BlueEyesWhite", 9, 900, 600, 75));

        //initializing the type "Exoskeleton" Monster Data
        monsters.add(new Monster("Exoskeleton", "Cyrrollalee", 7, 700, 800, 75));
        monsters.add(new Monster("Exoskeleton", "Brandobaris", 3, 350, 450, 30));
        monsters.add(new Monster("Exoskeleton", "BigBad-Wolf", 1, 150, 250, 15));
        monsters.add(new Monster("Exoskeleton", "WickedWitch", 2, 250, 350, 25));
        monsters.add(new Monster("Exoskeleton", "Aasterinian", 4, 400, 500, 45));
        monsters.add(new Monster("Exoskeleton", "Chronepsish", 6, 650, 750, 60));
        monsters.add(new Monster("Exoskeleton", "Kiaransalee", 8, 850, 950, 85));
        monsters.add(new Monster("Exoskeleton", "St-Shargaas", 5, 550, 650, 55));
        monsters.add(new Monster("Exoskeleton", "Merrshaullk", 10, 1000, 900, 55));
        monsters.add(new Monster("Exoskeleton", "St-Yeenoghu", 9, 950, 850, 90));
        monsters.add(new Monster("Exoskeleton", "DocOck", 6, 600, 600, 55));
        monsters.add(new Monster("Exoskeleton", "Exodia", 10, 1000, 1000, 50));

        //initializing the type "Spirits" Monster Data
        monsters.add(new Monster("Spirits", "Andrealphus", 2, 600, 500, 40));
        monsters.add(new Monster("Spirits", "ABlinky", 1, 450, 350, 35));
        monsters.add(new Monster("Spirits", "Andromalius", 3, 550, 450, 25));
        monsters.add(new Monster("Spirits", "Chiang-shih", 4, 700, 600, 40));
        monsters.add(new Monster("Spirits", "FallenAngel", 5, 800, 700, 50));
        monsters.add(new Monster("Spirits", "Ereshkigall", 6, 950, 450, 35));
        monsters.add(new Monster("Spirits", "Melchiresas", 7, 350, 150, 75));
        monsters.add(new Monster("Spirits", "Jormunngand", 8, 600, 900, 20));
        monsters.add(new Monster("Spirits", "Rakkshasass", 9, 550, 600, 35));
        monsters.add(new Monster("Spirits", "Taltecuhtli", 10, 300, 200, 50));
        monsters.add(new Monster("Spirits", "Casper", 1, 100, 100, 50));
        
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

}