public class Rook extends Piece{
    public  Rook(boolean isBlack){
        super(isBlack, 'r');
    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol){
        boolean seemsOK = false;

        if (startRow == endRow ^ startCol == endCol){
            seemsOK = true;
        }

        return seemsOK;
    }
}
