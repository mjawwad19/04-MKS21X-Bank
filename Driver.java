public class Driver {
  public static void main(String[]args){
    BankAccount a = new BankAccount(5429, 5000, "pass");

    System.out.println("The account number is " + a.getAccountID());
    System.out.println("The current balance of this account is" + a.getBalance());
    System.out.println(a);

    if( a.withdraw(1000) ){
      System.out.println("Withdrawal success!");
    }
    else {System.out.println("Withdrawal failure");}

    System.out.println("The current balance of this account is" + a.getBalance());

    if( a.deposit(7000) ){
             System.out.println("Deposit success!");
        }
        else {System.out.println("Deposit failure");}

    System.out.println(a.getBalance() + "is the current balance of this account" + a.getBalance());
  }
}
