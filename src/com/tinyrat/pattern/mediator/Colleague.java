package com.tinyrat.pattern.mediator;

/**
 * Created by Administrator on 2016/12/14.
 */
public interface Colleague {
    public void giveMess(String[] mess);
    public void receiveMess(String mess);
    public void setName(String name);
    public String getName();
}
