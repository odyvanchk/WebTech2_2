package main.java.edu.ermakovich.task01.entity;

import main.java.edu.ermakovich.task01.entity.enums.OS;

/**
 * The type Laptop.
 */
public class Laptop extends Appliance{
    private float batteryCapacity;
    private OS os;
    private int memoryRom;
    private int systemMemory;
    private float cpu;
    private int displayInches;


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
     * Gets os.
     *
     * @return the os
     */
    public OS getOs() {
        return os;
    }

    /**
     * Sets os.
     *
     * @param os the os
     */
    public void setOs(OS os) {
        this.os = os;
    }

    /**
     * Gets memory rom.
     *
     * @return the memory rom
     */
    public int getMemoryRom() {
        return memoryRom;
    }

    /**
     * Sets memory rom.
     *
     * @param memoryRom the memory rom
     */
    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    /**
     * Gets system memory.
     *
     * @return the system memory
     */
    public int getSystemMemory() {
        return systemMemory;
    }

    /**
     * Sets system memory.
     *
     * @param systemMemory the system memory
     */
    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    /**
     * Gets cpu.
     *
     * @return the cpu
     */
    public float getCpu() {
        return cpu;
    }

    /**
     * Sets cpu.
     *
     * @param cpu the cpu
     */
    public void setCpu(float cpu) {
        this.cpu = cpu;
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

    @Override
    public String toString() {
        return "Laptop {" +
                "price=" + price + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", os=" + os +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
