package com.company;

class RandomNumber{
    static int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int randomElement(){
        int result = (int)Math.floor(Math.random()*tab.length);
        return tab[result];
    }
}

public class Main {

    public static void main(String[] args) {
	    System.out.println(RandomNumber.randomElement());
        System.out.println(RandomNumber.randomElement());
        System.out.println(RandomNumber.randomElement());
    }
}
