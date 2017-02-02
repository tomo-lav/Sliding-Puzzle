package e165709;

import java.util.ArrayList;

//盤面のクラス
/*

*/
public class Board {
    public void board(){
        int[] a = new int[10];

        for (int i = 1; i <= 9; i++){
            a[i] = i - 1;
            System.out.printf(" %d",a[i]);
            if (i % 3 == 0){
                System.out.printf("\n");
            }
        }
    }




    /*
    public void board(){
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
    */
}
