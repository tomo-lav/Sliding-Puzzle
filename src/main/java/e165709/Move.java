package e165709;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Move extends Shuffle {

    @Override
    public void up(){
        if(getZero()-3 < 0){
            System.out.println("Out of board");
        }else{
            swap(getZero(), getZero()-3);
        }
    }

    @Override
    public void down(){
        if(getZero()+3 > 8){
            System.out.println("Out of board");
        }else{
            swap(getZero(),getZero()+3);
        }
    }

    @Override
    public void right(){
        if(getZero()%3 == 2){
            System.out.println("Out of board");
        }else{
            swap(getZero(),getZero()+1);
        }
    }

    @Override
    public void left(){
        if(getZero()%3 == 0){
            System.out.println("Out of board");
        }else{
            swap(getZero(),getZero()-1);
        }
    }

    public void playerinput() {
        int key;

        try {
            Scanner in = new Scanner(System.in);
            key = in.nextInt();

            if (key == 1) {
                up();
            } else if (key == 2) {
                down();
            } else if (key == 3) {
                right();
            } else if (key == 4) {
                left();
            } else {
                System.out.println("plz use 1,2,3,4.\n 1:up, 2:down, 3:right, 4:left.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("cannot move");
        } catch (InputMismatchException e) {
            System.out.println("plz use 1,2,3,4.\n 1:up, 2:down, 3:right, 4:left.");
        }
    }
}
