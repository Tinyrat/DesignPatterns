package com.tinyrat.pattern.templatemethod;

import java.io.File;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ConcreteTemplate2 extends AbstractTemplate {

    ConcreteTemplate2(File dir) {
        super(dir);
    }

    @Override
    public void sort() {
        for (int i = 0; i < allFiles.length; i++) {
            for (int j = i + 1; j < allFiles.length; j++) {
                if (allFiles[j].length() < allFiles[i].length()) {
                    File file = allFiles[j];
                    allFiles[j] = allFiles[i];
                    allFiles[i] = file;
                }
            }
        }
    }

    @Override
    public void printFiles() {
        for (int i = 0; i < allFiles.length; i++) {
            long fileSize = allFiles[i].length();
            String name = allFiles[i].getName();
            System.out.println((i + 1) + " " + name + "(" + fileSize + "字节)");
        }
    }
}
