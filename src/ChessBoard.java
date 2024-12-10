import java.util.Arrays;
import java.util.Scanner;

public class ChessBoard {
    private Piece[][] board;

    public ChessBoard(){
        board = new Piece[8][8]; //instantiates the board
        //add pieces to board

        //adds the pawns
        for (int column = 0; column <= 7; column++){
            board[1][column] = new Pawn(false);
        }
        //adds the rooks
        board[0][0] = new Rook(false);
        board[0][7] = new Rook(false);

        //adds the knights
        board[0][1] = new Knight(false);
        board[0][6] = new Knight(false);

        //adds the bishops
        board[0][2] = new Bishop(false);
        board[0][5] = new Bishop(false);

        //adds King and Queen
        board[0][4] = new King(false);
        board[0][3] = new Queen(false);


        //adds the black pieces
        //pawns
        for (int column = 0; column <= 7; column++){
            board[6][column] = new Pawn(true);
        }
        //adds the rooks
        board[7][0] = new Rook(true);
        board[7][7] = new Rook(true);

        //adds the knights
        board[7][1] = new Knight(true);
        board[7][6] = new Knight(true);

        //adds the bishops
        board[7][2] = new Bishop(true);
        board[7][5] = new Bishop(true);

        //adds King and Queen
        board[7][4] = new King(true);
        board[7][3] = new Queen(true);
    }

    public void display(){
        for (int row=7; row >=0; row--){
            System.out.print(row+1 + " ");
            for (int column=0; column <= 7; column++){
                if (board[row][column] != null) {
                    System.out.print(board[row][column] + "  ");
                } else{
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }

        System.out.println("  A  B  C  D  E  F  G  H");
    }

    public String getPosition(){
        Scanner input = new Scanner(System.in);
        String coords = input.nextLine().toUpperCase();

        return coords;
    }

    // asks the player for their move
    public boolean move(){
        System.out.println("Give the start coord: ");
        String start = getPosition();
        int startRow = coordToRow(start);
        int startCol = coordToCol(start);

        System.out.println("Give the end coord: ");
        String end = getPosition();
        int endRow = coordToRow(end);
        int endCol = coordToCol(end);

        boolean isValid = board[startCol][startRow].isValidMove(board[endCol][endRow]);

        return isValid;
    }

    private int coordToRow(String coord){
        return (int)(coord.charAt(1))-49;
    }

    private int coordToCol(String coord){
        char[] across = {'A','B','C','D','E','F','G','H'};

        int column=0;

        for (int i=0; i< across.length; i++){
            if (across[i]==coord.charAt(0)){
                column = i;
            }
        }

        return column;
    }


}
