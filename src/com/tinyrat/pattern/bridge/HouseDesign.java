package com.tinyrat.pattern.bridge;

/**
 * Created by Administrator on 2016/12/15.
 */
public class HouseDesign implements BuildingDesign {
    double width, length;
    int floorNumber;

    HouseDesign(double width, double length, int floorNumber) {
        this.width = width;
        this.length = length;
        this.floorNumber = floorNumber;
    }

    @Override
    public double computerArea() {
        return width * length * floorNumber;
    }
}
