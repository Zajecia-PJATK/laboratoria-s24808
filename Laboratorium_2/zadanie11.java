package com.company;

class Invoice {
    String product_number, product_description;
    int quantity;
    double pricePerItem;

    public String getProduct_number() {return product_number;}

    public void setProduct_number(String product_number) {this.product_number = product_number;}

    public String getProduct_description() {return product_description;}

    public void setProduct_description(String product_description) {this.product_description = product_description;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public double getPricePerItem() {return pricePerItem;}

    public void setPricePerItem(double pricePerItem) {this.pricePerItem = pricePerItem;}

    public double Amount(){if(pricePerItem <= 0){return 0;}if(quantity <= 0){return 0;}return pricePerItem*quantity;}

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String toString() {
     return "Invoice: " + "Product number= " + product_number + " " + "Product description= " + product_description + " " +
            "Quantity= " + quantity + " " + "Price per item= " + pricePerItem + " " +
            "Amount= " + Amount();
}
}

public class Main {

    public static void main(String[] args){
        Invoice invoice1 = new Invoice("a2", "wow", 2, 5.50);
        Invoice invoice2 = new Invoice("b20", "cool", -7, 7.20);
        Invoice invoice3 = new Invoice("c1", "super", 5, -2.62);
        System.out.println(invoice1);
        System.out.println(invoice2);
        System.out.println(invoice3);

    }

}
