package com.company;

enum  Color{
    kier, karo, pik, trefl;
}
class Card{
    String wartosc;
    Color kolor;

    public String getWartosc() {return wartosc;}

    public void setWartosc(String wartosc) {this.wartosc = wartosc;}

    public Color getKolor() {return kolor;}

    public void setKolor(Color kolor) {this.kolor = kolor;}

    public Card(String wartosc, Color kolor){
        this.wartosc = wartosc;
        this.kolor = kolor;
    }

    public String toString(){
        return "Card[" + "wartosc=" + wartosc + ", kolor=" + kolor + "]";
    }
}
public class Main {

    public static void main(String[] args) {
	    Card karta1 = new Card("As", Color.trefl);
        Card karta2 = new Card("dwa", Color.kier);
        Card karta3 = new Card("Jopek", Color.pik);
        System.out.println(karta1);
        System.out.println(karta2);
        System.out.println(karta3);
    }
}
