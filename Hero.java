import java.util.*;

public class Hero extends Legend { //class for heroes

    private String type;
    private int mana, strength, agility, dexterity, money, experience, pre_hp;
    private boolean lost, fainted;

    private ArrayList<Spell> spells;
    private ArrayList<Armory> armors;
    private ArrayList<Potions> potions;
    private ArrayList<Weaponry> weapons;

    private Weaponry currentWeapon;
    private Armory currentArmor;

    public Hero(String type, String name, int mana, int strength, int agility, int dexterity, int money, int experience) {

        super(name, 1, 0);
        this.type = type;
        this.mana = mana;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.money = money;
        this.experience = experience;
        this.pre_hp = hp;
        this.lost = false;
        this.fainted = false;

        weapons = new ArrayList<>();
        armors = new ArrayList<>();
        spells = new ArrayList<>();
        potions = new ArrayList<>();

        currentWeapon = null;
        currentArmor = null;

    }

    public String getType() {
        return type;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getExperience() {
        return experience;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public ArrayList<Armory> getArmors() {
        return armors;
    }

    public void setArmors(ArrayList<Armory> armors) {
        this.armors = armors;
    }

    public ArrayList<Potions> getPotions() {
        return potions;
    }

    public void setPotions(ArrayList<Potions> potions) {
        this.potions = potions;
    }

    public ArrayList<Weaponry> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weaponry> weapons) {
        this.weapons = weapons;
    }

    public boolean getFainted() {
        return fainted;
    }

    public void setFainted() {
        fainted = true;
    }

    public void levelUp() { //heroes level up by gaining experience

        experience = 0;
        mana = (int)(mana * 1.1);

        if (type.equals("Warrior")) { //focuses on strength and agility
            strength = (int)(strength * 1.3);
            agility = (int)(agility * 1.3);
            dexterity = (int)(dexterity * 1.1);
        }

        else if (type.equals("Sorcerer")) { //focuses on agility and dexterity
            strength = (int)(strength * 1.1);
            agility = (int)(agility * 1.3);
            dexterity = (int)(dexterity * 1.3);
        }

        else if (type.equals("Paladin")) { //focuses on strength and dexterity
            strength = (int)(strength * 1.3);
            agility = (int)(agility * 1.1);
            dexterity = (int)(dexterity * 1.3);
        }

    }

    public void attack(Monster monster) { //heroes attack monster

        int damage = 0;

        if (currentWeapon == null) {
            damage = (int)((strength * 0.05));
        }

        else {
            damage = (int)((strength + currentWeapon.getDamage()) * 0.05);
        }

        int response = monster.defense(damage); //monster deals with the hero's attack

        if (response > 0) {
            System.out.println("Hero " + name + " caused " + response + " damage to Monster " + monster.getName() + "!");
        }

    }

    public int defense(int damage) { //how hero handle monster's attack

        int value = 0;

        if (Math.random() <= (agility * 0.002)) {
            System.out.println("Hero " + name + " has dodged the attack from monster.");
            return value;
        }

        else {
            if (currentArmor == null) {
                value = damage;
            }

            else {
                value = (int)(damage - (currentArmor.getDamageReduction() * 0.01));
            }

            hp = hp - value;
        }

        if (hp <= 0) {
            setFainted();
            System.out.println("Hero " + name + " is fainted!");
        }

        return value;

    }

    public void lost() {
        lost = true;
    }

    public void changeWeapon() { //change weapon option for heroes

        Scanner s = new Scanner(System.in);

        if (weapons.size() == 0) {
            System.out.println("You have no weapon in your arsenal :(");
            System.out.println("Go and get one from the Market");
        }

        else {
            System.out.println("Weapon list is as follows 👇");

            for (Weaponry w_list : weapons) {
                w_list.displayInfo();
            }

            System.out.print("Enter the # of weapon which you wish to equip: ");
            int choice = s.nextInt();
            currentWeapon = weapons.get(choice - 1);
            System.out.println("Your current equipped weapon is " + currentWeapon.getName());

        }

    }

    public void changeArmor() { //change armor option for heroes

        Scanner s = new Scanner(System.in);

        if (armors.size() == 0)  {
            System.out.println("You have no armor in your arsenal :(");
            System.out.println("Go and get one from the Market");
        }

        else {
            System.out.println("Armor list is as follows 👇");

            for (Armory a_list : armors) {
                a_list.displayInfo();
            }

            System.out.print("Enter the # of armor which you wish to equip: ");
            int choice = s.nextInt();
            currentArmor = armors.get(choice - 1);
            System.out.println("Your current equipped armor is " + currentArmor.getName());

        }

    }

    public void useSpell(Monster monster) { //spell power for heroes

        Scanner s = new Scanner(System.in);

        if (spells.size() == 0) {
            System.out.println("You have no spells in your arsenal :(");
            System.out.println("Go and get one from the Market");
        }

        else {
            System.out.println("Spell list is as follows 👇");

            for (Spell s_list : spells) {
                s_list.displayInfo();
            }

            System.out.print("Enter the # of spell which you wish to equip: ");
            int choice = s.nextInt();
            Spell sp = spells.remove(choice-1);
            sp.utilizeSpell(this, monster);
            System.out.println("You have utilized Spell " + sp.getName());
        }

    }

    public void usePotion() { //potion to affect monsters

        Scanner s = new Scanner(System.in);

        if (potions.size() == 0) {
            System.out.println("You have no potions in your arsenal :(");
            System.out.println("Go and get one from the Market");
        }

        else {
            System.out.println("Potion list is as follows 👇");

            for (Potions p_list : potions) {
                p_list.displayInfo();
            }

            System.out.print("Enter the # of potion which you wish to equip: ");
            int choice = s.nextInt();
            Potions po = potions.remove(choice-1);
            po.utilizePotion(this);
            System.out.println("You have utilized Potion " + po.getName());
        }

    }

    public void afterBattle(int level) { //after battle affected hp, money, exp, etc.

        if (fainted && !lost) {
            hp = pre_hp/2;
            pre_hp = hp;
        }

        else if (fainted && lost) {
            hp = pre_hp/2;
            money = money/2;
            pre_hp = hp;
        }
        else {
            money = money + (level * 100);
            experience = experience + 2;

            if(experience >= level * 10)
                levelUp();
        }

    }

}