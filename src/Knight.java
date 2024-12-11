public class Knight extends Piece{
    public Knight(boolean isBlack){
        super(isBlack, 'n');
    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        boolean seemsOK = false;

        //case 1
        /*
        _X_X_
        X___X  <-- these 2 rows
        __O__
        X___X  <--
        _X_X_


         */
        if (Math.abs(endRow - startRow) == 1 && Math.abs(endCol-startCol)==2){
            seemsOK= true;
        //case 2

        /*
        _X_X_ <-- these 2 rows
        X___X
        __O__
        X___X
        _X_X_ <--
         */
        } else if (Math.abs(endRow - startRow) == 2 && Math.abs(endCol-startCol)==1){
            seemsOK= true;
        }

        return seemsOK;
    }
}

