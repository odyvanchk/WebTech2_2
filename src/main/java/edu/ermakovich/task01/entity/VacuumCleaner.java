package main.java.edu.ermakovich.task01.entity;

public class VacuumCleaner extends Appliance{
	private float powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private float motorSpeedRegulation;
    private float cleaningWidth;

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public float getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(float motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public float getCleaningWidth() {
        return cleaningWidth;
    }

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
