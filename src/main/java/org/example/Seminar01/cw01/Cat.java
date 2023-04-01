package org.example.cw01;

public class Cat extends CatMover implements CatInterface {
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saySomtheing() {
        System.out.println("MEOW");

    }

    public  void say(){
        System.out.println(name);
    }

    @Override
    public void sayWithInterfase() {
        System.out.println("meow with interface");

    }
}
