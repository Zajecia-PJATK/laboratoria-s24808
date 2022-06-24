package com.company;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String file;
        String input;
        Scanner s1 = new Scanner(System.in);
        file = s1.nextLine();
        input = s1.nextLine();

        FileWriter filewriter = new FileWriter(file, true);
        PrintWriter output = new PrintWriter(filewriter);

        output.println(input);
        output.close();
    }
}
