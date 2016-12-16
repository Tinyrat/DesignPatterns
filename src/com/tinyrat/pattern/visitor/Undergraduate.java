package com.tinyrat.pattern.visitor;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Undergraduate extends Student {
    double math, english;
    String name;

    Undergraduate(String name, double math, double english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
