package org.example.Seminar06.cw03;


import java.math.BigDecimal;

public class BankingAppWithdrawalService{
    private NewClass account;

    public BankingAppWithdrawalService(NewClass account) {
        this.account = account;
    }

    public void withdraw(float amount) {
        account.withdraw(amount);
    }
}