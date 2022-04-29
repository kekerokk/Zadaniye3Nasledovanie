package com.ZAK;

public class Cylinder extends Circle{

    public double height;

    Cylinder(double radius) {
        super(radius);
        height = 1;
    }
    Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        return 3.14*(radius*radius)*height;
    }
    public String toString()
    {
        return "Radius: + " + radius + "\nHeight: " + height + "\nVolume: " + getVolume();
    }
}
