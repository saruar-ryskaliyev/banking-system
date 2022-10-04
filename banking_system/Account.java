package banking_system;

public class Account {
    private int number;
    private int balance;

    Account(){
        number = (int)Math.floor(Math.random() * (9999999 - 1000000 + 1) + 1000000);
        balance = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //how to make it accessible only to Bank?
}
