public class Main {
    public static void main(String[] args){
        System.out.println("Chess");

        ChessBoard game = new ChessBoard();
        game.display();
        for (int i=0; i< 10; i++) {
            game.move();
            game.display();
        }
        //System.out.println(result);
    }
}
