package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String name1, name2;
        Scanner s1 = new Scanner(System.in);
        name1 = s1.nextLine();
        name2 = s1.nextLine();


        File file1 = new File(name1);
        Scanner sfile = new Scanner(file1);
        FileWriter writer = new FileWriter(name2, true);
        PrintWriter file2 = new PrintWriter(writer);
        while (sfile.hasNext()) {
            file2.println(sfile.nextLine());
        }
        file2.close();

    }
}
