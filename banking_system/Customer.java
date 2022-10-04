package banking_system;


public class Customer {

    private Bank bank;
    private ATM atm;
    private int id = 0;


    Customer(Bank bank, ATM atm){
        this.bank = bank;
        this.atm = atm;
    }

    public int openAccount(){
        id = this.bank.createAccount();
        return id;
    }

    public void depositMoney(int amount){
        if(this.atm.loginToAccount(id)){
            this.atm.deposit(amount);
            this.atm.logout();
        }
    }

    public void withdrawMoney(int amount){
        if(this.atm.loginToAccount(id)){
            this.atm.withdraw(amount);
            this.atm.logout();
        }
    }


    public int checkBalance() throws Exception {
        int ans = 0;
        if(this.atm.loginToAccount(id)){
            ans = this.atm.getBalance();
            this.atm.logout();
        }
        return ans;
    }


}
