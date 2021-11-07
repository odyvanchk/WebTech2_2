package main.java.edu.ermakovich.task01.entity;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private float weight;
    private float freezerCapacity;
    private float overallCapacity;
    private float height;
    private float width;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + price + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
