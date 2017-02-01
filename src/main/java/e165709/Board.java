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
                System.out.println(board[i][n]);
            }
        }
    }
    public void printboard(){
        int[][] a = {{0,1,2},{3,4,5},{6,7,8}};

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (column == 2) {
                    System.out.printf(" %d\n", a[row][column]);
                } else {
                    System.out.printf(" %d", a[row][column]);
                }
            }
        }
    }
}
