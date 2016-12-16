package com.tinyrat.pattern.proxy;

/**
 * Created by Administrator on 2016/12/16.
 */
public class TriangleProxy implements Geomotry {
    double sideA, sideB, sideC;
    Triangle triangle;

    public void setABC(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    public double getArea() {
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            triangle = new Triangle(sideA, sideB, sideC);
            return triangle.getArea();
        } else {
            return -1;
        }
    }
}
