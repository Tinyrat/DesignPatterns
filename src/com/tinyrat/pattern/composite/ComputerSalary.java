package com.tinyrat.pattern.composite;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ComputerSalary {
    public static double computerSalary(MilitaryPerson person) {
        double sum = 0;
        if (person.isLeaf()) {
            sum += person.getSalary();
        } else {
            sum += person.getSalary();
            Iterator<MilitaryPerson> iterator = person.getAllChildren();
            while (iterator.hasNext()) {
                MilitaryPerson p = iterator.next();
                sum += computerSalary(p);
            }
        }
        return sum;
    }
}
