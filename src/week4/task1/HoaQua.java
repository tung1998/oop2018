package week4.task1;

public class HoaQua {
    int price;
    double size;
    String color;


    public HoaQua(int price, double size, String color) {
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public HoaQua(HoaQua h) {
        this(h.price, h.size, h.color);
    }

    public HoaQua() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}