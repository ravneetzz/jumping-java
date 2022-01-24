
import java.util.Scanner;

public class charactertype {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.nextLine().charAt(0);
        if (ch >= 97 && ch <= 122) {
            System.out.println("lower case");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("upper case");
        } else if (ch >= 48 && ch <= 67) {
            System.out.println("digits");
        } else {
            System.out.println("other character");
        }
    }
}
