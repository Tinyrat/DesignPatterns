package com.tinyrat.pattern.strategy;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Application {
    public static void main(String[] args) {
        GymnasticsGame game = new GymnasticsGame();
        game.setStrategy(new StrategyOne());
        double[] a = {9.12, 9.25, 8.87, 9.99, 6.99, 7.88};
        System.out.println("strategy1:" + game.getScore(a));
        game.setStrategy(new StrategyTwo());
        System.out.println("strategy2:" + game.getScore(a));
    }
}
