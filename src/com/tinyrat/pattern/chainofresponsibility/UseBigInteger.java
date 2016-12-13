package com.tinyrat.pattern.chainofresponsibility;

import java.math.BigInteger;

/**
 * Created by Administrator on 2016/12/13.
 */
public class UseBigInteger implements Handler {
    private Handler handler;
    private BigInteger result = new BigInteger("1");

    @Override
    public void computerMultiply(String number) {
        try {
            BigInteger n = new BigInteger(number);
            BigInteger one = new BigInteger("1");
            BigInteger i = one;
            while (i.compareTo(n) <= 0) {
                result = result.multiply(i);
                i = i.add(one);
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
