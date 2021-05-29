package com.foxmula.assignment1;

public class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(CoordinatePair p1, CoordinatePair p2, CoordinatePair p3, CoordinatePair p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    public double Area(){
        double base = super.LengthOfTheSide();
        double area = base * this.height;

        return area;
    }
}
