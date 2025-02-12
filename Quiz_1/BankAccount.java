public class BankAccount {
    public long acct_num;
    private double balance;
    private String type;
    private float interest_rate;


    /*
     * Creates a new instance of the BankAccount class
     * @param   acct-> account number
     * @param   bal -> starting balance
     * @param   ty  -> type of account
     * @param interest-> interest rate
     */
    public BankAccount(long acct, double bal, String ty, float interest) {
        acct_num = acct;
        balance = bal;
        type = ty;
        interest_rate = interest;    
    }

    /*
     * Gets the current balance of the account
     * @return the current balance of the account
     */
    public double getBalance() {
        return balance;
    }

    /*
     * Gets the type of the account
     * @return the type of the account
     */
    public String getType() {
        return type;
    }

    /*
     * Deposits money into the account
     * @param   amt -> amount of money to deposit
     */
    public void deposit(double amt) {
        balance += amt;
    }

    /*
     * Withdraws money from the account
     * @param   amt -> amount of money to withdraw
     * @return  whether or not the operation was successful
     */
    public boolean withdrawal(double amt) {
        if(amt<balance) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }

    /*
     * Applies interest to the balance
     */
    public void applyInterest() {
        balance += balance*interest_rate/100;
    }
    

}
