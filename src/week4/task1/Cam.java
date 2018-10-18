package week4.task1;

public class Cam extends HoaQua {

    String giong;

    public Cam(int price, double size, String giong) {
        super(price, size, "orange");
        this.giong = giong;
    }

    public Cam(Cam c) {
        this(c.getUnitPrice(), c.getSize(), c.getGiong());
    }

    public Cam() {
    }
    /**
     * @getter-setter
     */
    public String getGiong() {
        return this.giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }
}