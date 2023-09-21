import java.util.Scanner;
import java.util.*;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> prices = new ArrayList<Double>();

        System.out.println("This is the tip calculator!");
        System.out.println("---------------------------");
        System.out.print("Enter the number of people in your group: ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the tip percentage as an integer: ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        double itemPrice = 0;

        while (itemPrice != -1) {
        System.out.print("Please enter the price of an item you've ordered in dollars and cents (-1 to end):  ");
        itemPrice = scan.nextDouble();
        scan.nextLine();
        prices.add(itemPrice);
        }
        int index = prices.size() - 1;
        prices.remove(index);
        System.out.println("done " + prices);
    }
}
