package week5_6;

public class Rectangle extends Shape {
    private final String name = "Rectangle";
    protected double width;
    protected double hight;

    public Rectangle(double width, double hight, String color) {
        super(color);
        this.width = width;
        this.hight = hight;
    }

    Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getName() {
        return name;
    }
}
