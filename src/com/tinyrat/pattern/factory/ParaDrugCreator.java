package com.tinyrat.pattern.factory;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ParaDrugCreator implements DrugCreator {
    @Override
    public Drug getDrug() {
        int[] a = {250, 15, 1, 10};
        return new Paracetamol("氨加黄敏胶囊", a);
    }
}
