package com.sch.igor;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        File catalog01 = new File("D:\\HomeWorkOOP\\IO0_002");
        catalog01.mkdirs();

        File fileOut1 = new File("D:\\HomeWorkOOP\\IO0_002\\out01.txt");
        File fileOut2 = new File("D:\\HomeWorkOOP\\IO0_002\\out02.txt");
        File fileIn1 = new File("D:\\HomeWorkOOP\\IO0_002\\in1.txt");

        CopyTextFile c1 = new CopyTextFile();

        c1.start(fileOut1, fileOut2, fileIn1);
    }
}
