package com.company;

class Test implements Comparable<Test>{
    private int ocena;

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public Test(int ocena) {
        this.ocena = ocena;
    }

    public int compareTo(Test ex1){
        if(ocena > ex1.ocena){
            return 1;
        }
        if(ocena== ex1.ocena){
            return 0;
        }
        return 0;
    }
}
public class Main {

    public static void main(String[] args) {
	Test a1 = new Test(10);
    Test a2 = new Test(5);
    Test a3 = new Test(12);
    Test a4 = new Test(10);

    System.out.println(a1.compareTo(a2));
    System.out.println(a1.compareTo(a3));
    System.out.println(a1.compareTo(a3));
    System.out.println(a1.compareTo(a4));
    }
}
