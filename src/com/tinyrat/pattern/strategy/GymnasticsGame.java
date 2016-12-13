package com.tinyrat.pattern.strategy;

/**
 * Created by Administrator on 2016/12/13.
 */
public class GymnasticsGame {
    ComputableStrategy strategy;

    public void setStrategy(ComputableStrategy strategy) {
        this.strategy = strategy;
    }

    public double getScore(double[] a) {
        if (strategy != null) {
            return strategy.computeScore(a);
        } else {
            return 0;
        }
    }
}
