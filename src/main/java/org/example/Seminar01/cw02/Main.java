package org.example.Seminar01.cw02;

import java.util.ArrayList;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов и
 * getProduct(String name)
 */

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("snickers",  100.0));
        machine.addProduct(new Product("mars", 200.0));
        machine.addProduct(new Product("water 0.5l", 300.0));
        machine.addProduct(new Product("water 1l", 200.0));

        //ArrayList list = machine.getProductByName("water");
        System.out.println(machine.getProductByName("water"));

        ArrayList list2 = machine.getProductByPrice(200.0);
        System.out.println(list2);
    }
}
