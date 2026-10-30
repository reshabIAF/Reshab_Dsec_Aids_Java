DAY 9

##  String Builder 
 
1) Removing Space from the String 

import java.util.Scanner;
public class Main{
    public static void main( String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter string : ");
        String br= sc.nextLine();
        StringBuilder sb = new StringBuilder(br);
        for( int i = 0; i<sb.length(); i++){
            if( sb.charAt(i) == ' '){
                sb.deleteCharAt(i);
                i++;
            }
        }
        System.out.println(sb);
    }
}

2) Reversing the last 3 character of a string 

import java.util.Scanner;
public class Main{
public static void main( String[]args){
    Scanner sc = new Scanner( System.in);
    System.out.print(" Enter sentences:");
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    if(sb.length()>=3){
        StringBuilder last = new StringBuilder( sb.substring(sb.length()-3));
        last.reverse();
        sb.replace(sb.length()-3,sb.length(),last.toString());
        System.out.println(sb);
    }
    else{
        System.out.println(" enter atleast 3 characters");
    }
}
}

3) Removing the 1st & last character from the string 

import java.util.Scanner;
public class Main{
public static void main( String[]args){
    Scanner sc = new Scanner( System.in);
    System.out.print(" Enter sentences:");
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    if(sb.length()>=2){
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
    else{
        System.out.println(" enter atleast 3 characters");
    }
}
}

## BufferedReader 

1) Basic program

import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader( 
            new InputStreamReader(System.in));
        System.out.println(" enter your name");
        String name = br.readLine();
        System.out.print("welcome  " + name);
        
    }
}

2) Paying electricity Bill 

import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader( 
            new InputStreamReader(System.in));
        System.out.print(" Enter unit used:  ");
        int unit = Integer.parseInt(br.readLine());
        double bill;
        if(unit<0){
            System.out.println("Invaild bill");
            return;
        }
        if(unit <= 100){
            bill = unit*2.5;
        }else if(unit <= 200){
            bill =(100*2)+(unit-100)*3;
        }else{
            bill=(100*2)+(100*3)+(unit-200)*5;
        }
        System.out.print("bill to pay : " +bill);    
    }
}

3) Counting the number of even and odd number 

import java.io.*;
public class Main{
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Starting Number : ");
        int Start = Integer.parseInt(br.readLine());
        System.out.print("Enter the ending Number : ");
        int End = Integer.parseInt(br.readLine());
        int Even= 0,Odd = 0;
        for(int i = Start;i<=End;i++){
            if(i%2==0){
                Even++;
            }else{
                Odd++;
            }
        }System.out.println("The number  of even number : "+Even);
        System.out.println("The number of Odd number : " + Odd);
    }
}

4) Write a Java program using StringBuilder to remove all vowels from a given sentence.

import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String br = sc.nextLine();
        StringBuilder ch = new StringBuilder(br);
        for(int i = 0;i<ch.length();i++){
            char sb=ch.charAt(i);
            if(sb == 'a' || sb == 'e' || sb == 'i' || sb == 'o' || sb == 'u'||sb == 'A' || sb == 'E' || sb == 'I' || sb == 'O' || sb == 'U'){
                ch.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("After Removing the vowels from the String : " + ch);
    }
}

5)