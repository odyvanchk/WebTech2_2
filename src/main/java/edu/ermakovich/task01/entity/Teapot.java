package main.java.edu.ermakovich.task01.entity;

import main.java.edu.ermakovich.task01.entity.Appliance;
import main.java.edu.ermakovich.task01.entity.enums.Color;

public class Teapot extends Appliance {
    private Color color;
    private double volume;
    private boolean hasWhistle;


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean getHasWhistle() {
        return hasWhistle;
    }

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
