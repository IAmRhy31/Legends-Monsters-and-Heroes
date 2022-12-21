import java.util.*;

public class Battle { //class for battle between heroes and monsters

    private MonsterData monsterData;
    private int round;
    private int level;
    private ArrayList<Hero> heroes;
    private ArrayList<Monster> monsters;
    private boolean end;

    Scanner scan =new Scanner(System.in);

    public Battle(ArrayList<Hero> heroes) {
        this.monsterData = new MonsterData();
        this.round = 0;
        this.heroes = heroes;
        this.monsters = new ArrayList<>();
        this.end = false;
        this.level = 0;
    }

    public void init() { //initialize fight

        int highest_level = getHighestLevel();
        System.out.println("*******************GET READY************************");
        System.out.println("MONSTER CONFRONTED. GOOD LUCK!!");
        monsterSpawn(heroes.size());
        roundBegins();

    }

    public int getHighestLevel() { //get the highest level of heroes

        int highest_level = 0;
        for (Hero hero : heroes) {
            if (hero.getLevel() > highest_level) {
                highest_level = hero.getLevel();
            }
        }
        return highest_level;

    }

    public void monsterSpawn(int size) { //monster is generated randomly

        while (size > monsters.size()) {
            Random r = new Random();
            int m;
            m = r.nextInt(size);
            monsters.add(monsterData.getMonsters().get(m));
        }

        displayMonsterInfo(monsters);

    }

    public void displayMonsterInfo(ArrayList<Monster> monsters) {

        System.out.println("Monster info is as follows 👇");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        int i;

        for (i = 0; i < monsters.size(); i++) {
            System.out.println((i + 1) + "          " + monsters.get(i).getType() + "          " + monsters.get(i).getName() + "                    " + monsters.get(i).getLevel() + "          " + monsters.get(i).getDamage() + "          " + monsters.get(i).getDefense() + "          " + monsters.get(i).getDodgeChance() + "          " + monsters.get(i).getDead());
        }

        System.out.println();

    }

    public void displayHeroInfo(ArrayList<Hero> heroes) {

        System.out.println("Hero info is as follows 👇");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        int i = 0;

        for (Hero h : heroes) {
            System.out.println((++i) + "          " + h.getType() + "          " + h.getName() + "                    " + h.getMana() + "          " + h.getStrength() + "          " + h.getAgility() + "          " + h.getDexterity() + "          " + h.getMoney() + "          " + h.getExperience() + "          " + h.getFainted());
            System.out.println();
        }

    }

    public void roundBegins() {

        round++;
        String response; int i;

        response = "";

        System.out.println("Current Round commencing: " + round);
        displayMonsterInfo(monsters);
        displayHeroInfo(heroes);


        for (i= 0; i < heroes.size() ; i++) {
            if (!heroes.get(i).getFainted()) {
                takeAction(i);
            }
        }

        response = checkWinner();
        battleOver(response);
        
        if (end) {
            return;
        }

        for(i = 0; i < monsters.size() ; i++) {
            if (!monsters.get(i).getDead()) {
                monsterAttack(i);
            }
        }

        response = checkWinner();
        battleOver(response);

        if (!end) {
            for(Hero hero:heroes) {
                if(!hero.getFainted()) {
                    hero.setMana((int)(hero.getMana() * 1.1));
                    hero.setHp((int)(hero.getHp() * 1.1));
                }
            }
            roundBegins();
        }

        else {
            return;
        }

    }

    public String checkWinner() {

        end = true;
        boolean lost = true;

        for (Hero hero:heroes) {
            if (!hero.getFainted()) {
                lost = false;
            }
        }

        for (Monster monster:monsters) {
            if (!monster.getDead()) {
                if(!lost) {
                    end = false;
                }
            }
        }

        if (!end && lost) {
            for(Hero hero:heroes) {
                hero.lost();
            }
            return "MONSTER";
        }

        else if(!end && !lost) {
            return "Continue";
        }

        else if (end && !lost) {
            return "HERO";
        }

        else {
            return "CANNOT BE TAKEN DOWN";
        }

    }

    public void battleOver(String response) {

       if (response.equals("MONSTER")) {
           System.out.println("Monsters won. Tough Luck :(");
       }
       else if (response.equals("HERO")) {
           System.out.println("Heroes won! Congratulations :)");
       }
       else {
           return;
       }

       for (Hero hero:heroes) {
           hero.afterBattle(level);
       }

       end = true;

    }

    public void takeAction(int index) {

        int choice, i, temp_target;
        temp_target = 0;

        Hero hero = heroes.get(index);

        System.out.println("Time to fight, " + hero.getName());
        System.out.print("Below are your options:\n1. Attack\n2. Change Weapon\n3. Change Armor\n4. Cast Spell\n5. Use Potion\n6. Quit Game\n");
        choice = scan.nextInt();

        if (monsters.get(index).getDead()) {
            for (i = 0; i < monsters.size(); i++) {
                if (!monsters.get(i).getDead()) {
                    temp_target = i;
                    break;
                }
            }
        }
        else {
            temp_target = index;
        }

        if (choice == 1) {
            hero.attack(monsters.get(temp_target));
        }
        else if (choice == 2) {
            hero.changeWeapon();
        }
        else if (choice == 3) {
            hero.changeArmor();
        }
        else if (choice == 4) {
            hero.useSpell(monsters.get(temp_target));
        }
        else if (choice == 5) {
            hero.usePotion();
        }
        else if (choice == 6) {
            System.out.println("Leaving too soon? We will wait for you :) See you again!");
            System.exit(0);
        }
        else {
            displayMonsterInfo(monsters);
            displayHeroInfo(heroes);
            takeAction(index);
        }

    }

    public void monsterAttack(int index) {

        int i, temp_target = 0;
        Hero hero = heroes.get(index);
        Monster monster = monsters.get(index);

        if (!hero.getFainted()) {
            temp_target = index;
        }
        else {
            for (i = 0; i < heroes.size(); i++) {
                if (!heroes.get(i).getFainted()) {
                    temp_target = i;
                    break;
                }
            }
        }

        monster.attack(heroes.get(temp_target));

    }

}