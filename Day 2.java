3)Even or Odd

class main{
    public static void main(String[] args){
        int a = 4;
        String EO=(a%2==0)?"Even":"odd";
        System.out.println(EO);
    }
}

4)positive and negative

import java.util.Scanner;

public class PN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        String PN =(num>0)?"positive":(num<0)?"negative":"zero";
        System.out.println(PN);
    }
}

5)Divisbility check

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc .nextInt();
        String divisble = (num%3==0 && num%5==0)?"divisble by 3 & 5":" not divisble by 3 & 5";
        System.out.println(divisble);
    }
}

6)greatest of three number
 
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a>=b)?((a>=c)?a:c):((b>=c)?b:c);
        System.out.println(largest);
    }
}

11)divisible by 7 or not 

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc .nextInt();
        String divisble = (num%7==0)?"lucky":"Unlucky";
        System.out.println(divisble);
    }
}

12)smallest of two number 

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1 = sc .nextInt();
        int num2 = sc .nextInt();
        int smaller = (num1<num2)?num1:num2;
        System.out.println(smaller);
    }
}
