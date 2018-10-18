package week5_6;


public class Main{

    public static void main(String[] args){
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();

        layer1.addShape(new Circle());
        layer1.addShape(new Rectangle());
        layer1.addShape(new Square());
        layer1.addShape(new Triangle());
        layer1.addShape(new Triangle());

        layer2.addShape(new Circle());
        layer2.addShape(new Rectangle());
        layer2.addShape(new Square());
        layer2.addShape(new Circle());
        layer2.addShape(new Triangle());

        diagram.addLayer(layer1);
        diagram.addLayer(layer2);

        System.out.println("layer1: ");
        layer1.PrintShape();
        System.out.println("layer2: ");
        layer2.PrintShape();

        layer1.DeleteTriangle();//chỉ xóa ở lay1
        System.out.println("Delete triangle");
        System.out.println("layer1: ");
        layer1.PrintShape();
        System.out.println("layer2: ");
        layer2.PrintShape();

        System.out.println("Delete circle: ");
        diagram.DeleteCircle();
        System.out.println("layer1: ");
        layer1.PrintShape();
        System.out.println("layer2: ");
        layer2.PrintShape();
    }
}
