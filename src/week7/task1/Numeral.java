package week7.task1;

public class Numeral extends Expression{
    private int value;

    public Numeral(int a){
        value = a;
    }

    public Numeral(){
        value = 0;
    }

    @Override
    public String toString(){
        return Integer.toString(value);
    }
    @Override
    public int evaluate() {
        return value;
    }
}