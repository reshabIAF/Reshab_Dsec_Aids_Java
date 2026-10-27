DAY 5 

1) Prime number



import java.util.Scanner;

public class Main {

  public static void main(String\[] args) {

      Scanner sc = new Scanner(System.in);

       System.out.println("enter the number");

       int n = sc.nextInt();

       int count=0;

       for (int i=1;i<=n;i++){

           if(n%i==0){
             count++;
           }

     }if(count==2){

           System.out.println("prime number");

       }else{

          System.out.println("not a prime number");
       }

   }

}


2)Perfect Number( adding the factors of the number to get the same number)



import java.util.Scanner;

public class Main {

  public static void main(String\[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("enter the number");

       int n = sc.nextInt();

       int sum=0;

       for (int i=1;i<n;i++){

          if(n%i==0){

               sum=sum+i;

           }

       }if(sum==n){

           System.out.println("perfect number");

       }else{

           System.out.println("not a perfect number");

       }

   }

}



3) Amstrong Number( adding the cube of the number to get the input number)



import java.util.Scanner;

public class Main {

   public static void main(String\[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("enter the number");

       int n = sc.nextInt();

       int temp=n,sum=0;

      while(temp>0){

           int digit = temp%10;

           sum =sum + digit\*digit\*digit;

           temp = temp/10;

      }if(sum==n){;

           System.out.println("Amstrong number");

      }else{

           System.out.println("not a Amstrong number");

      }

   }

}



4)Neon Number(the squared of the number in which the digit is added to get the squared digit)



import java.util.Scanner;

public class Main {

   public static void main(String\[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("enter the number");

      int n = sc.nextInt();

       int square=n\*n,sum=0;

       while(square>0){

           int digit = square%10;

           sum =sum + digit;

           square=square/10;

      }if(sum==n){
          System.out.println("neon number");

       }else{

           System.out.println("not a neon number");

       }

   }

}



5) Spy Number ( sum of the digit and the multiple of the digit should be same )





import java.util.Scanner;

public class main {

   public static void main(String\[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("enter the number");

      int n = sc.nextInt();

      int temp=n,sum=0,product=1;

    while(temp>0){
           int digit=temp%10;

           sum = sum + digit;

          product = product\*digit;

           temp = temp/10;

       }if(sum==product){

           System.out.println("spy number");

      }else{

           System.out.println("spy number");

       }

  }

}




 PATTERN



6)





