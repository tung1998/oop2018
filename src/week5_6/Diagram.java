package week5_6;
import java.util.ArrayList;



public class Diagram {
    private ArrayList<Layer> layers = new ArrayList<Layer>();

    public ArrayList<Layer> getLayers() {
        return layers;
    }
    public void addLayer(Layer layer){
        layers.add(layer);
    }
    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public void DeleteCircle(){
        for (int i = 0; i < layers.size(); i++){
            for(int j = 0; j < layers.get(i).getShapes().size(); j++){
                if(layers.get(i).getShapes().get(j) instanceof Circle){
                    layers.get(i).getShapes().remove(j);
                    j--;
                }
            }
        }
    }
}
