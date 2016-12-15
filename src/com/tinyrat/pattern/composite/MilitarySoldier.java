package com.tinyrat.pattern.composite;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/15.
 */
public class MilitarySoldier implements MilitaryPerson {
    String name;
    double salary;

    MilitarySoldier(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(MilitaryPerson person) {
    }

    @Override
    public void remove(MilitaryPerson person) {
    }

    @Override
    public MilitaryPerson getChild(int index) {
        return null;
    }

    @Override
    public Iterator<MilitaryPerson> getAllChildren() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
