package Fabric;

import Interface.IGameItem;
import Product.BottleOfMana;

public class BottleOfManaGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
       return new BottleOfMana();
    }
    
}
