package com.tinyrat.pattern.strategy;

/**
 * Created by Administrator on 2016/12/13.
 */
public class StrategyTwo implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        double score = 0, multi = 1;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            multi *= a[i];
        }
        score = Math.pow(multi, 1.0 / n);
        return score;
    }
}
