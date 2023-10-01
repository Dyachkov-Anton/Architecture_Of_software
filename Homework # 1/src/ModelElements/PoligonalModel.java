package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Poligon;
import Stuff.Texture;

//public class PoligonalModel {
    //public List<Poligon> poligons;
    //public List <Texture> textures;

    //public PoligonalModel() {
        //this.poligons = new ArrayList<Poligon>();
    //}
//}


public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;
    
    public PoligonalModel(List<Texture> Textures) {
        this.Poligons = new ArrayList<>();
        this.Textures = Textures;
    
        this.Poligons.add(new Poligon(new Point3D()));
    }
}