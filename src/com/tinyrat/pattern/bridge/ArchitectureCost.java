package com.tinyrat.pattern.bridge;

/**
 * Created by Administrator on 2016/12/15.
 */
public abstract class ArchitectureCost {
    BuildingDesign design;
    double unitPrice;
    public abstract double giveCost();
}
