package e165709;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(); //Boardクラスのインスタンス生成
        board.makeboard(); //盤面の作成

        for (int i = 0; i < 6; i++){
            board.printboard();
        }
    }
}