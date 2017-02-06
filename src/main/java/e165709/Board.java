package e165709;

//盤面のクラス
import java.util.Scanner;


public class Board {
    private int[] arrayboard = new int[10]; //盤面となる配列の定義
    private int zero;  //空白の場所を入れておく変数
    Move move = new Move();     //Moveクラスのインスタンス生成
    Shuffle shuffle = new Shuffle();  //Shuffleクラスのインスタンスの生成

    public void makeboard() {
        /*
        　盤面を作るメソッド
        　盤面のマスとなる数字を一つずつ出力するが、３つごとに改行することで盤面らしくしている
        */
        for (int i = 1; i <= 9; i++) {
            arrayboard[i - 1] = i - 1;
            System.out.printf(" %d", arrayboard[i - 1]);
            if (i % 3 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("Enter to start shuffle"); //Enterキーで、シャッフルが始まることを示す
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        shuffle.shuffle();//shuffleクラスにある、盤面を混ぜるメソッドの呼び出し

        System.out.println("Let's go!");
        zero = arrayboard[0];   //配列の一番目には0があるため、それをzeroに入れている
    }

    public void printboard() {
        /*
        　コード自体はmakeboard()とほぼ変わらない
        　初期化のコードをなくしただけ
        */
        for (int i = 1; i <= 9; i++) {
            System.out.printf(" %d", arrayboard[i - 1]);
            if (i % 3 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("　↓↓↓"); //盤面の変化を矢印で示す
        move.playerinput();
    }

    public void swap(int s, int t) {
        //隣り合ったマスを入れ替えるメソッド
        int p;
        zero = t;

        p = arrayboard[s];
        arrayboard[s] = arrayboard[t];
        arrayboard[t] = p;
    }

    public int getZero() {
        return zero;
    } //０の位置を取るためのゲッター
}