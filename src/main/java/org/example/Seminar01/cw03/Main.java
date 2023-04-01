package org.example.Seminar01.cw03;
import java.util.ArrayList;

/**
 * Продолжение cw2
 * Сделать класс Товар абстрактным, создать нескольких наследников
 * (к примеру: Буталка Воды), сделать интерфейсом торговый Автомат и реализовать класс
 * какого-то одного типа Торгового Автомата (пример: Продающий Бутылки Воды Автомат.
 */

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Chocolate("snickers", 100.0, 2));
        machine.addProduct(new Chocolate("mars", 200.0,3));
        machine.addProduct(new Water("water 0.5l", 300.0, 5));
        machine.addProduct(new Water("water 1l", 200.0, 4));

        //ArrayList list = machine.getProductByName("water");
        System.out.println(machine.getProductByName("water"));

        ArrayList list2 = machine.getProductByPrice(200.0);
        System.out.println(list2);
        Machine machine1 = new VendingMachine();
    }
}

