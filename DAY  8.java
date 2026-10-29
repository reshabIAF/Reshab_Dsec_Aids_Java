DAY  8

1) Transpose of an 2D Array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][3];
        System.out.println("Enter 6 elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of array:");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 2; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
} 

2) Identity Matrix 

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        boolean identity= true;
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }
        for( int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (i == j && a[i][j] != 1){
                    identity = false;
                }
                else if (i != j && a[i][j] != 0){
                    identity=  false;
                }
            }
        }
        if (identity){
            System.out.print(" identity matrix");
        }else{
            System.out.print("not identity matrix");
        }
    }
}

3) Largest value in 2D Array

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a[][]=new int[2][3];
            for(int i=0; i<2; i++){
            for(int j=0; j<3;j++){
                a[i][j]= sc.nextInt();
            }
            }
        int largest=a[0][0];
        for(int i=0; i<2; i++){
            for(int j=0; j<3;j++){
                if (a[i][j]>largest){
                    largest=a[i][j];
                }
            }
        }
        System.out.println("largest = " + largest);
    }
}
  
##STRING 

4) Find the Length of the String 


import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String name=sc.nextLine();
            int len=name.length();
        System.out.print(len);
    }
}

5) Reversing the String 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
            System.out.print(rev);
    }
}

6) Pallindrome 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

7) counting the number of vowels and consonant in a String 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = sc.nextLine().toLowerCase();
        int vowels=0,consonants=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
                    vowels++;
                } else{
                consonants++;
                }
            }
        }
        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + consonants);
    }
}

8) Reversing the each Word in a String

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String result =" ";
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            for(int j = word.length()-1;j>=0;j--){
                result = result + word.charAt(j);
            }
            if(i<words.length - 1){
                result+=" ";
            }
        }
    System.out.println(result);
    }
}

9) Anagram (Both words must contain the same letters with the same frequency, but the order can be different)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st word :");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd word :");
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
        }else{
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();
            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);
            if(java.util.Arrays.equals(a,b)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }
    }
}
