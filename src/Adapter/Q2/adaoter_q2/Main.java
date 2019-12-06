package adaoter_q2;

import adapter_a2.FileProperties;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
//            f.readFromFile("file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "22");
            f.writeToFile("newfile2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
