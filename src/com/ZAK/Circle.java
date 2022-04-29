package com.ZAK;

public class Circle {
    public double radius;
    public String color;

    Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return 2*3.14*radius;
    }
}
