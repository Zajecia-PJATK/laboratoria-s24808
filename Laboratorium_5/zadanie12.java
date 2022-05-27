package com.company;

interface Pierwszy{
    void raz();
    void dwa();
}

interface Drugi{
    void trzy();
    void cztery();
}

interface Trzeci extends Pierwszy, Drugi{
    void piec();
}

class Test{
    void szesc(){
        System.out.println("Przyklad");
    }
}

class Test2 extends Test implements Trzeci{

    @Override
    public void raz() {
        System.out.println("Przyklad 1");
    }

    @Override
    public void dwa() {
        System.out.println("Przyklad 2");
    }

    @Override
    public void trzy() {
        System.out.println("Przyklad 3");
    }

    @Override
    public void cztery() {
        System.out.println("Przyklad 4");
    }

    @Override
    public void piec() {
        System.out.println("Przyklad 5");
    }
}

public class Main {

    public static void Method1(Pierwszy raz){
        raz.raz();
    }

    public static void Method2(Drugi dwa){
        dwa.cztery();
    }

    public static void Method3(Trzeci trzeci){
        trzeci.dwa();
        trzeci.trzy();
        trzeci.piec();
    }

    public static void main(String[] args)  {
        Test2 obiekt = new Test2();
        Method1(obiekt);
        Method2(obiekt);
        Method3(obiekt);
    }
}
