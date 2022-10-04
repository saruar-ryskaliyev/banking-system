package banking_system;

public class Tester {
    public static void main(String[] args) throws Exception {
        Bank test = new Bank();
        ATM test2 = new ATM();

        test2.setBank(test);

        Customer user1 = new Customer(test, test2);
        Customer user2 = new Customer(test, test2);
        Customer user3 = new Customer(test, test2);


        user1.openAccount();
        user1.depositMoney(500);
        user1.withdrawMoney(100);
        System.out.println(user1.checkBalance());



        user2.openAccount();
        user2.depositMoney(8888);
        user2.withdrawMoney(400);
        System.out.println(user2.checkBalance());

        user3.openAccount();
        user3.depositMoney(8888);
        user3.withdrawMoney(100000);
        System.out.println(user3.checkBalance());








        test2.setBank(test);





    }
}
