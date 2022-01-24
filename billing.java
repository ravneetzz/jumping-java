
import java.util.Scanner;

public class billing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if (n <= 100) {
            System.out.println("free");
        }
        if (n > 100 && n <= 200) {
            System.out.println(Math.round((100 * 0) + ((n-100) * 0.40)));
        }
        if (n > 200 && n <= 300) {
            System.out.println(Math.round((100 * 0) + (100 * 0.40) + ((n-200)* 0.80)));
        }
        if (n > 300) {
            System.out.println(Math.round((100 * 0) + (100 * 0.40) + (100 * 0.80) + ((n-300)* 1.20)));
        }
    }
}
