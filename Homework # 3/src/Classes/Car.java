package Classes;

import java.awt.Color;

import Enumerators.BodyType;
import Enumerators.FuelType;
import Enumerators.TransmissionType;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private BodyType bodyType;
    private int wheelNumber;
    private TransmissionType transmissionType;
    private FuelType fuelType;
    private float engineVolume;

    public Car(String make, String model, Color color, BodyType bodyType, int wheelNumber,
            TransmissionType transmissionType, FuelType fuelType, float engineVolume) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.wheelNumber = wheelNumber;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.engineVolume = engineVolume;
    }

    public void movement() {
    }

    public void maintaince() {
    }

    public boolean lightsOn() {
        return true;
    }

    public boolean wrappersOn() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

}
