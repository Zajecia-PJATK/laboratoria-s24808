package com.company

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner s1 = new Scanner(System.in);
        String name, dane;
        char znaki;
        int ilosc_lini = 0;
        int ilosc_liter = 0;
        int ilosc_cyfr = 0;
        int ilosc_spacji = 0;

        System.out.println("Podaj nazwe pliku: ");
        name = s1.nextLine();
        Path path = Paths.get(name);

        File file = new File(name);
        Scanner sfile = new Scanner(file);
        while (sfile.hasNext()) {
            dane = sfile.nextLine();
            ilosc_lini++;
            for (int i = 0; i < dane.length(); i++) {
                znaki = dane.toCharArray()[i];
                if (((int) znaki) >= 65 && ((int) znaki <= 90) || (((int) znaki) >= 97) && ((int) znaki <= 122)) {
                    ilosc_liter++;
                } else if (((int) znaki >= 48) && ((int) znaki <= 57)) {
                    ilosc_cyfr++;
                } else if (znaki == ' ') {
                    ilosc_spacji++;
                }

            }
        }
        System.out.println("Linie: " + ilosc_lini + " " + "Litery: " + ilosc_liter + " " +
                "Cyfry: " + ilosc_cyfr + " " + "Biale znaki: " + ilosc_spacji);

    }
}
