import java.util.*;
public class FindMaxAndMinElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
        }

        int maxarr = arr[0];
        int minarr = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxarr){
                maxarr = arr[i];
            }
            if(arr[i]<minarr){
                minarr = arr[i];
            }
        }
        System.out.println("max array " + maxarr);
        System.out.println("mix array " + minarr);

    }
}
