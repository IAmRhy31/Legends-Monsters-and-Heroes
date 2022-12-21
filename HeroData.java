import java.util.*;

public class HeroData { //class for data regarding different heroes and their types
    
    private ArrayList<Hero> heroes;

    public HeroData() {
        heroes = new ArrayList<>();
        init();
    }
    
    public void init() {

        //initializing the type "Warrior" Hero Data
        heroes.add(new Hero("Warrior", "Gaerdal_Ironhand", 100, 700, 500, 600, 1354, 7));
        heroes.add(new Hero("Warrior", "Sehanine_Monnbow", 600, 700, 800, 500, 2500, 8));
        heroes.add(new Hero("Warrior", "Muamman_Duathall", 300, 900, 500, 750, 2546, 6));
        heroes.add(new Hero("Warrior", "Flandal_Steelskin", 200, 750, 650, 700, 2500, 7));
        heroes.add(new Hero("Warrior", "Undefeated_Yoj", 400, 800, 400, 700, 2500, 7));
        heroes.add(new Hero("Warrior", "Eunoia_Cyn", 400, 700, 800, 600, 2500, 6));

        //initializing the type "Sorcerer" Hero Data
        heroes.add(new Hero("Sorcerer", "Rillifane_Rallathil", 1300, 750, 450, 500, 2500, 9));
        heroes.add(new Hero("Sorcerer", "Segojan_Earthcaller", 900, 800, 500, 650, 2500, 5));
        heroes.add(new Hero("Sorcerer", "Reign_Havoc", 800, 800, 800, 800, 2500, 8));
        heroes.add(new Hero("Sorcerer", "Reverie_Ashels", 900, 800, 700, 400, 2500, 7));
        heroes.add(new Hero("Sorcerer", "Kalabar", 800, 850, 400, 600, 2500, 6));
        heroes.add(new Hero("Sorcerer", "Skye_Soar", 1000, 700, 400, 500, 2500, 5));

        //initializing the type "Paladin" Hero Data
        heroes.add(new Hero("Paladin", "Parzival", 300, 750, 650, 700, 2500, 7));
        heroes.add(new Hero("Paladin", "Sehanine_Moonbow", 300, 750, 700, 700, 2500, 7));
        heroes.add(new Hero("Paladin", "Skoraeus_Stonebones", 250, 650, 600, 350, 2500, 4));
        heroes.add(new Hero("Paladin", "Garl_Glittergold", 100, 600, 500, 400, 2500, 5));
        heroes.add(new Hero("Paladin", "Amaryllis_Astra", 500, 500, 500, 500, 2500, 5));
        heroes.add(new Hero("Paladin", "Caliber_Heist", 400, 400, 400, 400, 2500, 8));
        
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }
    
    public void printListOfHeroes() {

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("No.        Type          Name             Mana       Strength     Agility     Dexterity    Money    Experience");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        int i;

        for (i = 0; i < heroes.size(); i++) {
            System.out.println((i + 1) + "        " + heroes.get(i).getType() + "    " + heroes.get(i).getName() + "       " + heroes.get(i).getMana() + "           " + heroes.get(i).getStrength() + "          " + heroes.get(i).getAgility() + "          " + heroes.get(i).getDexterity() + "          " + heroes.get(i).getMoney() + "         " + heroes.get(i).getExperience());
        }

        System.out.println();

    }

}