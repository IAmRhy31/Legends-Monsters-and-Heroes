import java.util.*;

public class GameUniverse extends Board { //class for game's world or map of the game

    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    GameUniverse(int sizeOfBoard) {
        super(sizeOfBoard);
    }

    private Random random = new Random();

    public void inaccessibleSpace() { //init inaccessible space

        int i_counter = 0;
        int inaccessibleArea = (int) (0.2 * sizeOfBoard * sizeOfBoard); //20% inaccessible space

        while (true) {

            int boardSize = sizeOfBoard * sizeOfBoard;
            int i = random.nextInt(boardSize);

            int a = i / sizeOfBoard;
            int b = i % sizeOfBoard;

            if (i_counter < inaccessibleArea && board[a][b].getType() != 'I') {

                board[a][b].setType('I');
                board[a][b].setContent('I');
                i_counter = i_counter + 1;

            }

            if (i_counter == inaccessibleArea) {
                break;
            }

        }

    }

    public void marketSpace() { //init market space

        int m_counter = 0;
        int marketArea = (int) (0.3 * sizeOfBoard * sizeOfBoard); //30% market space

        while (true) {

            int boardSize = sizeOfBoard * sizeOfBoard;
            int i = random.nextInt(boardSize);

            int a = i / sizeOfBoard;
            int b = i % sizeOfBoard;

            if (m_counter < marketArea && board[a][b].getType() != 'M') {

                board[a][b].setType('M');
                board[a][b].setContent('M');
                m_counter = m_counter + 1;

            }

            if (m_counter == marketArea) {
                break;
            }

        }

    }

    public void gameUniverse() { //init game universe

        inaccessibleSpace();
        marketSpace();

        while (true) {

            int a = random.nextInt(sizeOfBoard);
            int b = random.nextInt(sizeOfBoard);

            if (board[a][b].getContent() == ' ') {

                board[a][b].setContent('H');
                setX(a); setY(b);
                break;

            }

        }

    }

    @Override
    public void printGameUniverse() { //print the board/universe
        super.printGameUniverse();
    }

}