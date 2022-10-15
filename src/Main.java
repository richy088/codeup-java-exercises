public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car toyota = new Car();
//        porsche.setModel("Honda");
//        System.out.println("Model is: " + porsche.getModel());
        BankAccount funds = new BankAccount();
        funds.setBalance(1000);
        System.out.println("Your balance is: $" + funds.getBalance() + " dollars");
        funds.depositFunds(500);
        funds.depositFunds(300);

        funds.currentFunds();
        funds.withdrawFunds(20);
        funds.withdrawFunds(1800);
        funds.withdrawFunds(500);
    }
}
