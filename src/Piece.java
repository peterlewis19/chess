public class Piece {
    private char symbol;
    private boolean isBlack;

    public Piece(boolean isBlack, char symbol){
        this.isBlack = isBlack;
        this.symbol = symbol;
    }

    public String toString(){
        if (isBlack) {
            return Character.toString(symbol).toUpperCase();
        }else{
            return Character.toString(symbol).toLowerCase();
        }
    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        return false;
    }

    /*public boolean capture(int startRow, int startCol, int endRow, int endCol){

    }*/

    public boolean getColour(){
        return isBlack;
    }

    public char getSymbol(){
        return symbol;
    }
}
