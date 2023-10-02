import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

// I learned how to use lists from here: https://www.w3schools.com/java/java_arraylist.asp

public class TipCalculator {
    private static final DecimalFormat df = new DecimalFormat("00.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> foodItems = new ArrayList<String>();

        System.out.println("This is the tip calculator!");
        System.out.println("---------------------------");
        System.out.print("Enter the number of people in your group: ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the tip percentage as an integer: ");
        int tip = scan.nextInt();
        scan.nextLine();
        double itemPrice = 0;
        String itemName = "0";

        while (itemPrice != -1) {
            System.out.print("Please enter the price of an item you've ordered in dollars and cents, e.g. 12.50 (-1 to end):  ");
            itemPrice = scan.nextDouble();
            scan.nextLine();
            prices.add(itemPrice);
            if (itemPrice == -1) {
                break;
            }
            System.out.print("Enter the item:  ");
            itemName = scan.nextLine();
            foodItems.add(itemName);
        }

        int index = prices.size() - 1;
        prices.remove(index);

        double sumPrices = 0;
        for (int i = 0; i < prices.size(); i++) {
            sumPrices = sumPrices + prices.get(i);
        }

        double tipPercentage = (double) tip / 100 ;

        double totalTip = tipPercentage * sumPrices;

        double billWithTip = sumPrices + totalTip;

        double perPersonCostBeforeTip = sumPrices / numberOfPeople;

        double tipPerPerson = totalTip / numberOfPeople;

        double overallCostPerPerson = billWithTip / numberOfPeople;

        double costPerItem = sumPrices / prices.size();

        System.out.println("---------------------------");
        System.out.println("Total bill before tip: $" + df.format(sumPrices));
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + df.format(totalTip));
        System.out.println("Total bill with tip: $" + df.format(billWithTip));
        System.out.println("Cost per item: $" + df.format(costPerItem));
        System.out.println("Per person cost before tip: $" + df.format(perPersonCostBeforeTip));
        System.out.println("Tip per person: $" + df.format(tipPerPerson));
        System.out.println("Total cost per person: $" + df.format(overallCostPerPerson));
        System.out.println("---------------------------");
        System.out.println("Items ordered:)");

        // I learned how to use for loops to iterate through lists from my friend who took AP CSA with Mr. Miller  last year :p
        for (int i = 0; i <= foodItems.size(); i++) {
            System.out.println(foodItems.get(i));
        }


    }
}


