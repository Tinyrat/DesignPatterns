package com.tinyrat.pattern.decorator;

/**
 * Created by Administrator on 2016/12/13.
 */
public abstract class Decorator extends ReadWord {
    protected ReadWord reader;

    public Decorator() {
    }

    public Decorator(ReadWord reader) {
        this.reader = reader;
    }
}
