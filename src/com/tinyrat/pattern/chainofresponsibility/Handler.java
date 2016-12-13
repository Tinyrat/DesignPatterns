package com.tinyrat.pattern.chainofresponsibility;

/**
 * Created by Administrator on 2016/12/13.
 */
public interface Handler {
    public abstract void computerMultiply(String number);
    public abstract void setNextHandler(Handler handler);
}
