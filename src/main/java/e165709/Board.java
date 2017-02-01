package e165709;
//盤面のクラス
/*

*/
public class Board {
    private int[][] board = new int [3][3];

    public void board(){
        int a = 0;
        for (int i = 0; i < 3; i++){
            for (int n = 0; n < 3; n++){
                board[i][n] = a;
                a++;
            }
        }
        //System.out.println(board[i][n]);


    }

}
