package com.tinyrat.pattern.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/13.
 */
public class WordDecorator extends Decorator {
    File decoratorFile;

    WordDecorator(ReadWord reader, File decoratorFile) {
        super(reader);
        this.decoratorFile = decoratorFile;
    }

    @Override
    public ArrayList<String> readWord(File file) {
        ArrayList<String> wordList = reader.readWord(file);
        try {
            FileReader inOne = new FileReader(decoratorFile);
            BufferedReader inTwo = new BufferedReader(inOne);
            String s = null;
            int m = 0;
            while ((s = inTwo.readLine()) != null) {
                String word = wordList.get(m);
                word = word.concat("|" + s);
                wordList.set(m, word);
                m++;
                if (m > wordList.size()) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }
}
