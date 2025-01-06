package model;

import service.BankingService;

public class Account implements BankingService {
    private double cash = 0.0;
    private String accountName;
    public Account(String accountName){
        this.accountName = accountName;
    }
    public Account(){}
    @Override
    public void withdraw(double cash) {
        if(cash>this.cash){
            System.out.println("[!] Cannot withdraw, because your balance is not enough");
            return;
        }
        this.cash-=cash;// this.cash = this.cash-cash;
        System.out.println("[+] Your transaction in " + accountName + " account" + " withdrawn successfully");
    }

    @Override
    public void deposit(double cash) {
        if(cash<=0.0){
            System.out.println("[!] Cannot deposit :(");
            return;
        }
        this.cash+=cash;
        System.out.println("[+] Your transaction in " + accountName + " account" + " deposited successfully");
    }

    @Override
    public void showBalance() {
        System.out.println("======================");
        System.out.println("[+] Your balance: " + this.cash + " $");
    }
}
