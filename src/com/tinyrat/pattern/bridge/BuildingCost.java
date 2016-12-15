package com.tinyrat.pattern.bridge;

/**
 * Created by Administrator on 2016/12/15.
 */
public class BuildingCost extends ArchitectureCost {
    BuildingCost(BuildingDesign design, double unitPrice) {
        this.design = design;
        this.unitPrice = unitPrice;
    }

    @Override
    public double giveCost() {
        double area = design.computerArea();
        return area * unitPrice;
    }
}
