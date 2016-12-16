package com.tinyrat.pattern.memento;

import java.io.*;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Caretaker {
    File file;
    private Memento memento;

    Caretaker() {
        file = new File("./saveObject.txt");
    }

    public Memento getMemento() {
        if (file.exists()) {
            try {
                FileInputStream in = new FileInputStream("saveObject.txt");
                ObjectInputStream inObj = new ObjectInputStream(in);
                memento = (Memento) inObj.readObject();
            } catch (Exception e) {
            }
        }
        return memento;
    }

    public void saveMemento(Memento memento) {
        try {
            FileOutputStream out = new FileOutputStream("saveObject.txt");
            ObjectOutputStream outObj = new ObjectOutputStream(out);
            outObj.writeObject(memento);
        } catch (Exception e) {
        }
    }
}
