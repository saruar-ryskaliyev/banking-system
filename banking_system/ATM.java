package banking_system;


public class ATM  {
    private Bank bank;
    private int id = 0;

    public boolean loginToAccount(int acctNum){
        if(this.bank.accessAcctExist(acctNum)){
            id = acctNum;
        }
        else{
            return false;
        }
        return true;
    }


    public boolean deposit(int amount){
        try{
            this.bank.updateAcctBal(id, amount);
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean withdraw(int amount){
        try{
            this.bank.updateAcctBal(id, -amount);
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public int getBalance() throws Exception {
        try {
            if (id == 0) {
                return 0;
            }

            return bank.accessAcctInfo(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public void logout(){
        id = 0;
    }

    public void setBank(Bank b) {
        this.bank = b;
    }
}
