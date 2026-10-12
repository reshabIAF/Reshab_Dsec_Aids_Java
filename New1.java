import java.util.Scanner;
public class New1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Enter float number:");
        float f = sc.nextFloat();
        System.out.println("Hello World");
        System.out.println(a);
        System.out.println(s);
        System.out.println(f);
    }
}
