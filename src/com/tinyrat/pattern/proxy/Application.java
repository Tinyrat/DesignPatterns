package com.tinyrat.pattern.proxy;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Application {
    public static void main(String[] args) {
        double a = 10, b = 15, c = 16;
        TriangleProxy proxy = new TriangleProxy();
        proxy.setABC(a, b, c);
        System.out.println("面积是：" + proxy.getArea());
    }
}
