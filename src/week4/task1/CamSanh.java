package week4.task1;


public class CamSanh extends Cam {

    public CamSanh(int price, double size) {
        super(price, size, "Cam Sanh");
    }

    public CamSanh(CamSanh c) {
        this(c.price, c.size);
    }

    public CamSanh() {

    }


}