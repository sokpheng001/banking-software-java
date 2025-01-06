package service;

public interface BankingService {
    void withdraw(double cash);
    void deposit(double cash);
    void showBalance();
}
