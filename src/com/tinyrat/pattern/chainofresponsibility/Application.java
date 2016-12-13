package com.tinyrat.pattern.chainofresponsibility;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Application {
    private Handler useInt, useLong, useBig;
    public void creatChain(){
        useInt = new UseInt();
        useLong = new UseLong();
        useBig = new UseBigInteger();
        useInt.setNextHandler(useLong);
        useLong.setNextHandler(useBig);
    }
    public void reponseClient(String number){
        useInt.computerMultiply(number);
    }
    public static void main(String[] args) {
        Application application = new Application();
        application.creatChain();
        application.reponseClient("10000");
    }
}
