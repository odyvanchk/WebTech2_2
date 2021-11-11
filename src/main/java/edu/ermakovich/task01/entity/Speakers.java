package main.java.edu.ermakovich.task01.entity;

/**
 * The type Speakers.
 */
public class Speakers extends Appliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private float frequencyRangeMin;
    private float frequencyRangeMax;
    private int cordLength;

    /**
     * Gets power consumption.
     *
     * @return the power consumption
     */
    public int getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Sets power consumption.
     *
     * @param powerConsumption the power consumption
     */
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Gets number of speakers.
     *
     * @return the number of speakers
     */
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * Sets number of speakers.
     *
     * @param numberOfSpeakers the number of speakers
     */
    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    /**
     * Gets frequency range min.
     *
     * @return the frequency range min
     */
    public float getFrequencyRangeMin() {
        return frequencyRangeMin;
    }

    /**
     * Sets frequency range min.
     *
     * @param frequencyRangeMin the frequency range min
     */
    public void setFrequencyRangeMin(float frequencyRangeMin) {
        this.frequencyRangeMin = frequencyRangeMin;
    }

    /**
     * Gets frequency range max.
     *
     * @return the frequency range max
     */
    public float getFrequencyRangeMax() {
        return frequencyRangeMax;
    }

    /**
     * Sets frequency range max.
     *
     * @param frequencyRangeMax the frequency range max
     */
    public void setFrequencyRangeMax(float frequencyRangeMax) {
        this.frequencyRangeMax = frequencyRangeMax;
    }

    /**
     * Gets cord length.
     *
     * @return the cord length
     */
    public int getCordLength() {
        return cordLength;
    }

    /**
     * Sets cord length.
     *
     * @param cordLength the cord length
     */
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
