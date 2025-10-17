package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int SALESPEOPLE;
        System.out.print("Enter the number of salespeople: ");
        SALESPEOPLE = scan.nextInt();

        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        // variables for maximum sale:
        int maxID = 0;   // id of salesperson with max sale
        int maxSale = 0; // max sale
        // variables for minimum sale:
        int minID = 0;   // id for salesperson with min sale
        int minSale = Integer.MAX_VALUE; // min sale

        for (int i=0; i<sales.length; i++)
        {
            if (sales[i] > maxSale){
                maxSale = sales[i];
                maxID = i;
            }
            if (sales[i] < minSale){
                minSale = sales[i];
                minID = i;
            }
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        //Computing average:
        double avg = (double) sum / SALESPEOPLE;
        System.out.println("Average sale: " + avg);

        //Printing maximum sale: ( the maximum sale is found in the loop above )
        System.out.println("Salesperson " + maxID + " had the highest sale with $" + maxSale);
        //Printing minimum sale: ( the minimum sale is found in the loop above )
        System.out.println("Salesperson " + minID + " had the min sale with $" + minSale);

        // 4) salespeople who exceeded entered value
        int salesThreshold = 0;
        System.out.print("\nEnter a sales value: ");
        salesThreshold = scan.nextInt();
        System.out.println("SalesPeople exceeding threshold $" + salesThreshold + " : ");

        for (int i = 0; i < sales.length; i++){
            if (sales[i] > salesThreshold){
                System.out.println(" " + (i+1) + " : " + sales[i]);
            }
        }
    }
}