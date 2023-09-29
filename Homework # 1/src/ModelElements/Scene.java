package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;
    public Scene() {
        this.models = new ArrayList<PoligonalModel>();
        this.cameras = new ArrayList<Camera>();
    }
//Реализовать методы
}
