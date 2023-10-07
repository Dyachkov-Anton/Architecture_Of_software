package Classes;

import java.awt.Color;

import Enumerators.BodyType;
import Enumerators.FuelType;
import Enumerators.TransmissionType;
import Interfaces.ICarWiping;
import Interfaces.IFuelStaion;

public class Pickup extends Car implements IFuelStaion, ICarWiping {
    public Pickup(String make, String model, Color color , int wheelNumber, TransmissionType transmissionType, FuelType fuelType, float engineVolume, float loadCapacity) {
        super(make, model, color, BodyType.PICKUP, wheelNumber, transmissionType, fuelType, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    private float loadCapacity;

    @Override
    public void wipeWindSheald() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipeWindSheald'");
    }

    @Override
    public void wipeHeadLights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipeHeadLights'");
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }
    
}
