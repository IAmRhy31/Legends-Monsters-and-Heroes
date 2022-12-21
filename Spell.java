public class Spell extends Items { //class for spells

    private int damage;
    private int manaCost;

    String type;

    public Spell(String name, String type, int price, int level, int damage, int manaCost) {
        super(name, price, level);
        this.type = type;
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getType() {
        return type;
    }

    public void utilizeSpell(Hero hero, Monster monster) {

        if (hero.getMana() < manaCost) {
            System.out.println(hero.getName() + "'s mana is not enough :(");
            return;
        }

        else {
            hero.setMana(hero.getMana() - manaCost);
        }

        int sum = (damage + (hero.getDexterity()/10000 * damage)); //formula as per pdf
        monster.defense(sum);

        if (type.equals("Ice")) { //ice spell reduces monster's damage attribute (formula as per pdf)
            monster.setDamage((int)(monster.getDamage() * 0.1));
        }

        else if (type.equals("Fire")) { //fire spell reduces monster's defense attribute (formula as per pdf)
            monster.setDefense((int)(monster.getDefense() * 0.1));
        }

        else if (type.equals("Lightning")) { //lightning spell reduces monster's dodge ability attribute (formula as per pdf)
            monster.setDodgeChance((int)(monster.getDodgeChance() * 0.1));
        }

    }

    public void displayInfo() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Name                    Type          Price          Level          Damage          Mana Cost");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(getName() + "                    " + getType() + "          " + getPrice() + "          " + getLevel() + "          " + getDamage() + "          " + getManaCost());
        System.out.println();
    }

}