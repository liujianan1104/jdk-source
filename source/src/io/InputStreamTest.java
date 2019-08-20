package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) throws Exception{
        inputStreamTest();
    }

    private static void inputStreamTest() throws Exception{
        InputStream inputStream = new FileInputStream(new File("D:\\dev\\code\\jdk-source\\source\\src\\test_file\\InputStreamFile"));

        System.out.println(inputStream.read());
    }
}
