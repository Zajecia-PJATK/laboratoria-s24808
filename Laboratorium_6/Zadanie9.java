import java.util.NoSuchElementException;
import java.util.Scanner;

 class Main {
     public static void main(String[] args) {
         int[] liczby = {100,32,67,12,7};
         int index = 4;

         try 
         {
                 System.out.println("Liczba to: " + liczby[index]);
         }
         
         catch (Exception e) 
         {
             System.out.println("Elementu nie znaleziono.");
         }
     }
 }
