package e165709;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.makeboard();

        for (int i = 0; i < 6; i++){
            board.printboard();
        }
    }
}
