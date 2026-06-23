import java.util.Scanner;
public class FunctionOverloading{
    //function overloading in different type of parameter.....
public static int sum(int a, int b){
    return a+b;
}
public static int sum(int a, int b, int c){
    return a+b+c;
}
//function overloading in different type of datatype.........
public static float sum(float a,float b){
    return a +b;
}
    public static void main(String []agrs){
        
            System.out.println("Funvtion overloading in java:.............");
            System.out.println(sum(150,154));
            System.out.println(sum(10,20,30));
            System.out.println(sum(12.8f , 12.2f));
    }
}