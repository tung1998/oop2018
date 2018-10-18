package week4.task1;

public class CamCaoPhong extends Cam{


    public CamCaoPhong(int UPrice, double size) {
        super(UPrice, size, "Cam Cao Phong" );
    }

    public CamCaoPhong(CamCaoPhong c) {
        this(c.getUnitPrice(), c.getSize());
    }

    public CamCaoPhong() {
    }



}