package com.tinyrat.pattern.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ReadEnglishWord extends ReadWord {

    @Override
    public ArrayList<String> readWord(File file) {
        ArrayList<String> wordList = new ArrayList<>();
        try {
            FileReader inOne = new FileReader(file);
            BufferedReader inTwo = new BufferedReader(inOne);
            String s = null;
            while ((s = inTwo.readLine()) != null) {
                wordList.add(s);
            }
            inTwo.close();
            inOne.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }
}
