public class Driver {
  public static void main(String[]args){
    BankAccount a = new BankAccount(5000.0, 5429, "pass");
    BankAccount b = new BankAccount(400.0, 10323, "hi");

    //System.out.println("The account number is " + a.getAccountID());
    //System.out.println("The current balance of this account is " + a.getBalance());
    System.out.println("The account ID and current balance of account a is");
    System.out.println(a);

    //if( a.withdraw(1000) ){
    //if( a.withdraw(9000)) {
    if (a.withdraw(-2)) {
      System.out.println("Withdrawal success!");
    }
    else {System.out.println("Withdrawal failure");}

    //System.out.println("The current balance of account a is " + a.getBalance());
    System.out.println("The account ID and current balance of account a is");
    System.out.println(a);

    //if( a.deposit(7000) ){
    if (a.withdraw(-2)) {
             System.out.println("Deposit success!");
        }
        else {System.out.println("Deposit failure");}

    //System.out.println("The current balance of this account a is " + a.getBalance());
    System.out.println("The account ID and current balance of account a is");
    System.out.println(a);

    if (a.transferTo(b, 4000.0, "pass")) {
      System.out.println("Withdrawed and deposited.");
    }
    else {System.out.println("Could not withdraw and deposit");}

    System.out.println("The account ID and current balance of account a is");
    System.out.println(a);
    System.out.println("The account ID and durrent balance of account b is");
    System.out.println(b);
  }
}
