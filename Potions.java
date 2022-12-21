public class Potions extends Items { //class for potions

    private int attributeIncrease;
    private String attributeAffected;

    public Potions(String name, int price, int level, int attributeIncrease, String attributeAffected) {
        super(name, price, level);
        this.attributeIncrease = attributeIncrease;
        this.attributeAffected = attributeAffected;
    }

    public int getAttributeIncrease() {
        return attributeIncrease;
    }

    public String getAttributeAffected() {
        return attributeAffected;
    }

    public void utilizePotion(Hero hero) { //potions effect and increment of that effect on hero's various attributes

        if (attributeAffected.indexOf("Health") != -1) {
            hero.setHp(hero.getHp() + attributeIncrease);
        }

        if (attributeAffected.indexOf("Mana") != -1) {
            hero.setMana(hero.getMana() + attributeIncrease);
        }

        if (attributeAffected.indexOf("Strength") != -1) {
            hero.setStrength(hero.getStrength() + attributeIncrease);
        }

        if (attributeAffected.indexOf("Agility") != -1) {
            hero.setAgility(hero.getAgility() + attributeIncrease);
        }

        if (attributeAffected.indexOf("Dexterity") != -1) {
            hero.setDexterity(hero.getDexterity() + attributeIncrease);
        }

    }

    public void displayInfo() {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Name                    Price          Level          Attribute Increase          Attribute Affected");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println(getName() + "                    " + getPrice() + "          " + getLevel() + "          " + getAttributeIncrease() + "          " + getAttributeAffected());
        System.out.println();
    }

}