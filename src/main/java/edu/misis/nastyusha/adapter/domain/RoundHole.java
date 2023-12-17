package edu.misis.nastyusha.adapter.domain;

public class RoundHole {

    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundStick stick) {
        return this.getRadius() >= stick.getRadius();
    }

}
