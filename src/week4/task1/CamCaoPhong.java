package week4.task1;

/**
 * This class represent the orange
 * @author xxNguyenxx
 */
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