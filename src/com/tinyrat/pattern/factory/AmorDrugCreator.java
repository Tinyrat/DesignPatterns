package com.tinyrat.pattern.factory;

/**
 * Created by Administrator on 2016/12/15.
 */
public class AmorDrugCreator implements DrugCreator {
    @Override
    public Drug getDrug() {
        int[] a = {200, 5};
        return new Amorolfine("甲硝唑胶囊", a);
    }
}
