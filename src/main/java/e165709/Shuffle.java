package e165709;

import java.util.Random;

public class Shuffle extends Board{
    public void shuffle(){
        Random rnd = new Random();

        for (int i = 0;i < 100; i++){
            int ran = rnd.nextInt(8);
            switch(ran){
                case 0:
                case 1:
                    up();
                    break;
                case 2:
                case 3:
                    down();
                    break;
                case 4:
                case 5:
                    right();
                    break;
                case 6:
                case 7:
                    left();
            }
        }
    }

    public void up(){
        if(getZero()-3 < 0){

        }else{
            swap(getZero(), getZero()-3);
        }
    }
    public void down(){
        if(getZero()+3 > 8){

        }else{
            swap(getZero(),getZero()+3);
        }
    }
    public void right(){
        if(getZero()%3 == 2){

        }else{
            swap(getZero(),getZero()+1);
        }
    }
    public void left(){
        if(getZero()%3 == 0){

        }else{
            swap(getZero(),getZero()-1);
        }
    }
}
