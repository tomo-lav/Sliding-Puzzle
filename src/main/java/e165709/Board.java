package e165709;

import java.util.ArrayList;

//盤面のクラス
/*

*/
public class Board {
    int[] a = new int[10];
    int zero;
    public void board(){
        //int[] a = new int[10];

        for (int i = 1; i <= 9; i++){
            a[i-1] = i - 1;
            System.out.printf(" %d",a[i-1]);
            if (i % 3 == 0){
                System.out.printf("\n");
            }
        }
        zero = a[0];
    }

    public void swap(int s,int t){
        int p;
        zero = a[t];
        
        p = a[s];
        a[s] = a[t];
        a[t] = p;
    }
    public void up(){
        swap(zero,zero-3);
    }
    public void down(){
        swap(zero,zero+3);
    }
    public void right(){
        swap(zero,zero+1);
    }
    public void left(){
        swap(zero,zero-1);
    }
}
