/* Students Details :
ID : 20188111
Name : Maher Wael
Activity # : Tutorial #1 Q1
Section # : 1
*/
package test;
public abstract class SavingsAccount extends Account{
    private double interestRate;
    private double Amount;

    public SavingsAccount(Person accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void updateBalance(double b) {
        setbalance (getBalance()+b);

    }

    private void setbalance(double v) {
    }

    @Override
    public void withdraw(double w) {
        if(w > getBalance()){
            System.out.println("No Enough Balance");
            return;
        }

    }

    @Override
    public void deposit(double d) {
        double total = getBalance()+d;
        setbalance(total);

    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
