public class Weaponry extends Items { //class for weapons

    private int damage;
    private int handsRequired;

    public Weaponry(String name, int price, int level, int damage, int handsRequired) {
        super(name, price, level);
        this.damage = damage;
        this.handsRequired = handsRequired;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHandsRequired() {
        return handsRequired;
    }

    public void displayInfo() {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Name                    Price          Level          Damage          Required Hands");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(getName() + "                    " + getPrice() + "          " + getLevel() + "          " + getDamage() + "          " + getHandsRequired());
        System.out.println();
    }

}