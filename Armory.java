public class Armory extends Items { //class for armors

    private int damageReduction;

    public Armory(String name, int price, int level, int damageReduction) {
        super(name, price, level);
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Name                    Price          Level          Damage Reduction");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(getName() + "                    " + getPrice() + "          " + getLevel() + "          " + getDamageReduction());
        System.out.println();
    }

}