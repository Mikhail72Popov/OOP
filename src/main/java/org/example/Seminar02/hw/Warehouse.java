package org.example.Seminar02.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
    public ArrayList<Laptop> list;
    public void addLaptop(Laptop newItem) {list.add(newItem);}
    public Warehouse(){
        list = new ArrayList<Laptop>();}
   public void Store() {
            System.out.println("1 - Модель\n" +
                    "2 - ОЗУ\n" +
                    "3 - Объем ЖД\n" +
                    "4 - Операционная система\n" +
                    "5 - Цвет");
            System.out.print("Введите цифру, соответствующую необходимому критерию: ");
            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Введите производителя ноутбука: ");
                    Scanner sc1 = new Scanner(System.in);
                    String prod = sc1.nextLine();
                    for (Laptop item : list) {
                        if (item.getProduct().equals(prod))
                            System.out.println(item.toString());
                    }
                    break;

                case 2:
                    System.out.print("Введите минимальный объём ОЗУ: ");
                    Scanner sc2 = new Scanner(System.in);
                    int random = sc2.nextInt();
                    for (Laptop item : list) {
                        if (item.getRandomMemory() >= random)
                            System.out.println(item.toString());
                    }
                    break;

                case 3:
                    System.out.print("Введите минимальный объём жёсткого диска: ");
                    Scanner sc3 = new Scanner(System.in);
                    int disk = sc3.nextInt();
                    for (Laptop laptop : list) {
                        if (laptop.getHardDisk() >= disk)
                            System.out.println(laptop.toString());
                    }
                    break;

                case 4:
                    System.out.print("Введите требуемую ос: ");
                    Scanner sc4 = new Scanner(System.in);
                    String oper = sc4.nextLine();
                    for (Laptop laptop : list) {
                        if (laptop.getOperSystem().equals(oper))
                            System.out.println(laptop.toString());
                    }
                    break;

                case 5:
                    System.out.print("Введите цвет: ");
                    Scanner sc5 = new Scanner(System.in);
                    String color = sc5.nextLine();
                    for (Laptop laptop : list) {
                        if (laptop.getColor().equals(color))
                            System.out.println(laptop.toString());
                    }
                    break;
                default:
                    System.out.println("Не соответствует необходимому критерию");
                    break;

            }
        }
}



