package com.tinyrat.pattern.visitor;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Company implements Visitor {
    @Override
    public void visit(Undergraduate stu) {
        double math = stu.getMath();
        double english = stu.getEnglish();
        if (math > 80 && english > 90) {
            System.out.println(stu.getName() + "被录用");
        }
    }

    @Override
    public void visit(GraduateStudent stu) {
        double math = stu.getMath();
        double english = stu.getEnglish();
        double physics = stu.getPhysics();
        if (math > 80 && english > 90 && physics > 70) {
            System.out.println(stu.getName() + "被录用");
        }
    }
}
