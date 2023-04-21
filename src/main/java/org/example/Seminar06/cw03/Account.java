package org.example.Seminar06.cw03;


import java.math.BigDecimal;

public abstract class Account {
    protected float balance;
    protected abstract void deposit(float amount);
    protected abstract void withdraw(float amount);

}