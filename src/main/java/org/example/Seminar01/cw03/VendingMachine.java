package org.example.cw03;

import java.util.ArrayList;

public class VendingMachine implements Machine {
    private ArrayList<Product> list;
    public void addProduct(Product newItem){
        list.add(newItem);
    }

    public VendingMachine() {
        list = new ArrayList<Product>();
    }

    public ArrayList getProductByName(String searchName){
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list){
            if (item.getName().contains(searchName)){
                result.add(item);
            }
        }
        return result;
    }
    public  ArrayList getProductByPrice(Double searchPrice){
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list){
            if (item.getPrice().equals(searchPrice)){
                result.add(item);
            }
        }
        return result;
    }

}
