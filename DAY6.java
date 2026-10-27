DAY6

1) Insertion

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        int n=4;
        System.out.println("enter the value");
        int value= sc.nextInt();
        System.out.println(" enter index(0 to"+ n+"):");
        int pos= sc.nextInt();
        if(pos<0||pos>n||n==a.length){
            System.out.println("invalid insertion");
        }
        else{
        for(int i = n;i< pos;i--){
            a[i]=a[i-1];
        }
            a[pos]=value;
        n++;
        for(int i=0;i<n;i++){
        System.out.println(a[i]+"");
        }
    }
        sc.close();
}
}

2) Updating

public class Main {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        a[1]=99;
        for(int i =0;i<a.length;i++){
        System.out.println(a[i]+"");
        }
    }
}

3)deletion

public class Main {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int n=5;
        int pos=2;
        for(int i =pos;i<n-1;i++){
            a[i]=a[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
        System.out.println(a[i]+"");
        }
    }

SEARCH method
 
1)Linear Search 

public class main {
    public static void main(String[] args) {
        int a[]={40,10,30,20,50};
        int key = 20;
        int pos = -1;
        for (int i = 0;i<a.length;i++){
            if(a[i]== key){
                pos=i;
                break;
            }
        }
        if(pos !=-1){
            System.out.println("found at index "+pos);
        }else{
            System.out.println("not found");
        }
}
}

2) Binary Search

public class main {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int key = 60;
        int low = 0;
        int high = a.length -1;
        int pos = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==key){
                pos=mid;
                break;
            }else if(key>a[mid]){
                 low= mid+1;
            }else{
                 high= mid-1;
            }
        }
        if(pos!=-1){
            System.out.println("found at index "+pos);
        }else{
            System.out.println("not found");
        }
}
}

3) Finding the largest number in an Array

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a[]= new int[5];
            System.out.println("Enter the 5 element");
            for(int i=0;i<5;i++){
                    a[i]=sc.nextInt();
            }
            int max= a[0];
            for(int i=1;i<5;i++){
                if(a[i]>max){
                        max=a[i];
                }
            }
            System.out.println("largest element="+max);
            sc.close();
    }    
}

4) Finding the Smallest element in Array

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a[]= new int[5];
            System.out.println("Enter the 5 element");
            for(int i=0;i<5;i++){
                    a[i]=sc.nextInt();
            }
            int max= a[0];
            for(int i=1;i<5;i++){
                if(a[i]<max){
                        max=a[i];
                }
            }
            System.out.println("smallest element="+max);
            sc.close();
    }    
}

5) Finding the Second largest element

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a[]= new int[5];
            System.out.println("Enter the 5 element");
            for(int i=0;i<5;i++){
                    a[i]=sc.nextInt();
            }
            int largest= a[0];
            int secondlarge=Integer.MIN_VALUE;
            for(int i=1;i<5;i++){
                if(a[i]>largest){
                        secondlarge=largest;
                        largest=a[i];
                }else if(a[i]>secondlarge && a[i]<largest){
                        secondlarge=a[i];
                }
            }
            if(secondlarge==Integer.MIN_VALUE){
            System.out.println("2nd largest element not found");
            }else{
                    System.out.println("second largest ="+secondlarge);
            }
            sc.close();
    }    
}

6) moving zeros at the end and separating it with Null Zeros

