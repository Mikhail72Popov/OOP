package org.example.Seminar02.cw01;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean makeOrder;
    protected  boolean takeOrder;
    public boolean isMakeOrder(){
        return makeOrder;
    }
    public boolean isTakeOrder(){
        return takeOrder;
    }
    public abstract String getName();
}
