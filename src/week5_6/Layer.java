package week5_6;
import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void PrintShape(){
        for(int i = 0; i < shapes.size(); i++){
            System.out.println(shapes.get(i).getName());
        }
    }

    public void DeleteTriangle(){
        for(int i = 0; i < shapes.size(); i++){
            if(getShapes().get(i) instanceof Triangle){
                getShapes().remove(i);
                i--;
            }
        }
    }
}
