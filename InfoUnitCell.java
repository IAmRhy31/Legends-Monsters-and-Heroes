public class InfoUnitCell { //class to work on the single unit cell for a board (used in Assignment 1)

    private char type, content;

    public InfoUnitCell(char type, char content) {
        this.type = type;
        this.content = content;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }

}