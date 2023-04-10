package org.example.Seminar03.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CocoaCapacity extends ProductCapacity{
    private List<Product> products;

    public CocoaCapacity() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }

    public void print() {
        for (Product product: products){
            System.out.println(product);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
    public void sort(ProductCompare compare){
        Collections.sort(products,compare);
    }
}
