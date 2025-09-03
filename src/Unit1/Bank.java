package Unit1;

public class Bank {
    private int balance = 10000;
    public void withdraw(int amount){
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else{
            balance -= amount;
            System.out.println("Withdraw Successful");
        }
    }
}
