package adapter_a2;

import adaoter_q2.FileIO;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("adapter_a2/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("adaoter_q2/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
