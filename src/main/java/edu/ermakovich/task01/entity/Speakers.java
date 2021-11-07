package main.java.edu.ermakovich.task01.entity;

public class Speakers extends Appliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private float frequencyRangeMin;
    private float frequencyRangeMax;
    private int cordLength;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public float getFrequencyRangeMin() {
        return frequencyRangeMin;
    }

    public void setFrequencyRangeMin(float frequencyRangeMin) {
        this.frequencyRangeMin = frequencyRangeMin;
    }

    public float getFrequencyRangeMax() {
        return frequencyRangeMax;
    }

    public void setFrequencyRangeMax(float frequencyRangeMax) {
        this.frequencyRangeMax = frequencyRangeMax;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "price=" + price + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRangeMin=" + frequencyRangeMin +
                ", frequencyRangeMax=" + frequencyRangeMax +
                ", cordLength=" + cordLength +
                '}';
    }
}
