public class Queen extends Piece{
    public Queen(boolean isBlack){
        super(isBlack, 'q');
    }


    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        boolean seemsOK = false;

        Bishop diagonal = new Bishop(false);
        Rook straight = new Rook(false);

        if (diagonal.isValidMove(startRow, startCol, endRow, endCol) || straight.isValidMove(startRow, startCol, endRow, endCol)){
            seemsOK = true;
        }

        return seemsOK;
    }
}
