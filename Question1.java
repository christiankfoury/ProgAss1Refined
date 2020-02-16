//Importing the needed classes
import java.text.DecimalFormat;
import java.util.*;
public class Question1
{
    public static void main(String[] args) {
        // Creating Scanner and naming kb (KeyBoard)
            Scanner kb = new Scanner(System.in);

        // Prompt the user and ask how many kilometers will be  travelled
            System.out.println("How many kilometers will be travelled?");
            double kilometers = kb.nextDouble();

        // Prompt the user and ask the average distance that the vehicle can run with 1 liter of gas
            System.out.println("What is the average distance that the vehicule can run with 1 liter of gas?");
        // Getting input from the user
            double avgdistance = kb.nextDouble();

        // Initialize the price of gas (1.16 CAD)
            double price =  1.16;

        // The formula to have the price of the gas
            double formula = (kilometers / avgdistance) * price;
         
        // Formatting the decimal format to make it 2 decimal place after the decimal point using the decimal format class
            DecimalFormat df = new DecimalFormat(".##");
          // Creating a string to format the price
            String format = df.format(formula);
          // Assigning the formula to the value of format
            formula = Double.valueOf(format);

        // Output the estimated cost of the trip
            System.out.print("The estimated cost of the trip will be: " + formula + "$ CAD");


        
        
    }
}