package org.example;

public class Main {
    public static void main(String[] args) {

        CafeOwner cafeOwner = new CafeOwner();
        Customer cafeCustomerA = new CafeCustomerA();
        Customer cafeCustomerB = new CafeCustomerB();

        cafeOwner.giveItem(cafeCustomerA);
        cafeOwner.giveItem(cafeCustomerB);
    }
}