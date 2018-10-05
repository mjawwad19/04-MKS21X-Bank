public class BankAccount {
  public double balance;
  public int accountID;
  public String password;
  /*Sole constructor requires all field's values*/
  public BankAccount (double startBalance, int startAccountID, String startPassword) {
    balance = startBalance;
    accountID = startAccountID;
    password = startPassword;
  }
  /*Return a String to be used to display the account data.
  "ACCOUNT\tBALANCE" */
  public String toString() {
    return "" + accountID + "\t" + balance;
  }
  /*standard accessor methods*/
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  /*Change the value of password to the specified value
 *@param newPass The value to replace the old password with*/
  public void setPassword(String newPass) {
    password = newPass;
  }
  /*Only when amount is positive: Increase balance by amount and return true.
 *@return When amount is positive: Return true, otherwise return false.
 *@param amount The amount is how much to change the balance by.
 */
  public boolean deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      return true;
    }
    else {return false;}
  }
/*Only when amount is positive and the amount does not exceed the balance:
 *Decrease balance by amount and return true, return false otherwise.
 *Make no change if the amount is too large to withdraw
 *@param amount The amount is how much to change the balance by.
 *@return true when the balance is large enough, false otherwise.
 */
  public boolean withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      return true;
    }
    else {return false;}
  }
  /*This private method will allow internal methods to check the password easily*/
  private boolean authenticate(String password) {
     return password == this.password;
  }

/*Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.
 *@param other which BankAccount to GIVE the money to
 *@param amount how much money to transfer, negative amounts will make this operation fail.
 *@param password to be checked against the source account, incorrect password will make this operation fail.
 *@return true if successful, false otherwise.
 */
  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password) && withdraw(amount)) {
      other.deposit(amount);
      return true;
    }
    else {return false;}
 }
}
