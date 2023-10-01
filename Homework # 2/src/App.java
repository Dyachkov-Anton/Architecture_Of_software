import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.GemGenerator;
import Fabric.GoldChestGenerator;
import Fabric.GoldGenerator;
import Fabric.GunGenerator;
import Fabric.ItemGenerator;
import Fabric.PotatoGenerator;
import Fabric.SilverGenerator;
import Fabric.BottleOfManaGenerator;
import Fabric.EmptyGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        List<ItemGenerator> listOfGenerators = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            listOfGenerators.add(new EmptyGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listOfGenerators.add(new GoldChestGenerator());
        }

        for (int i = 0; i < 7; i++) {
            listOfGenerators.add(new PotatoGenerator());
        }

        for (int i = 0; i < 10; i++) {
            listOfGenerators.add(new GemGenerator());
            listOfGenerators.add(new GunGenerator());
        }
        for (int i = 0; i < 20; i++) {
            listOfGenerators.add(new GoldGenerator());
            listOfGenerators.add(new BottleOfManaGenerator());
        }
        for (int i = 0; i < 40; i++) {
            listOfGenerators.add(new SilverGenerator());
        }

        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            int index = random.nextInt(110);
            listOfGenerators.get(index).openReward();
        }
    }
}
