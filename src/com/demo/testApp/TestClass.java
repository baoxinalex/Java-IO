package com.demo.testApp;

/**
 * Created by xin on 06/09/17.
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class TestClass {

    public File x;
    public FileWriter fw;

    public static void main(String[] args) throws IOException {
        TestClass testClass = new TestClass();
        testClass.createFile();
        testClass.addRecords();
    }

    private void createFile() throws IOException {
        x = new File("/home/xin/work/hellodarknessmyoldfriend.txt");
        boolean flag = x.createNewFile();
        System.out.println(flag);
    }

    public void addRecords() throws IOException {
        fw = new FileWriter(x);
        fw.write("s%s%s%" + " ");
        fw.write("20" + " ");
        fw.write("h" + " ");
        fw.write("lala" + " ");
        fw.close();
    }


}
