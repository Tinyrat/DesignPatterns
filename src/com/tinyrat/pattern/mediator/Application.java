package com.tinyrat.pattern.mediator;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Application {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);
        ColleagueC colleagueC = new ColleagueC(mediator);
        colleagueA.setName("A国");
        colleagueB.setName("B国");
        colleagueC.setName("C国");
        String[] messA = {"要求归还100斤土豆","要求归还20头牛"};
        String[] messB = {"要求归还10只鸡","要求归还15匹马"};
        String[] messC = {"要求归还300斤小麦","要求归还50头驴"};
        colleagueA.giveMess(messA);
        colleagueB.giveMess(messB);
        colleagueC.giveMess(messC);
    }
}
