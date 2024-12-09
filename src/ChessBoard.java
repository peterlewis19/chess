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
        board[0][3] = new King(false);
        board[0][4] = new Queen(false);


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
        board[7][3] = new King(true);
        board[7][4] = new Queen(true);
    }


    public void display(){
        char[] side ={'a','b'};

        for (int row=7; row >=0; row--){
            for (int column=0; column <= 7; column++){
                if (board[row][column] != null) {
                    System.out.print(board[row][column] + " ");
                } else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        System.out.println("1 2 3 4 5 6 7 8");
    }
}
