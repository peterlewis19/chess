public class King extends Piece {
    public King(boolean isBlack) {
        super(isBlack, 'k');
    }


    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        boolean soFarSoGood = false;

        if (Math.abs(startRow - endRow) <= 1 && Math.abs(startCol - endCol) <= 1) {
            soFarSoGood = true;
        }

        if (Math.abs(startRow - endRow) == 0 && Math.abs(startCol - endCol) == 0) {
            soFarSoGood = false;
        }

        return soFarSoGood;
    }
}
