public class BankAccount {
     private int accountNumber;
     private int balance;
     private String customerName;
     private String email;
     private int phoneNumber;

     public void setBalance(int funds) {
          this.balance = funds;
     }

     public int getBalance() {
          return this.balance;
     }

     public void depositFunds(int deposit) {
          this.balance += deposit;
          System.out.println(this.balance);
     }

     public void withdrawFunds(int amount) {
          if (this.balance < amount) {
               System.out.println("Insufficient funds available");
          } else {
               this.balance -= amount;
               System.out.println(this.balance);
          }
     }

     public  void currentFunds() {
          System.out.println("Your current balance is: $" + this.balance + " dollars");
     }
}

