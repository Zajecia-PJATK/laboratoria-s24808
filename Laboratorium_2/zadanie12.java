package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
class Invoice {
    @Getter @Setter String product_number, product_description;
    @Getter @Setter int quantity;
    @Getter @Setter double pricePerItem;

    public double Amount(){if(pricePerItem <= 0){return 0;}if(quantity <= 0){return 0;}return pricePerItem*quantity;}

}

public class Main {

    public static void main(String[] args){
        Invoice invoice1 = new Invoice("a2", "wow", 2, 5.50);
        Invoice invoice2 = new Invoice("b20", "cool", -7, 7.20);
        Invoice invoice3 = new Invoice("c1", "super", 5, -2.62);
        System.out.println(invoice1);
        System.out.println("Total:" + invoice1.Amount());
        System.out.println(invoice2);
        System.out.println("Total:" + invoice2.Amount());
        System.out.println(invoice3);
        System.out.println("Total:" + invoice3.Amount());

    }

}
