package main.java.edu.ermakovich.task01.entity;

/**
 * The type Vacuum cleaner.
 */
public class VacuumCleaner extends Appliance{
	private float powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private float motorSpeedRegulation;
    private float cleaningWidth;

    /**
     * Gets power consumption.
     *
     * @return the power consumption
     */
    public float getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Sets power consumption.
     *
     * @param powerConsumption the power consumption
     */
    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Gets filter type.
     *
     * @return the filter type
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * Sets filter type.
     *
     * @param filterType the filter type
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * Gets bag type.
     *
     * @return the bag type
     */
    public String getBagType() {
        return bagType;
    }

    /**
     * Sets bag type.
     *
     * @param bagType the bag type
     */
    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    /**
     * Gets wand type.
     *
     * @return the wand type
     */
    public String getWandType() {
        return wandType;
    }

    /**
     * Sets wand type.
     *
     * @param wandType the wand type
     */
    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    /**
     * Gets motor speed regulation.
     *
     * @return the motor speed regulation
     */
    public float getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    /**
     * Sets motor speed regulation.
     *
     * @param motorSpeedRegulation the motor speed regulation
     */
    public void setMotorSpeedRegulation(float motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    /**
     * Gets cleaning width.
     *
     * @return the cleaning width
     */
    public float getCleaningWidth() {
        return cleaningWidth;
    }

    /**
     * Sets cleaning width.
     *
     * @param cleaningWidth the cleaning width
     */
    public void setCleaningWidth(float cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "price=" + price + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
