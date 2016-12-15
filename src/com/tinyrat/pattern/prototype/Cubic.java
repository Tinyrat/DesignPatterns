package com.tinyrat.pattern.prototype;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Cubic implements Prototype, Cloneable {
    double length, width, height;

    Cubic(double a, double b, double c) {
        this.length = a;
        this.width = b;
        this.height = c;
    }

    @Override
    public Object cloneMe() throws CloneNotSupportedException {
        Cubic object = (Cubic) clone();
        return object;
    }
}
