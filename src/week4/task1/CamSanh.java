package week4.task1;


public class CamSanh extends Cam {

    public CamSanh(int uprice, double size) {
        super(uprice, size, "Cam Sanh");
    }

    public CamSanh(CamSanh c) {
        this(c.getUnitPrice(), c.getSize());
    }

    public CamSanh() {

    }


}