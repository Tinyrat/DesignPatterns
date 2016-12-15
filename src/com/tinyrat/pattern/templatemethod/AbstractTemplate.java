package com.tinyrat.pattern.templatemethod;

import java.io.File;

/**
 * Created by Administrator on 2016/12/15.
 */
public abstract class AbstractTemplate {
    File[] allFiles;
    File dir;

    AbstractTemplate(File dir) {
        this.dir = dir;
    }

    public final void showFileName() {
        allFiles = dir.listFiles();
        sort();
        printFiles();
    }

    public abstract void sort();

    public abstract void printFiles();
}
