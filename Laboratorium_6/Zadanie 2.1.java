package com.company;

import java.util.*;

class Hamster {
    private String imie;
    private int hamsterNumber;
    Hamster(int i) { hamsterNumber = i; }
    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }
    public int getHamsterNumber() {
        return hamsterNumber;
    }
    public String getHamsterName() {
        return imie;
    }
    public void setHamsterName(String name) {
        imie = name;
    }
}

class Printer {
    static void printAll(List <Hamster> hl) {
        for(Hamster x : hl){
            System.out.println(x.hamsterNumber());
        }
    }
}

 class HamsterMaze {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        List<Hamster> v = new ArrayList<Hamster>();
        Map<String, Hamster> map = new HashMap<>();
        
        for(int i = 0; i < 3; i++)
            v.add(new Hamster(i));
        
        for(int i = 0; i < 3; i++) {
            String imie = "";
            int id=0;
            Hamster hamster;

            try {
                id = s1.nextInt();
                if (id < 0) throw new Exception("identyfikator ujemny");
                imie = s1.nextLine();
            } catch (Exception e) {
                if (s1.hasNextInt()) {
                    id = s1.nextInt();
                }
                if (s1.hasNextLine()) {
                    imie = s1.nextLine();
                }
            }
            hamster = new Hamster(id);
            hamster.setHamsterName(imie);
            map.put(hamster.getHamsterName(), hamster);
        }

        Printer.printAll(v);
        System.out.println(map.keySet());
    }
}

