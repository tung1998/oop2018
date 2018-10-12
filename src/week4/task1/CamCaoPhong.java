package week4.task1;

public class CamCaoPhong extends Cam{
    public CamCaoPhong(int price, double size) {
        super(price, size, "Cam Cao Phong" );
    }

    public CamCaoPhong(CamCaoPhong c) {
        this(c.price, c.size);
    }

    public CamCaoPhong() {
    }
}