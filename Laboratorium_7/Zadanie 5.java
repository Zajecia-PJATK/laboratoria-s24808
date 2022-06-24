package com.company;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String name;
        int n;

        Scanner s1 = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Podaj nazwe pliku: ");
        name = s1.nextLine();
        File file = new File(name);
        System.out.println("Podaj n: ");
        n = s1.nextInt();

            Scanner input = new Scanner(file);
            while(input.hasNext())  list.add(input.nextLine());
            input.close();

        for(int i = n; i > 0; i--)  {
            System.out.println(list.get(list.size()-i));
        }
    }
}
