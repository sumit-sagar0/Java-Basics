import java.util.*;
public class GcdFinder {
    public static void main(String[] args){
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(b!=0) {
            int rem = a%b;
            a=b;
            b=rem;
        }
        System.out.println("Gcd is: " + a);
    }
}
