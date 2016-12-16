package com.tinyrat.pattern.visitor;

/**
 * Created by Administrator on 2016/12/16.
 */
public interface Visitor {
    public void visit(Undergraduate stu);
    public void visit(GraduateStudent stu);
}
