public class Account {
    private long account;
    private String type;
    private double balance;
    private float interestRate;

    /*
     * Creates an instance of the Account class
     * @param acct  -> account number
     * @param typ   -> type of account
     * @param bal   -> initial balance
     */
    public Account(long acct, String typ, double bal) {
        account = acct;
        type = typ;
        balance = bal;
        interestRate = 0.0f;
    }

    /*
     * Calculates interest for 1 month based on interest rate and increases the balance accordingly
     */
    public void calcInterest() {
        balance += balance*interestRate/12.0/100;
    }

    /*
     * Withdraws an amount from the account
     * @param   amt -> amount to be withdrawn
     * @return whether or not the operation was successful
     */
    public boolean withdraw(double amt) {
        if(balance-amt>0) {
            balance -= amt;
            return true;
        } else return false;
    }

    /*
     * Deposits a certain amount of money into the account
     * @param   amt -> amount to be deposited
     */
    public void deposit(double amt) {
        balance += amt;
    }

    /*
     * Gets the current balance in the account
     * @return the current balance in the account
     */
    public double getBalance() {
        return balance;
    }

    /*
     * Gets the account number on the account
     * @return the account number on the account
     */
    public long getAccount() {
        return account;
    }
    
    /*
     * Gets the type of the account
     * @return the type of the account
     */
    public String getType() {
        return type;
    }

    /*
     * Sets the annual interest rate of the account
     * @param   i   -> the new interest rate of the account
     */
    public void setInterestRate(float i) {
        interestRate = i;
    }
}
