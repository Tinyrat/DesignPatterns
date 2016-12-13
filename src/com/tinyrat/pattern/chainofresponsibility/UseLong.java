package com.tinyrat.pattern.chainofresponsibility;

/**
 * Created by Administrator on 2016/12/13.
 */
public class UseLong implements Handler {
    private Handler handler;
    private long result = 1;

    @Override
    public void computerMultiply(String number) {
        try {
            long n = Long.parseLong(number);
            long i = 1;
            while (i <= n) {
                result *= i;
                if (result <= 0) {
                    System.out.println("Long计算不了");
                    handler.computerMultiply(number);
                    return;
                }
                i++;
            }
            System.out.println(number + "的阶乘：" + result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
