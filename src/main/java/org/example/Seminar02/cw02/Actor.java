package org.example.Seminar02.cw02;

import org.example.Seminar02.cw01.ActorBehavoir;



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


