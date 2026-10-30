DAY 7

1) Insertion Sort 

public class Main {
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 3, 4};

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


2) Selection Sort
 

public class Main {
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 3, 4};

        for (int i = 1; i < a.length-1; i++) {
            min = i;
        for (int j = i+1; j < a.length; j++) {
            if(a[j]<a[min]){
                min=j;
            }
        }int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

3) Bubble Sort

public class Main {
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 3, 4};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

4) Merge Sort

import java.util.Scanner;
public class Main {
    public static void mergesort(int a[],int left,int right) {
        if(left<right){
            int mid =(left+right)/2;
            mergesort(a,left,mid);
            mergesort(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }
    static void merge(int a[],int left,int mid,int right){
        int temp[]=new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=right){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
            }
        }while(j<=right){
            temp[k++]=a[j++];
        }for(i=left;i<=right;i++){
            a[i]=temp[i-left];
        }
    }public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Array size");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array element");
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergesort(a,0,n-1);
        System.out.println("sorted array");
        for(int i = 0;i<n;i++){
            System.out.println(a[i]+"");
        }
    }
}


# 2 Dimensional Araay

// Sum of each Row and Column


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
            System.out.println("Row sum = " + sum);
        }

        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum = sum + a[i][j];
            }
            System.out.println("Column sum = " + sum);
        }

        sc.close();
    }
} 

// Adding the elements of 2 Dimensional array with two different Array




