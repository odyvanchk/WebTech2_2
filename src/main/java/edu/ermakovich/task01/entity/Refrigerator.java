package main.java.edu.ermakovich.task01.entity;

/**
 * The type Refrigerator.
 */
public class Refrigerator extends Appliance{
    private int powerConsumption;
    private float weight;
    private float freezerCapacity;
    private float overallCapacity;
    private float height;
    private float width;

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
     * Gets weight.
     *
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Gets freezer capacity.
     *
     * @return the freezer capacity
     */
    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * Sets freezer capacity.
     *
     * @param freezerCapacity the freezer capacity
     */
    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    /**
     * Gets overall capacity.
     *
     * @return the overall capacity
     */
    public float getOverallCapacity() {
        return overallCapacity;
    }

    /**
     * Sets overall capacity.
     *
     * @param overallCapacity the overall capacity
     */
    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
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
