package org.example.Seminar01.hw01;
import java.util.ArrayList;
public interface Maсhine {
    ArrayList getProductByName(String searchName);

    ArrayList getProductByName(Double searchName);

    void addProduct(Product newItem);
}
