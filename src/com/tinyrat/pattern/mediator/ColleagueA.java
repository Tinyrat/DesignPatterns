package com.tinyrat.pattern.mediator;

/**
 * Created by Administrator on 2016/12/14.
 */
public class ColleagueA implements Colleague {
    ConcreteMediator mediator;
    String name;

    ColleagueA(ConcreteMediator mediator) {
        this.mediator = mediator;
        mediator.registerColleagueA(this);
    }

    @Override
    public void giveMess(String[] mess) {
        mediator.deliverMess(this, mess);
    }

    @Override
    public void receiveMess(String mess) {
        System.out.println(name + "收到的信息：");
        System.out.println("\t" + mess);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
