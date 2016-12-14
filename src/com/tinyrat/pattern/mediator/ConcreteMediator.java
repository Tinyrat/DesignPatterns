package com.tinyrat.pattern.mediator;

/**
 * Created by Administrator on 2016/12/14.
 */
public class ConcreteMediator {
    ColleagueA colleagueA;
    ColleagueB colleagueB;
    ColleagueC colleagueC;

    public void registerColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void registerColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public void registerColleagueC(ColleagueC colleagueC) {
        this.colleagueC = colleagueC;
    }

    public void deliverMess(Colleague colleague, String[] mess) {
        if (colleague == colleagueA) {
            colleagueB.receiveMess(colleague.getName() + mess[0]);
            colleagueC.receiveMess(colleague.getName() + mess[1]);
        } else if (colleague == colleagueB) {
            colleagueA.receiveMess(colleague.getName() + mess[0]);
            colleagueC.receiveMess(colleague.getName() + mess[0]);
        } else if (colleague == colleagueC) {
            colleagueA.receiveMess(colleague.getName() + mess[0]);
            colleagueB.receiveMess(colleague.getName() + mess[0]);
        }
    }
}
