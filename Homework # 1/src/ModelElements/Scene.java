package ModelElements;

import java.util.ArrayList;
import java.util.List;

//public class Scene {
    //public int id;
    //public List<PoligonalModel> models;
    //public List<Flash> flashes;
    //public List<Camera> cameras;
    //public Scene() {
        //this.models = new ArrayList<PoligonalModel>();
        //this.cameras = new ArrayList<Camera>();
    //}
//Реализовать методы
//}

public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
    this.ID = id;
    if (models.size() > 0) {
        this.Models = models;
    } else {
        throw new Exception("Должна быть одна модель");
    }
    this.Flashes = flashes;
    if (cameras.size() > 0) {
        this.cameras = cameras;
    } else {
        throw new Exception("Должна быть одна камера");
    }
}

public <T> T method1(T flash) {
    return flash;
}

public <T, E> T method2(T Model, E Flash) {
    return Model;
}

// /**
// * заглушка
// */
// public Type1 method1(Type1 t) {
// return t;
// }

// /**
// * заглушка
// */
// public Type1 method1(Type1 t1, Type2 t2) {
// return t1;
// }
