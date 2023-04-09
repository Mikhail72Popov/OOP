package org.example.Seminar02.hw;

/**
 * Рефакторинг одного из дз с прелылущего курса в парадигме ООП
 *
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
 * выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
 * также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        Warehouse store = new Warehouse();
        store.addLaptop(new Laptop("Lenovo", 8, 650, "Windows", "yellow"));
        store.addLaptop(new Laptop("HP", 16, 550, "Windows", "red"));
        store.addLaptop(new Laptop("Asus", 8, 450, "Linux", "black"));
        store.addLaptop(new Laptop("Apple", 16, 750, "MAC", "red"));
        store.addLaptop(new Laptop("HP", 8, 650, "Windows", "gold"));
        store.addLaptop(new Laptop("Lenovo", 8, 650, "Windows", "blue"));
        store.Store();
    }
}

