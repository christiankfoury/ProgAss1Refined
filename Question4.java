import java.util.*;
public class Question4
{
    public static void main(String[] args) {
        // Creating Scanner and naming kb (KeyBoard)
        Scanner kb = new Scanner(System.in);

        // Prompt the user and ask for a URL
        System.out.println("Enter a URL: ");
        // Input from the user and then trimming from any leading or trailling white space
        String url = kb.nextLine();
        url = url.trim();

        // Calling the method "length" for the amount of characters in the URL
        int length = url.length();

        // Output
        System.out.println("Verifying an URL with " + length + " characters");
        
        // If statement to see if the input from the user starts with http://
        // Using the startsWith method to see if the input from the user starts with http://
            if (url.startsWith("https://")){
               // Output if true
                System.out.println("Is this a valid and secure URL? true.");
            }
                    else {
                        // Output if false
                        System.out.println("Is this a valid and secure URL? false.");
                    }
            }
        


    }