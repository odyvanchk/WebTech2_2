package main.java.edu.ermakovich.task01.entity;

import main.java.edu.ermakovich.task01.entity.enums.Color;

public class TabletPC extends Appliance{
    private float batteryCapacity;
    private int displayInches;
    private float memoryRom;
    private float flashMemoryCapacity;
    private Color color;

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public float getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(float memoryRom) {
        this.memoryRom = memoryRom;
    }

    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public Color getColor() {
        return color;
    }

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
