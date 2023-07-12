package sample;

public class Dice {
    private int face;
    public Dice(){

    }

    public Dice(int face){
        this.face = face;
    }

    public int getNumber(){
        return (int)(Math.random() * face)+1;
    }
}
