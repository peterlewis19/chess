public class King extends Piece{


    public King(boolean isBlack) {
        super(isBlack, 'k');
    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        boolean seemsOK = false;
        if ((Math.abs(startRow - endRow) <= 1) && (Math.abs(startCol - endCol)) <= 1) {
            seemsOK = true;
        }
        if ((startRow == endRow) && (startCol == endCol)) {
            seemsOK = false;
        }
        return seemsOK;
    }
}


