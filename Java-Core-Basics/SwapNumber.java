import java.util.Scanner;
public class SwapNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A ");
        int A = sc.nextInt();
        System.out.println("Enter the number B ");
        int B = sc.nextInt();
        //before swap
        System.out.println("your number is this A= " +" "+A);
        System.out.println("your number is this B= " +" "+B);
    
        int temp = A;
         A = B;
         B = temp;
          //after swap
        System.out.println("Now the value of A is "+A);
        System.out.println("Now the value of B is "+B);
        System.out.println("Now the program is over and you can quit your program");
    }   
        
}
