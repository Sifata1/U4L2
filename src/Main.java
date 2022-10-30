import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.println("How many numbers are in the circle? (n): ");
        Scanner s = new Scanner(System.in);

        int x = 1;
        int i =1;
        int n = s.nextInt();

        while (i < (n) ) {
            if(i == x) {
                x = 1;
            } else if (i != x) {
                x+=2;
            }
            i++;
        }
        System.out.print("The last number remaining is " + x);
    }
}
