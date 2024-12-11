public class Pawn extends Piece{
    public Pawn(boolean isBlack){
        super(isBlack, 'p');
    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        boolean isFirstGo = false;
        boolean seemsOK = false;

        //If its the first go, it can move 1 or 2
        if (startRow == 1 && !isitBlack()) {
            isFirstGo = true;
            if (endRow-startRow <=2 && endRow-startRow >0) {
                seemsOK = true;
            }

        } else if(startRow == 6 && isitBlack()){
            isFirstGo = true;

            if (startRow-endRow <=2 && startRow-endRow >0){
                seemsOK = true;
            }
        //If its not the first go can only move 1 square
        } else{
            if (startRow - endRow == 1 && !isitBlack()){
                seemsOK = true;
            } else if (endRow-startRow == 1 && isitBlack()){
                seemsOK = true;
            }
        }

        return seemsOK;

    }
}
