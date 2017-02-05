package e165709;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

//盤面のクラス

public class Board {
    private int[] arrayboard = new int[10];
    Move move = new Move();
    Shuffle shuffle = new Shuffle();
    private int zero;

    public void makeboard() {

        for (int i = 1; i <= 9; i++) {
            arrayboard[i - 1] = i - 1;
            System.out.printf(" %d", arrayboard[i - 1]);
            if (i % 3 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("Enter to start shuffle");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        shuffle.shuffle();

        System.out.println("Let's go!");
        zero = arrayboard[0];
    }

    public void printboard() {
        for (int i = 1; i <= 9; i++) {
            System.out.printf(" %d", arrayboard[i - 1]);
            if (i % 3 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("　↓↓↓");
        move.playerinput();
    }

    public void swap(int s, int t) {
        int p;
        zero = t;

        p = arrayboard[s];
        arrayboard[s] = arrayboard[t];
        arrayboard[t] = p;
    }

    public int getZero() {
        return zero;
    }
}