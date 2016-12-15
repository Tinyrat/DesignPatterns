package com.tinyrat.pattern.composite;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/15.
 */
public interface MilitaryPerson {
    public void add(MilitaryPerson person);

    public void remove(MilitaryPerson person);

    public MilitaryPerson getChild(int index);

    public Iterator<MilitaryPerson> getAllChildren();

    public boolean isLeaf();

    public double getSalary();

    public void setSalary(double salary);
}
