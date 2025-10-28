public class ExpenseTracker {
    // Simple expense tracker Java code
    private double balance = 0.0;

    public double income(double salary) {
        balance += salary;
        return balance;
    }

    public double expense(double expense) {
        balance -= expense;
        return balance;
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.income(1000.0); // Example income
        tracker.expense(200.0); // Example expense
        tracker.checkBalance();
    }
}
