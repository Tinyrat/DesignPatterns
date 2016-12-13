package com.tinyrat.pattern.decorator;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/13.
 */
public abstract class ReadWord {
    public abstract ArrayList<String> readWord(File file);
}
