package org.example.cw04;
import java.util.List;
import java.util.ArrayList;

/**
 * Продолжение cw2; cw3
 * Создать перегруженный метод выдачи товара Торговым автоматом дополнив дополнитеным входнымпараметром
 * (пример: getProduct(String name) выдающий товар по имени, создать метод возвращающий товар по имени и
 * какому-либо параметру товара getProduct(String name, int volume) (10 минут)
 */
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();

        list.add(new Water("water 0.5l", 300.0, 5));
        list.add(new Water("water 1l", 200.0, 4));
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(list);
        Water water = machine.getProduct("water 0.5l", 5);
        System.out.println(machine.getProduct("water 0.5l", 5));
    }
}
