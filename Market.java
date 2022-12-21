import java.util.*;

public class Market { //class for market

    private ArrayList<Weaponry> weapons;
    private ArrayList<Armory> armors;
    private ArrayList<Spell> spells;
    private ArrayList<Potions> potions;

    public Market() {

        weapons = new ArrayList<>();
        armors = new ArrayList<>();
        spells = new ArrayList<>();
        potions = new ArrayList<>();
        init();

    }

    public void init() { //initializes market inventory

        //initializing Weapons
        weapons.add(new Weaponry("Sword", 500, 1, 800, 1));
        weapons.add(new Weaponry("Bow", 300, 2, 500, 2));
        weapons.add(new Weaponry("Scythe", 1000, 6, 1100, 2));
        weapons.add(new Weaponry("Axe", 550, 5, 850, 1));
        weapons.add(new Weaponry("TSwords", 1400, 8, 1600, 2));
        weapons.add(new Weaponry("Dagger", 200, 1, 250, 1));

        //Initializing Armors
        armors.add(new Armory("Platinum_Sheild", 150, 1, 200));
        armors.add(new Armory("Breastplate", 350, 3, 600));
        armors.add(new Armory("Full_Body_Armor", 1000, 8, 1100));
        armors.add(new Armory("Wizard_Shield", 1200, 10, 1500));
        armors.add(new Armory("Guradian_Angel", 1000, 10, 1000));

        //Initializing Ice-Spells
        spells.add(new Spell("Snow_Cannon", "Ice" , 500, 2, 650, 250));
        spells.add(new Spell("Ice_Blade", "Ice", 250, 1, 450, 100));
        spells.add(new Spell("Frost_Blizzard", "Ice", 750, 5, 850, 350));
        spells.add(new Spell("Arctic_Storm", "Ice", 700, 6, 800, 300));

        //Initializing Fire-Spells
        spells.add(new Spell("Flame_Tornada", "Fire", 700, 4, 850, 300));
        spells.add(new Spell("Breath_of_Fire", "Fire", 350, 1, 450, 100));
        spells.add(new Spell("Heat_Wave", "Fire", 450, 2, 600, 150));
        spells.add(new Spell("Lava_Comet", "Fire", 800, 7, 1000, 550));
        spells.add(new Spell("Hell_Storm", "Fire", 600, 3, 950, 600));

        //Initializing Lightning-Spells
        spells.add(new Spell("Lighting_Dagger", "Lightning", 400, 1, 500, 150));
        spells.add(new Spell("Thunder_Blast", "Lightning", 750, 4, 950, 400));
        spells.add(new Spell("Electric_Arrows", "Lightning", 550, 5, 650, 200));
        spells.add(new Spell("Spark_Needles", "Lightning", 500, 2, 600, 200));

        //Initializing Potions
        potions.add(new Potions("Healing_Potion", 250, 1, 100, "Health"));
        potions.add(new Potions("Strength_Potion", 200, 1, 75, "Strength"));
        potions.add(new Potions("Magic_Potion", 350, 2, 100, "Mana"));
        potions.add(new Potions("Luck_Elixir", 500, 4, 65, "Agility"));
        potions.add(new Potions("Mermaid_Tears", 850, 5, 100, "Health/Mana/Strength/Agility"));
        potions.add(new Potions("Ambrosia", 1000, 8, 150, "Health/Mana/Strength/Dexterity/Defense/Agility"));

    }

    public void printWeaponryData() { //displaying the list of weapons available in the market

        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("No.          Name                    Price          Level          Damage          Required Hands");
        System.out.println("---------------------------------------------------------------------------------------------------");

        int i;

        for (i = 0; i < weapons.size(); i++){
            System.out.println((i + 1) + "          " + weapons.get(i).getName() + "                    " + weapons.get(i).getPrice() + "          " + weapons.get(i).getLevel() + "          " + weapons.get(i).getDamage() + "          " + weapons.get(i).getHandsRequired());
        }

        System.out.println();

    }

    public void printArmoryData() { //displaying the list of armors available in the market

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("No.          Name                    Price          Level          Damage Reduction");
        System.out.println("------------------------------------------------------------------------------------");

        int i;

        for (i = 0; i < armors.size(); i++){
            System.out.println((i + 1) + "          " + armors.get(i).getName() + "                    " + armors.get(i).getPrice() + "          " + weapons.get(i).getLevel() + "          " + armors.get(i).getDamageReduction());
        }

        System.out.println();

    }

    public void printSpellData() { //displaying the list of spells available in the market

        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("No.          Name                    Type          Price          Level          Damage          Mana Cost");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        int i;

        for (i = 0; i < spells.size(); i++){
            System.out.println((i + 1) + "          " + spells.get(i).getName() + "                    " + spells.get(i).getType() + "          " + spells.get(i).getPrice() + "          " + spells.get(i).getLevel() + "          " + spells.get(i).getDamage() + "          " + spells.get(i).getManaCost());
        }

        System.out.println();

    }

    public void printPotionsData() { //displaying the list of potions available in the market

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("No.          Name                    Price          Level          Attribute Increase          Attribute Affected");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        int i;

        for (i = 0; i < potions.size(); i++){
            System.out.println((i + 1) + "          " + potions.get(i).getName() + "                    " + potions.get(i).getPrice() + "          " + potions.get(i).getLevel() + "          " + potions.get(i).getAttributeIncrease() + "          " + potions.get(i).getAttributeAffected());
        }

        System.out.println();

    }

    public void enterMarket(Hero hero) { //when hero enters the market

        int choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the MARKET PLACE!");
        System.out.println("What do you know want to do?");

        while (true) {

            System.out.print("0. Leave\n1. Buy\n2. Sell\nQ. Quit Game\n");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Q")) { //for quitting the game
                System.out.println("Leaving too soon? We will wait for you :) See you again!");
                System.exit(0);
            }

            try {
                choice = Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.out.println(input + " is a string and not a valid integer (0 to 2).");
                continue;
            }

            if (choice < 0 || choice > 2) {
                System.out.println("Sorry, this is an invalid input! Select an integer from 0 to 2.");
                continue;
            }
            break;

        }


        if (choice == 0) {
            System.out.println("Thanks for coming! Come back when you need a boost :)");
        }

        else if (choice == 1) {
            buyItem(hero);
        }

        else if (choice == 2) {
            sellItem(hero);
        }

    }

    public void buyItem(Hero hero) { //purchase a product from the market

        int choice;
        do {

            System.out.println("Choose what you want to buy: ");
            System.out.print("1. Weaponry\n2. Armory\n3. Spells\n4. Potions\n5. Go Back\n");

            Scanner scan = new Scanner(System.in);
            int item_bought;

            choice = scan.nextInt();

            if (choice < 0 || choice > 5) {
                System.out.println("Invalid Input! Enter a valid choice between 1 - 5 as per your requirement");
                continue;
            } else if (choice == 1) {
                System.out.println("Choose the weapon which you want to buy: ");
                printWeaponryData();

                item_bought = scan.nextInt();

                if (weapons.get(item_bought - 1).getPrice() > hero.getMoney()) { //first checks whether the hero has enough money
                    System.out.println("Insufficient balance :(");
                } else if (weapons.get(item_bought - 1).getLevel() > hero.getLevel()) { //then checks whether the hero has required level reached
                    System.out.println("Required level to buy this item doesn't match your level yet :( Keep trying and winning!");
                } else { //if above both conditions satisfy, transaction complete and item bought
                    ArrayList<Weaponry> w_list = hero.getWeapons();
                    w_list.add(weapons.get(item_bought - 1));
                    hero.setMoney(hero.getMoney() - weapons.get(item_bought - 1).getPrice());
                    hero.setWeapons(w_list);
                    System.out.println("Weapon " + weapons.get(item_bought - 1).getName() + " has been purchased.");
                }

            } else if (choice == 2) {
                System.out.println("Choose the armor which you want to buy: ");
                printArmoryData();

                item_bought = scan.nextInt();

                if (armors.get(item_bought - 1).getPrice() > hero.getMoney()) {
                    System.out.println("Insufficient balance :(");
                } else if (armors.get(item_bought - 1).getLevel() > hero.getLevel()) {
                    System.out.println("Required level to buy this item doesn't match your level yet :( Keep trying and winning!");
                } else {
                    ArrayList<Armory> a_list = hero.getArmors();
                    a_list.add(armors.get(item_bought - 1));
                    hero.setMoney(hero.getMoney() - armors.get(item_bought - 1).getPrice());
                    hero.setArmors(a_list);
                    System.out.println("Armor " + armors.get(item_bought - 1).getName() + " has been purchased.");
                }

            } else if (choice == 3) {
                System.out.println("Choose the spell which you want to buy: ");
                printSpellData();

                item_bought = scan.nextInt();

                if (spells.get(item_bought - 1).getPrice() > hero.getMoney()) {
                    System.out.println("Insufficient balance :(");
                } else if (spells.get(item_bought - 1).getLevel() > hero.getLevel()) {
                    System.out.println("Required level to buy this item doesn't match your level yet :( Keep trying and winning!");
                } else {
                    ArrayList<Spell> s_list = hero.getSpells();
                    s_list.add(spells.get(item_bought - 1));
                    hero.setMoney(hero.getMoney() - spells.get(item_bought - 1).getPrice());
                    hero.setSpells(s_list);
                    System.out.println("Spell " + spells.get(item_bought - 1).getName() + " has been purchased.");
                }

            } else if (choice == 4) {
                System.out.println("Choose the potion which you want to buy: ");
                printPotionsData();

                item_bought = scan.nextInt();

                if (potions.get(item_bought - 1).getPrice() > hero.getMoney()) {
                    System.out.println("Insufficient balance :(");
                } else if (potions.get(item_bought - 1).getLevel() > hero.getLevel()) {
                    System.out.println("Required level to buy this item doesn't match your level yet :( Keep trying and winning!");
                } else {
                    ArrayList<Potions> p_list = hero.getPotions();
                    p_list.add(potions.get(item_bought - 1));
                    hero.setMoney(hero.getMoney() - potions.get(item_bought - 1).getPrice());
                    hero.setPotions(p_list);
                    System.out.println("Potion " + potions.get(item_bought - 1).getName() + " has been purchased.");
                }

            }

        } while (choice != 5);

    }

    public void sellItem(Hero hero) { //sell a product to the market

        int choice;
        do {

            System.out.println("Choose what you want to sell: ");
            System.out.print("1. Weaponry\n2. Armory\n3. Spells\n4. Potions\n5. Go Back\n");

            Scanner scan = new Scanner(System.in);
            int item_sold;

            choice = scan.nextInt();

            if (choice < 0 || choice > 5) {
                System.out.println("Invalid Input! Enter a valid choice between 1 - 5 as per your requirement");
                continue;
            } else if (choice == 1) {
                if (hero.getWeapons().isEmpty()) { //no item to sell in the hero bag
                    System.out.println("You have no weapon in your arsenal to sell.");
                } else {
                    System.out.println("Choose the weapon you want to sell:");

                    for (Weaponry w : hero.getWeapons()) {
                        System.out.println(w.getName());
                    }

                    item_sold = scan.nextInt();
                    ArrayList<Weaponry> w_list = hero.getWeapons();
                    w_list.remove(hero.getWeapons().get(item_sold - 1));
                    hero.setMoney((weapons.get(item_sold - 1).getPrice()) / 2 + hero.getMoney()); //selling for half the purchase price
                    hero.setWeapons(w_list);
                    System.out.println("Weapon " + weapons.get(item_sold - 1).getName() + " has been sold.");
                }

            } else if (choice == 2) {
                if (hero.getWeapons().isEmpty()) {
                    System.out.println("You have no armor in your arsenal to sell.");
                } else {
                    System.out.println("Choose the armor you want to sell:");

                    for (Armory a : hero.getArmors()) {
                        System.out.println(a.getName());
                    }

                    item_sold = scan.nextInt();
                    ArrayList<Armory> a_list = hero.getArmors();
                    a_list.remove(hero.getArmors().get(item_sold - 1));
                    hero.setMoney((armors.get(item_sold - 1).getPrice()) / 2 + hero.getMoney());
                    hero.setArmors(a_list);
                    System.out.println("Armor " + armors.get(item_sold - 1).getName() + " has been sold.");
                }

            } else if (choice == 3) {
                if (hero.getSpells().isEmpty()) {
                    System.out.println("You have no spell in your arsenal to sell.");
                } else {
                    System.out.println("Choose the spell you want to sell:");

                    for (Spell s : hero.getSpells()) {
                        System.out.println(s.getName());
                    }

                    item_sold = scan.nextInt();
                    ArrayList<Spell> s_list = hero.getSpells();
                    s_list.remove(hero.getSpells().get(item_sold - 1));
                    hero.setMoney((spells.get(item_sold - 1).getPrice()) / 2 + hero.getMoney());
                    hero.setSpells(s_list);
                    System.out.println("Spell " + spells.get(item_sold - 1).getName() + " has been sold.");
                }

            } else if (choice == 4) {
                if (hero.getPotions().isEmpty()) {
                    System.out.println("You have no potions in your arsenal to sell.");
                } else {
                    System.out.println("Choose the potion you want to sell:");

                    for (Potions p : hero.getPotions()) {
                        System.out.println(p.getName());
                    }

                    item_sold = scan.nextInt();
                    ArrayList<Potions> p_list = hero.getPotions();
                    p_list.remove(hero.getPotions().get(item_sold - 1));
                    hero.setMoney((potions.get(item_sold - 1).getPrice()) / 2 + hero.getMoney());
                    hero.setPotions(p_list);
                    System.out.println("Potion " + potions.get(item_sold - 1).getName() + " has been sold.");
                }

            }

        } while (choice != 5);

    }

}