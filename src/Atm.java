import java.util.Scanner;

class Account{
    int bal;
    Account (int b){
        bal = b;
    }
    public boolean isSufficientBalance(int wb){
        return bal >= wb;
    }
    public void withdraw(int wb){
        bal = bal-wb;
        System.out.println("Withdraw SuccessFully");
        System.out.println("Current balance is: " + bal);
    }
}
class Customer implements Runnable{
    Account h1;
    String name;
    Customer(Account g1, String s1){
        h1 = g1;
        name = s1;
    }
        Scanner sc = new Scanner(System.in);
    public void run(){
        synchronized (h1) {
            System.out.println("Enter amount " + name);
            int amt = sc.nextInt();
            if (h1.isSufficientBalance(amt)) {
                System.out.println(name + " ");
                h1.withdraw(amt);
            } else {
                System.out.println("Insufficient Balance " + name);
            }
        }
    }
}
public class Atm {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1 ,"Amit");
        Customer c2 = new Customer(a1, "Sumit");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }



}
