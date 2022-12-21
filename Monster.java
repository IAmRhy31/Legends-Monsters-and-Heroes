public class Monster extends Legend { //class for monsters

    private int damage, dodgeChance;
    private String type;
    private boolean dead;

    public Monster(String type, String name, int level, int damage, int defense, int dodgeChance) {
        super(name, level, defense);
        this.type = type;
        this.damage = damage;
        this.dodgeChance = dodgeChance;
        this.dead = false;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(int dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public String getType() {
        return type;
    }

    public boolean getDead() {
        return dead;
    }

    public int defense(int damage) { //monster defends hero's attack

        int value = 0;

        if (Math.random() > (dodgeChance * 0.01)) {
            value = (int)(damage * 0.1);
            hp = hp - value;

            if (hp <= 0) {
                dead = true;
                System.out.println("Monster " + name + " is dead. Good Game!");
            }
        }

        else {
            System.out.println("Monster " + name + " has dodged this attack.");
            return value;
        }

        return value;

    }

    public void attack(Hero hero) { //monster attacks hero

        int value = hero.defense(damage);

        if (value > 0) {
            System.out.println("Monster " + name + " has attacked hero " + hero.getName() + " with a damage of " + damage + "!");
        }

    }

}