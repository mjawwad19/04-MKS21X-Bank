public class Driver {
  public static void main(String[]args){
    BankAccount a = new BankAccount(5000.0, 5429, "pass");

    System.out.println("The account number is " + a.getAccountID());
    System.out.println("The current balance of this account is " + a.getBalance());
    System.out.println(a);

    //if( a.withdraw(1000) ){
    //if( a.withdraw(9000)) {
    if (a.withdraw(-2)) {
      System.out.println("Withdrawal success!");
    }
    else {System.out.println("Withdrawal failure");}

    System.out.println("The current balance of this account is " + a.getBalance());

    //if( a.deposit(7000) ){
    if (a.withdraw(-2)) {
             System.out.println("Deposit success!");
        }
        else {System.out.println("Deposit failure");}

    System.out.println("The current balance of this account is " + a.getBalance());
  }
}
