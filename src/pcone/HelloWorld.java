package pcone;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

    public static void MergeSort(int[] a, int m, int n){
        if(m<n){
            int r = m +(n-m)/2;
            MergeSort(a,m,r);
            MergeSort(a,r+1,n);
            Merge(a,m,n);
        }
    }

    public static void Merge(int[] a, int l, int r){
        int[] b = new int[r-l+1];
        int m = l +(r-l)/2;
        int i = l,j = m+1;
        int k = 0;
        while(i<=m&&j<=r){
            if(a[i]<=a[j]){
                b[k] = a[i];
                i++;
                k++;
            }else{
                b[k] = a[j];
                k++;
                j++;
            }
        }
        if(i>m)
            for(;k<=r-l;k++,j++) b[k] = a[j];
        if(j>r)
            for(;k<=r-l;k++,i++) b[k] = a[i];
        for(int t = 0;t<=r-l;t++)
            a[l+t] = b[t];
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = keyboard.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        double average = 0.0;

        for(int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();
        }

        MergeSort(arr,0,n-1);

        System.out.println("Array after sorted:");
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        average = (double) sum / n;

        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);
    }
}
