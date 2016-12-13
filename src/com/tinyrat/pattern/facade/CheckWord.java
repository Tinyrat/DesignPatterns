package com.tinyrat.pattern.facade;

/**
 * Created by Administrator on 2016/12/13.
 */
public class CheckWord {
    public final int basicAmout = 85;
    String advertisement;
    int amount;

    public CheckWord(String advertisement) {
        this.advertisement = advertisement;
    }

    public void setChargeAmount() {
        amount = advertisement.length() + basicAmout;
    }

    public int getAmount() {
        return amount;
    }
}
