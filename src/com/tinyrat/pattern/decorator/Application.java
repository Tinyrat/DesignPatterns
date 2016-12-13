package com.tinyrat.pattern.decorator;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        ReadEnglishWord rew = new ReadEnglishWord();
        WordDecorator wd1 = new WordDecorator(rew, new File("./file/decorator/chinese.txt"));
        ReadWord reader = wd1;
        wordList = reader.readWord(new File("./file/decorator/word.txt"));
        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }
    }
}
