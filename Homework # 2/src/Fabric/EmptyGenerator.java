package Fabric;

import Interface.IGameItem;
import Product.Empty;

public class EmptyGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
       return new Empty();
    }
    
}
