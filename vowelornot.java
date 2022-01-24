import java.util.Scanner;
public class vowelornot
{
    public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a character");
 char ch= sc.nextLine().charAt(0);
 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
 {System.out.println("vowel");}
 else
    {System.out.println(" not a vowel");} 

}
}