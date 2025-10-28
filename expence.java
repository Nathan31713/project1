import java.util.ArrayList;
class Expense {
String item;
double amount;
String date;
Expense(String item, double amount, String date) {
this.item = item;
this.amount = amount;
this.date = date;
}
}
public class expence{
    public static void main(String[] args) {
    System.out.println("=== Expense Tracker ===");
    ArrayList<Expense> expenses = new ArrayList<>();
    // Predefined expenses
    expenses.add(new Expense("Groceries", 50.25, "2025-09-11"));
    expenses.add(new Expense("Utilities", 75.50, "2025-09-10"));
    expenses.add(new Expense("Transport", 20.00, "2025-09-11"));
    expenses.add(new Expense("Entertainment", 40.00, "2025-09-09"));
    // Display expenses
    // Display expenses
    System.out.printf("%-15s %-10s %-12s%n", "Item", "Amount", "Date");
    System.out.println("-------------------------------");
    for(Expense e : expenses) {

    System.out.printf ("%-15s $%-9.2f %-12s%n", e.item, e.amount, e.date);
    }
    // Calculate total
    double total = 0;
    for(Expense e : expenses) total += e.amount;
    System.out.println("-------------------------------");
    System.out.printf("Total Expenses: $%.2f%n", total);
    System.out.println("=== End of Expense Tracker ===");
}
}