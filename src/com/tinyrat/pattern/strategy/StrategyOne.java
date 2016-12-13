package com.tinyrat.pattern.strategy;

/**
 * Created by Administrator on 2016/12/13.
 */
public class StrategyOne implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        double score = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        score = sum / a.length;
        return score;
    }
}
