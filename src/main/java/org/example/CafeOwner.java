package org.example;

public class CafeOwner {
    public void  giveItem(Customer customer){
        System.out.println("Item : " + customer.getOrder());
    }
}
