import java.util.Scanner;

public class StudentMarksArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes");
        int c = sc.nextInt();
        int [][] marks = new int [c][];

        for(int i=0; i<marks.length;i++){
            System.out.println("Enter the number of students in class " + (i+1));
            int s = sc.nextInt();
            marks[i] = new int[s];
        }

        for(int i=0; i<marks.length;i++){
            for(int j=0; j<marks[i].length;j++){
                System.out.println("Enter the marks of the Student " + (j+1) + " of class " + (i+1));
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<marks.length; i++){
            System.out.println("Class " + (i+1) + (": Student marks"));
            for(int j=0; j<marks[i].length; j++) {
                System.out.println(marks[i][j] + " ");
            }
            System.out.println();
        }

    }
}
