import java.util.*;
public class PalindromeNub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        int rev = 0;
        int original = number;
        while(number != 0) {
            int lastdigit = number % 10;
            rev = rev * 10 + lastdigit;
            number = number/10;
        }

        if(original == rev) {
            System.out.println("Number is palindrome number:");
        }else {
            System.out.println("number is not a palindrome:");
        }
    }
}
