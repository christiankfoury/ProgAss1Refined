//Importing the needed classes
import java.text.DecimalFormat;
import java.util.*;
public class Question2
{
    public static void main(String[] args) {
          // Creating Scanner and naming kb (KeyBoard)
            Scanner kb = new Scanner(System.in);

          // Prompt the user
            System.out.println("Enter the price of a product: ");
            double price = kb.nextDouble();

          // Initializing the tps (5%), tvq (9.9975%) and tips value (15%)
            double tps = price * 0.05;
            double tvq = price * 0.09975;
            double tips = price * 0.15;
        

          // Using the decimal format class to set the price 2 digits after the decimal point
            DecimalFormat df = new DecimalFormat(".##");
          
          // Creating a string to format the price
            String format = df.format(price);
          // Assigning the value of price to the value of format
            price = Double.valueOf(format);
          // Output the original product price
            System.out.println("Product: " + price + " $CAD");
            
          
          // Creating a string to format the tps
            format = df.format(tps); 
          // Assigning the value of tps to the value of format
            tps = Double.valueOf(format);
          // Output the tps price
            System.out.println("TPS: " + tps + " $CAD");

          // Creating a string to format the tvq
            format = df.format(tvq);
          // Assigning the value of tvq to the value of format
            tvq = Double.valueOf(format);
          // Output the tvq price
            System.out.println("TVQ: " + tvq + " $CAD");
  
  
        
          // Creating a string to format the tips
            format = df.format(tips);
          // Assigning the value of tips to the value of format
            tips = Double.valueOf(format);
          // Output the price of the tips 
            System.out.println("Tips: " + tips + " $CAD");
                      
          
        
          // Formula of the final price. (price + taxe (tps + tvq) + tips)
            double finalPrice = price + (tps) + (tvq) + (tips);
          // Creating a string to format the final price
            format = df.format(finalPrice);
          // Assigning the value of tips to the value of format
            finalPrice = Double.valueOf(format);
          // Output the price after the taxe and the tips
            System.out.println("Total: " + finalPrice + " $CAD");



    }
}