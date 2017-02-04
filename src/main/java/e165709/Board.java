package e165709;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//盤面のクラス
/*

*/
public class Board {
    int[] arrayboard = new int[10];
    int zero;
    public void makeboard(){

        for (int i = 1; i <= 9; i++){
            arrayboard[i-1] = i - 1;
            System.out.printf(" %d",arrayboard[i-1]);
            if (i % 3 == 0){
                System.out.printf("\n");
            }
        }
        System.out.println("Let's go!");
        zero = arrayboard[0];
    }

    public void printboard(){
        for (int i = 1; i <= 9; i++){
            System.out.printf(" %d",arrayboard[i-1]);
            if (i % 3 == 0){
                System.out.printf("\n");
            }
        }
        System.out.println("　↓↓↓");
        playerinput();
    }

    public void playerinput(){
        int key;

        try{
            Scanner in = new Scanner(System.in);
            key = in.nextInt();

            if (key == 1){
                up();
            }else if (key == 2){
                down();
            }else if (key == 3){
                right();
            }else if (key == 4){
                left();
            }else{
                System.out.println("plz use 1,2,3,4.\n 1:up, 2:down, 3:right, 4:left.");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("cannot move");
        }catch(InputMismatchException e){
            System.out.println("plz use 1,2,3,4.\n 1:up, 2:down, 3:right, 4:left.");
        }
    }

    public void swap(int s,int t){
        int p;
        zero = t;

        p = arrayboard[s];
        arrayboard[s] = arrayboard[t];
        arrayboard[t] = p;
    }
    public void up(){
        if(zero-3 < 0){
            System.out.println("Out of board");
        }else{
            swap(zero,zero-3);
        }
    }
    public void down(){
        if(zero+3 > 8){
            System.out.println("Out of board");
        }else{
            swap(zero,zero+3);
        }
    }
    public void right(){
        if(zero%3 == 2){
            System.out.println("Out of board");
        }else{
            swap(zero,zero+1);
        }
    }
    public void left(){
        if(zero%3 == 0){
            System.out.println("Out of board");
        }else{
            swap(zero,zero-1);
        }
    }
}
