package main.java.edu.ermakovich.task01.entity;

import main.java.edu.ermakovich.task01.entity.enums.Color;

/**
 * The type Tablet pc.
 */
public class TabletPC extends Appliance{
    private float batteryCapacity;
    private int displayInches;
    private float memoryRom;
    private float flashMemoryCapacity;
    private Color color;

    /**
     * Gets battery capacity.
     *
     * @return the battery capacity
     */
    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Sets battery capacity.
     *
     * @param batteryCapacity the battery capacity
     */
    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Gets display inches.
     *
     * @return the display inches
     */
    public int getDisplayInches() {
        return displayInches;
    }

    /**
     * Sets display inches.
     *
     * @param displayInches the display inches
     */
    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    /**
     * Gets memory rom.
     *
     * @return the memory rom
     */
    public float getMemoryRom() {
        return memoryRom;
    }

    /**
     * Sets memory rom.
     *
     * @param memoryRom the memory rom
     */
    public void setMemoryRom(float memoryRom) {
        this.memoryRom = memoryRom;
    }

    /**
     * Gets flash memory capacity.
     *
     * @return the flash memory capacity
     */
    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    /**
     * Sets flash memory capacity.
     *
     * @param flashMemoryCapacity the flash memory capacity
     */
    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC {" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                '}';
    }
}
