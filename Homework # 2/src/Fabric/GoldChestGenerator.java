package Fabric;

import Interface.IGameItem;
import Product.GoldChest;

public class GoldChestGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
       return new GoldChest();
    }
    
}
