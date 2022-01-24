
import java.util.Scanner;

public class largestnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("LARGEST IS " + a);
        }
        if (b > a && b > c) {
            System.out.println("LARGEST IS " + b);
        }
        if (c > a && c > b) {
            System.out.println("LARGEST IS " + c);
        }
    }
}
