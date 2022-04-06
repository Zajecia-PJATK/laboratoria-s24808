package com.company;

class Student {
    String imie, nazwisko, numer_indeksu;
    int obecnosc, oceny_z_POJ;

    public String getImie() {return imie;}

    public void setImie(String imie) {if (imie.length() == 0) {this.imie = "Unknown";} else {this.imie = imie;}}

    public String getNazwisko() {return nazwisko;}

    public void setNazwisko(String nazwisko) {if (nazwisko.length() == 0) {this.nazwisko = "Unknown";} else {this.nazwisko = nazwisko;}}

    public String getNumer_indeksu() {return numer_indeksu;}

    public void setNumer_indeksu(String numer_indeksu) {this.numer_indeksu = numer_indeksu;}

    public int getObecnosc() {return obecnosc;}

    public void setObecnosc(int obecnosc) {
        this.obecnosc = obecnosc;
    }

    public int getOceny_z_POJ() {return oceny_z_POJ;}

    public void setOceny_z_POJ(int oceny_z_POJ) {
        this.oceny_z_POJ = oceny_z_POJ;
        if (obecnosc < 50) {
            this.oceny_z_POJ = 2;
        }
    }

    public Student(String imie, String nazwisko, String numer_indeksu, int obecnosc, int oceny_z_POJ) {
        setImie(imie);
        setNazwisko(nazwisko);
        this.numer_indeksu = numer_indeksu;
        this.obecnosc = obecnosc;
        setOceny_z_POJ(oceny_z_POJ);
    }

    public String toString() {
        return "Student: " + "Imie= " + imie + " " + "Nazwisko= " + nazwisko + " " +
                "Indeks= " + numer_indeksu + " " + "Obecnosc= " + obecnosc + "% " +
                "Oceny z poj= " + oceny_z_POJ;
    }
}

public class Main {

    public static void main(String[] args){
        Student student1 = new Student("Antoni", "Kolobrzeski", "s24342", 20, 4);
        Student student2 = new Student("", "Brodnicka", "s26522", 86, 5);
        Student student3 = new Student("Dominik", "", "s56111", 52, 3);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }

}
