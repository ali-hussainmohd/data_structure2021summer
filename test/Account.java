/* Students Details :
ID : 20188111
Name : Maher Wael
Activity # : Tutorial #1 Q1
Section # : 1
*/
package test;
public abstract class Account {
    private Person accountHolder;
    private long accountNum;
    private double balance;

    public Account(Person accountHolder, long accountNum, double balance) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }
    public abstract void updateBalance();
    public abstract void withdraw();
    public abstract void deposit();

    public abstract void updateBalance(double b);

    public abstract void withdraw(double w);

    public abstract void deposit(double d);

    @Override
    public String toString() {
        return (accountHolder.toString()+
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}');
    }
}
