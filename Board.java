public class Board { //class for board (used in Assignment 1)

    protected int sizeOfBoard;
    protected InfoUnitCell[][] board;

    public Board(int sizeOfBoard) {
        this.setSizeOfBoard(sizeOfBoard);
        this.setBoard(sizeOfBoard);
    }

    public int getSizeOfBoard() {
        return this.sizeOfBoard;
    }

    private void setSizeOfBoard(int sizeOfBoard) {
        this.sizeOfBoard = sizeOfBoard;
    }

    public InfoUnitCell[][] getBoard() {
        return this.board;
    }

    private void setBoard(int sizeOfBoard) {

        this.board = new InfoUnitCell[sizeOfBoard][sizeOfBoard];

        for (int i = 0; i < sizeOfBoard; ++i) { //for processing the empty board
            for (int j = 0; j < board[0].length; ++j) {
                board[i][j] = new InfoUnitCell(' ', ' ');
            }
        }

    }

    public void printGameUniverse() {

        StringBuilder upDownBorder = new StringBuilder("");

        for (int i = 0; i < this.sizeOfBoard; ++i) { //for print the upper border
            upDownBorder.append("+---");
        }
        upDownBorder.append("+");

        for (InfoUnitCell[] row : this.board) { //to print every cell
            System.out.println(upDownBorder);

            for (InfoUnitCell cell : row) {
                System.out.print("| " + cell.getContent() + " ");
            }
            System.out.println("|");
        }

        System.out.println(upDownBorder); //to print the lower border

    }

}