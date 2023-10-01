package Fabric;

import Interface.IGameItem;
import Product.Potato;

public class PotatoGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Potato();
    }
    
}
