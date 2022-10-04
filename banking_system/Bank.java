package banking_system;

import java.util.ArrayList;

public class Bank {

    private final ArrayList<Account> Accounts = new ArrayList<>();
    private final ArrayList<ATM> atms = new ArrayList<ATM>();

    public int createAccount(){
        Account create = new Account();
        Accounts.add(create);
        return create.getNumber();
    }

    public void attachATM(ATM atm){
        atms.add(atm);
        atm.setBank(this);
    }

    public boolean accessAcctExist(int acctNum){
        for(int i = 0; i < Accounts.size(); i += 1){
            if (Accounts.get(i).getNumber() == acctNum){
                return true;
            }
        }
        return false;
    }

    public int accessAcctInfo(int acctNum) throws Exception {
        int ans = 0;
        for(int i = 0; i < Accounts.size(); i += 1) {
            if (Accounts.get(i).getNumber() == acctNum) {
                ans = i;
                return Accounts.get(ans).getBalance();
            }
        }
        throw new Exception("Wrong number, no such account");

    }

    public void updateAcctBal(int acctNum, int diff) throws Exception {
        for(int i = 0; i < Accounts.size(); i += 1){
            Account temp_acc = Accounts.get(i);
            if (temp_acc.getNumber() == acctNum){
                if (temp_acc.getBalance() + diff >= 0) {
                    temp_acc.setBalance(diff + temp_acc.getBalance());
                }
                else{
                    throw new Exception("Not enough money. Money is not withdrawn");
                }
            }

        }


    }

}
