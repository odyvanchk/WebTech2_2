package main.java.edu.ermakovich.task01.entity;

import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.enums.Color;

/**
 * The type Teapot.
 */
public class Teapot extends Appliance {
    private Color color;
    private double volume;
    private boolean hasWhistle;


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

    /**
     * Gets volume.
     *
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets volume.
     *
     * @param volume the volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets has whistle.
     *
     * @return the has whistle
     */
    public boolean getHasWhistle() {
        return hasWhistle;
    }

    /**
     * Sets has whistle.
     *
     * @param whistle the whistle
     */
    public void setHasWhistle(boolean whistle) {
        this.hasWhistle = whistle;
    }


    @Override
    public String toString() {
        return "Teapot{" +
                "price=" + price +
                ", color=" + color +
                ", volume=" + volume +
                ", whistle=" + hasWhistle +
                '}';
    }
}
