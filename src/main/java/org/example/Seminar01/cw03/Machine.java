package org.example.Seminar01.cw03;

import java.util.ArrayList;

public interface Machine {
    public ArrayList getProductByPrice(Double searchPrice);
    public ArrayList getProductByName(String searchName);
    public void addProduct(Product newItem);
}
