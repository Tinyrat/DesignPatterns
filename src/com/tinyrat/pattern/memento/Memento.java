package com.tinyrat.pattern.memento;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Memento implements Serializable {
    private long state;

    void setPositionState(long state) {
        this.state = state;
    }

    long getPositionState() {
        return state;
    }
}
