public class Main {
    public static void main(String[] args) {
        Car raceCar = new Car("Nissan", "GTR", 56, 70);
        Car familyCar = new Car("Toyota", "Sienna", 77, 95);
        raceCar.drive(100);
        String announcement = "In first place we have a " + raceCar.getInfo();
        familyCar.gasUp();


        BankAccount HISA = new BankAccount(3032958, 100, "savings", 3.7f);
        BankAccount NFCA = new BankAccount(7759837, 350, "chequing", 0.9f);
        HISA.deposit(1200);
        NFCA.withdrawal(54.99);
        HISA.applyInterest();
        NFCA.applyInterest();
        String monthlyStatement = HISA.getType() + " account balance: $" + HISA.getBalance();
        
    }
}
