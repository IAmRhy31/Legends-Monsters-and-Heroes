public class Legend { //common class for both Heroes and Monsters to use

    protected String name;
    protected int level, hp, defense;

    public Legend(String name, int level, int defense) {
        this.name = name;
        this.level = level;
        this.defense = defense;
        this.hp = level * 100; //formula followed as per pdf
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

}