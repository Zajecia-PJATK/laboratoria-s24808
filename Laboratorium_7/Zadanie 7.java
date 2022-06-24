package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s1 = new Scanner(System.in);
        String nazwa;
        int rozmiar = 0;
        try{
        System.out.println("Podaj nazwe pliku: ");
            nazwa = s1.nextLine();
            DataInputStream input = new DataInputStream(new FileInputStream(nazwa));
            while(true) {
                rozmiar++;
                input.readByte();
            }
            }catch (Exception e){
            System.out.println(rozmiar - 1);
        }
    }
}
