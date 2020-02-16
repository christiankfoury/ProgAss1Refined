// Importing the needed classes
import java.text.DecimalFormat;
import java.util.*;
public class Question5
{
public static void main(String[] args) {
// Using the random class
    Random rand = new Random();
// Genrerating 5 random number between 0 and 100
int num1 = rand.nextInt(100)+0;
int num2 = rand.nextInt(100)+0;
int num3 = rand.nextInt(100)+0;
int num4 = rand.nextInt(100)+0;
int num5 = rand.nextInt(100)+0;

// Ouput of the 5 generated numbers
System.out.println("These are the 5 generated numbers");
System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);


// Using the Math class to do power of 2 of the first generated number
    Double pwr2 = (Double) Math.pow(num1, 2);

    // Using the Math class to do power of 3 of the second generated number
    Double pwr3 = (Double) Math.pow(num2, 3);

// Using the Math class to do square root of the third generated number
    Double root = (Double) Math.sqrt(num3);

// Using the Math class to do natural logarihtm of the fourth generated number
    Double natLog = (Double) Math.log(num4);

// Using the Math class to do the logarithm of base 10 of the fifth generated number
    Double logBase10 = (Double) Math.log10(num5);


    // Usign the DecimalFormat class to set 2 digits after the decimal point
    DecimalFormat df = new DecimalFormat(".##");

    // Formatting each mathematical operation &
// Setting the the format with the valueOf method
    String format = df.format(pwr2);
    pwr2 = Double.valueOf(format);
    
    format = df.format(pwr3);
    pwr3 = Double.valueOf(format);
    
    format = df.format(root);
    root = Double.valueOf(format);

    format = df.format(natLog);
    natLog = Double.valueOf(format);

    format = df.format(logBase10);
    logBase10 = Double.valueOf(format);



// Output of the first mathematical operation
System.out.println(pwr2 + " is the power of 2 of the number " + num1);
// Output of the second mathematical operation
System.out.println(pwr3 + " is the power of 3 of the number " + num2);
// Output of the third mathematical operation
System.out.println(root + " is the square root of the number " + num3);
// Output of the fourth mathematical operation
System.out.println(natLog + " is the natural logarithm of the number " + num4);
// Output of the fifth mathematical operation
System.out.println(logBase10 + " is the logarithm base 10 of the number " + num5);




}

}