package org.example.Seminar01.hw01;
import java.util.ArrayList;
/**
 *
 * 1.Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2.Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
 * реализовать перегруженный метод getProduct(int name, int volume, int temperature)
 * выдающий продукт соответствующий имени, объему и температуре
 * 3.В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
 * воспроизвести логику заложенную в программе
 * 4.Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {

        HotDrinkVendingMachine maсhineHotDrink = new HotDrinkVendingMachine();
        maсhineHotDrink .addProduct(new HotDrink("hot drink 1l", 200.0, 1, 40));
        maсhineHotDrink .addProduct(new HotDrink("hot drink 1l", 250.0, 1, 60));
        maсhineHotDrink .addProduct(new HotDrink("drink 1l", 150.0, 1, 10));
        maсhineHotDrink .addProduct(new HotDrink("hot drink 2l", 300.0, 2, 50));
        maсhineHotDrink .addProduct(new HotDrink("drink 2l", 300.0, 2, 5));

            ArrayList list1 = maсhineHotDrink.getProduct("hot drink 1l", 1, 40);
            System.out.println(list1);
        }
    }
