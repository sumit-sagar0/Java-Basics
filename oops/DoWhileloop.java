import java.util.*;
public class DoWhileloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 1;
        char input;

        do{
            System.out.println("Hello Welcome..");
            System.out.println("Number is: " + num);
            System.out.println("Continue?");
            input = sc.next().charAt(0);
            num++;
        }while(input == 'y' || input == 'Y');

       
    }
}
