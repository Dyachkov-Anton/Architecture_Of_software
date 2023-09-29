package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Poligon;
import Stuff.Texture;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List <Texture> textures;

    public PoligonalModel() {
        this.poligons = new ArrayList<Poligon>();
    }
}
