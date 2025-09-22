
/**
 * Prompt user to three digit intger to now if it a palindrome.
 *
 * @author (Zaharra Chami)
 */
import java.util.*;
public class Palindrome
{
    public static void main (String [] args)
    {
       
        // tells who did the code
        System.out.println ("Programmer: Zaharra Chami");
        System.out.println ("Lab#:       3, part #2\n");
        
        // create new scanner
        Scanner input = new Scanner(System.in);
        
        // prompt user input
        System.out.print ("Enter a three-digit number: ");
        int number = input.nextInt();
        
        // defind first and last
        int first = Math.abs(number)/100;
        int last = Math.abs(number)%10;
        
        // if then statements
        if (first == last)
            System.out.println (number + " is a palindrome");
        else 
            System.out.println (number + " is not a palindrome");
        
    }
}
/*
Programmer: Zaharra Chami
Lab#:       3, part #2

Enter a three-digit number: 242
242 is a palindrome

Enter a three-digit number: 165
165 is not a palindrome

Enter a three-digit number: 525
525 is a palindrome

Enter a three-digit number: 725
725 is not a palindrome

 */