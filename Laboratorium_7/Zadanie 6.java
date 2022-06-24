package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s1 = new Scanner(System.in);
        String nazwa = "";
        System.out.println("Podaj nazwe pliku: ");
        nazwa = s1.nextLine();
        if (nazwa.contains(".")) {
            nazwa = nazwa.substring(0, nazwa.indexOf("."));
        }
        File file1 = new File(nazwa + ".txt");

        Scanner sFile = new Scanner(file1);
        FileOutputStream fstream = new FileOutputStream(nazwa + ".dat");
        DataOutputStream output = new DataOutputStream(fstream);
        while (sFile.hasNext()) output.writeChars(sFile.nextLine());
    }
}
