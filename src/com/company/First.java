package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class First implements Runnable {
    @Override
    public void run() {
        File file1 = new File("F:\\1.xlxs");
        File file2 = new File("F:\\1.ppt");
        File file3 = new File("F:\\1.txt");
        try {
            FileWriter fileWriter1 = new FileWriter(file1);
            fileWriter1.close();
            FileWriter fileWriter2 = new FileWriter(file2);
            fileWriter2.close();
            FileWriter fileWriter3 = new FileWriter(file3);
            fileWriter3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}