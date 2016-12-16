package com.tinyrat.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Application {
    public static void main(String[] args) {
        Visitor visitor = new Company();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Undergraduate("张三", 67, 88));
        students.add(new Undergraduate("李四", 90, 98));
        students.add(new Undergraduate("王五", 85, 92));
        students.add(new GraduateStudent("马六", 88, 70, 87));
        students.add(new GraduateStudent("七七", 90, 95, 82));
        students.add(new GraduateStudent("八八", 88, 77, 99));
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student stu = iterator.next();
            stu.accept(visitor);
        }
    }
}
