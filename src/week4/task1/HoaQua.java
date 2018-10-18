package week4.task1;

public class HoaQua {
    int UPrice;
    double size;
    String color;


    public HoaQua(int price, double size, String color) {
        this.UPrice = UPrice;
        this.size = size;
        this.color = color;
    }

    public HoaQua(HoaQua h) {
        this(h.UPrice, h.size, h.color);
    }

    public HoaQua() {
    }
    /**
     * @getter-setter
     */
    public int getUnitPrice() {
        return this.UPrice;
    }

    public double getSize() {
        return this.size;
    }
    public String getColor()
    {
        return this.color;
    }

    public void setUnitPrice(int uPrice) {
        this.UPrice = uPrice;
    }

    public void setSize(double size) {
        this.size = size;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void printf(){
        System.out.println("Loai qua nay co mau: "+this.getColor()+ ", co kich co: " +this.getSize()+", co don gia: "+this.getUnitPrice());
    }
}