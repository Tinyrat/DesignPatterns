package com.tinyrat.pattern.memento;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/12/16.
 */
public class ReadPhrase {
    long readPosition;
    File file;
    RandomAccessFile in;
    String phrase = null;

    public ReadPhrase(File file) {
        this.file = file;
        try {
            in = new RandomAccessFile(file, "r");
        } catch (IOException e) {
        }
    }

    public Memento createMemento() {
        Memento mem = new Memento();
        mem.setPositionState(readPosition);
        return mem;
    }

    public void restoreFromMmento(Memento mem) {
        readPosition = mem.getPositionState();
    }

    public String readLine() {
        try {
            in.seek(readPosition);
            phrase = in.readLine();
            if (phrase != null) {
                byte[] b = phrase.getBytes("iso-8859-1");
                phrase = new String(b);
            }
            readPosition = in.getFilePointer();
        } catch (IOException e) {
        }
        return phrase;
    }

    public void closeRead() {
        try {
            in.close();
        } catch (IOException e) {
        }
    }
}
