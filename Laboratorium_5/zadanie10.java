package com.company;

interface Pierwszy {
    void przyklad1();
}

interface Drugi {
    int przyklad2(int a, int b, int c);
}

interface Trzeci {
    void przyklad3(int a);
}

interface Czwarty {
    int przyklad4(int a, int b, int c, int d);
}

public class Main {
    public static void main(String[] args)  {
        Pierwszy a1 = () -> System.out.println("Przyklad1 ");
        a1.przyklad1();
        Drugi a2 = (int a, int b, int c) ->  a + b + c;
        System.out.println("Przyklad2 " + a2.przyklad2(2, 2 ,3));
        Trzeci a3 = (int a) -> System.out.println("Przyklad3 " + a);
        a3.przyklad3(14);
        Czwarty a4 = (int a, int b, int c, int d) -> {
            int sum = a+b+c+d;
            int average = sum/4;
            return average;
        };
        System.out.println("Przyklad4 " + a4.przyklad4(2, 4, 4,6));
    }
}
