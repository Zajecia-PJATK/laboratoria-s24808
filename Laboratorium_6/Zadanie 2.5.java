import java.util.*;

import static java.util.Collection.*;
import static java.util.Collections.sort;

class Hamster implements  Comparable<Hamster>{
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

    public int compareTo(Hamster o){
        if(hamsterNumber<o.getHamsterNumber()){
            return -1;
        }else if(hamsterNumber<o.getHamsterNumber()){
            return 1;
        }else{
            return 0;
        }
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
    ArrayList<Hamster> removeHamster(int number, ArrayList<Hamster> delete){
        ListIterator<Hamster> remove = delete.listIterator();
        for(int i=0; i < number; i++){
            remove.remove();
        }
        return delete;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        ArrayList<Hamster> v = new ArrayList<Hamster>();
        Map<String, Hamster> map = new HashMap<>();
        ListIterator<Hamster> remove = v.listIterator();
        Random random = new Random();

        for(int i = 0; i < 20; i++)
            v.add(new Hamster(random.nextInt(11)));

        for(int i = 0; i < 3; i++) {
            String imie = "";
            int id = 0;
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

        sort(v);
        Printer.printAll(v);
        System.out.println(map.keySet());
    }
}
