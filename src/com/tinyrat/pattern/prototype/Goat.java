package com.tinyrat.pattern.prototype;

import java.io.*;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Goat implements Prototype, Serializable {
    StringBuffer color;

    public void setColor(StringBuffer c) {
        color = c;
    }

    public StringBuffer getColor() {
        return color;
    }

    @Override
    public Object cloneMe() throws CloneNotSupportedException {
        Object object = null;
        try {
            ByteArrayOutputStream outOne = new ByteArrayOutputStream();
            ObjectOutputStream outTwo = new ObjectOutputStream(outOne);
            outTwo.writeObject(this);
            ByteArrayInputStream inOne = new ByteArrayInputStream(outOne.toByteArray());
            ObjectInputStream inTwo = new ObjectInputStream(inOne);
            object = inTwo.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return object;
    }
}
