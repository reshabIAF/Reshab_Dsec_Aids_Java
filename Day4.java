# sum of the digit

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("sum of digit:"+sum);
    }
}

# Greatest common divisor

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int gcd=1;
        int limit=Math.min(a,b);
        for (int i=1;i<=limit;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD="+gcd);
    }
}

# Number Tables

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=1;i<=10;i++){
         System.out.println(num+"x"+i+"="+(num*i));   
        }
    }
}

# Reverse countdown

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        while(num>=1){
            System.out.println("countdown"+num);
            num--;
        }
        System.out.println("Start!");
    }
}

#reverse the number

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int reverse=0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
        System.out.println("Reverse:"+reverse);
    }
}

# Pallindrome of a number

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int reverse=0;
        int original=n;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
        System.out.println("Reverse:"+reverse);
        if(original==reverse){
            System.out.println("This number is Pallindrom");
        }else{
            System.out.println("This number is not Pallidrome");
        }
    }
}

# Counting the number of digits

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("Number of digit:"+count);
    }
}

# Factorial of a number

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }  
        System.out.println("Factorial of the number:"+fact);
    }
}