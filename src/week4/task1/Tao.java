package week4.task1;

public class Tao extends HoaQua {

    public Tao(int price, double size) {
        super(price, size, "red");
    }
    public Tao(Tao t) {
        this(t.price, t.size);
    }
    public Tao() {
    }


}