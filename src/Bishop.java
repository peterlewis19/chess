public class Bishop extends Piece{
    public Bishop(boolean isBlack){
        super(isBlack, 'b');
    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        boolean seemsOK = false;

        if (Math.abs(startCol-endCol) == Math.abs(startRow-endRow)){
            seemsOK = true;
        }

        if ((startRow == endRow) && (startCol == endCol)) {
            seemsOK = false;
        }

        return seemsOK;
    }
}
