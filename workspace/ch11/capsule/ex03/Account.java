package ch11.capsule.ex03;

public class Account {
    private int balance;

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(amount + "원을 입금합니다");
        System.out.println("현재남은잔액: " + this.balance);
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원을 출금합니다");
            System.out.println("현재남은잔액: " + this.balance + "원");
        } else
            System.out.println("잔액이 부족합니다. 현재남은잔액: " + this.balance + "원");
    }
}
