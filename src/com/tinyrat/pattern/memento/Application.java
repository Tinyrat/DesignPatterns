package com.tinyrat.pattern.memento;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadPhrase readPhrase = new ReadPhrase(new File("./phrase.txt"));
        File favorPhrase = new File("./favorPhrase.txt");
        RandomAccessFile out = null;
        try {
            out = new RandomAccessFile(favorPhrase, "rw");
        } catch (Exception e) {
        }
        System.out.println("是否从上次读取的位置继续读取？输入y或n");
        String answer = sc.nextLine();
        if (answer.startsWith("Y") || answer.startsWith("y")) {
            Caretaker caretaker = new Caretaker();
            Memento memento = caretaker.getMemento();
            if (memento != null) {
                readPhrase.restoreFromMmento(memento);
            }
        }
        String phrase = null;
        while ((phrase = readPhrase.readLine()) != null) {
            System.out.println(phrase);
            System.out.println("是否将所读行保存到" + favorPhrase.getName() + "?");
            answer = sc.nextLine();
            if (answer.startsWith("Y") || answer.startsWith("y")) {
                try {
                    out.seek(favorPhrase.length());
                    byte[] b = phrase.getBytes();
                    out.write(b);
                    out.writeChar('\n');
                } catch (Exception e) {
                }
            }
            System.out.println("是否继续读取?");
            answer = sc.nextLine();
            if (answer.startsWith("Y") || answer.startsWith("y")) {
                continue;
            } else {
                readPhrase.closeRead();
                Caretaker caretaker = new Caretaker();
                caretaker.saveMemento(readPhrase.createMemento());
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
        System.out.println("已读完");
    }
}
