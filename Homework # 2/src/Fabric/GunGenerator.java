package Fabric;

import Interface.IGameItem;
import Product.Gun;

public class GunGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
       return new Gun();
    }
    
}
