/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab05;

import java.util.Arrays;
import java.util.Scanner;

public class DSALab05 {
    //Lab Task 01
    //Write a program for Selection sort that sorts an array containing numbers,
    //prints all the sort values of array each followed by its location.
//    public static void selectionSort(int[] a){
//        System.out.println("Array before sorting: " + Arrays.toString(a));
//        for(int m = a.length-1; m > 0; m--){
//            int max = m;
//            for(int i = 0; i < m; i++){
//                if(a[i] > a[max]){
//                    max = i;
//                }
//            }
//            int temp = a[m];
//            a[m] = a[max];
//            a[max] = temp;
//        }
//        System.out.println("Array after sorting: " + Arrays.toString(a));
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Length of the array: ");
//        int len = input.nextInt();
//        int[] arr = new int[len];
//        System.out.println("Enter the array elements: ");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//        selectionSort(arr);
//    }
    
    
    //Lab Task 02
    //Write a program that takes 10 numbers as input in an array. Sort the 
    //elements of array //by using Bubble sort. Print each iteration of the 
    //sorting process.
//    public static void bubbleSort(int[] a){
//        System.out.println("Array before sorting: " + Arrays.toString(a));
//        int pass;
//        for(pass = 0; pass < a.length-1; pass++){
//            for(int i = 0; i < a.length-1; i++){
//                if(a[i] > a[i+1]){
//                    int temp = a[i];
//                    a[i] = a[i+1];
//                    a[i+1] = temp;
//                }
//            }
//        }
//        System.out.println("Array after sorting: " + Arrays.toString(a));
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Length of the array: ");
//        int len = input.nextInt();
//        int[] arr = new int[len];
//        System.out.println("Enter the array elements: ");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//        bubbleSort(arr);
//    }
    
    
    //Lab Task 03
    //Write a program that takes 10 random numbers in an array. Sort the 
    //elements of array by using Merge sort applying recursive technique.
    //Print each iteration of the sorting process.
//    public static void conquer(int[] a, int si, int mid, int ei){
//        int mergedArray[] = new int[ei - si + 1];//10 - 0 + 1 = 11
//        int idx1 = si;
//        int idx2 = mid + 1;
//        int x = 0;
//        
//        while(idx1 <= mid && idx2 <= ei){
//            if(a[idx1] <= a[idx2]){
//                mergedArray[x] = a[idx1];
//                x++; idx1++;
//            }
//            else{
//                mergedArray[x] = a[idx2];
//                x++; idx2++;
//            }
//        }
//        while(idx1 <= mid){
//            mergedArray[x] = a[idx1];
//            x++; idx1++;
//        }
//        while(idx2 <= ei){
//            mergedArray[x] = a[idx2];
//            x++; idx2++;
//        }
//        for(int i = 0, j = si; i < mergedArray.length; i++, j++){
//            a[j] = mergedArray[i];
//        }
//    }
//    public static void mergeSort(int[] a, int si, int ei){
//        if(si >= ei){
//            return;//Base Case
//        }
//        int mid = si + (ei - si) / 2;// 0 + (10 - 0) / 2 = 5
//        mergeSort(a, si, mid);
//        mergeSort(a, mid + 1, ei);
//        conquer(a, si, mid, ei);
//        
//    }
//    public static void main(String[] args){
//        int[] arr = {10,9,8,7,4,6,5,1,3,2};
//        int n = arr.length;
//        System.out.println("Before Sorting");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("After Sorting");
//        mergeSort(arr, 0, n-1);
//        System.out.println(Arrays.toString(arr));   
//    }
    
    
    //Home Task 02
    //Write a program which takes an unordered list of integers (or any other 
    //objects e.g. String), you have to rearrange the list in their natural 
    //order using merge sort.
    public static void conquer(String[] a, int si, int mid, int ei){
        String[] mergedArray = new String[ei - si +1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        
        while(idx1 <= mid && idx2 <= ei){
            if(a[idx1].compareTo(a[idx2]) <=0){
                mergedArray[x] = a[idx1];
                x++; idx1++;
            }
            else{
                mergedArray[x] = a[idx2];
                x++; idx2++;
            }
        }
          //Adding remaining elements from first division
        while(idx1 <= mid){
            mergedArray[x] = a[idx1];
            x++; idx1++;
        }
      //Adding remaining elements from second division
        while(idx2 <= ei){
            mergedArray[x] = a[idx2];
            x++; idx2++;
        }
        for(int i = 0, j = si; i < mergedArray.length; i++, j++){
            a[j] = mergedArray[i];
        }
    }
    public static void mergeSort(String[] a, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(a, si, mid);
        mergeSort(a, mid + 1, ei);
        conquer(a, si, mid, ei);
    }
    public static void main(String[] args){
        String[] strarr = {"Bus", "Car", "Aeroplane", "Apple", "Ground"};
        int n = strarr.length;
        System.out.println("String Array After Sorting: " + Arrays.toString(strarr));
        mergeSort(strarr, 0, n-1);
        System.out.println("String Array After Sorting: " + Arrays.toString(strarr));
    }

    
    
    //Home Task 03
    //You are given an unordered list of integers or strings. Write a program 
    //to Take this list as input. Sort it in natural order using Merge Sort.
    //For integers, this means ascending order. For strings, this means
    //alphabetical order. Print the sorted list.
//    public static void conquer(int[] a, int si, int mid, int ei){
//        int[] mergedArray = new int[ei - si + 1];
//        int idx1 = si;
//        int idx2 = mid + 1;
//        int x = 0;
//        
//        while(idx1 <= mid && idx2 <= ei){
//            if(a[idx1] <= a[idx2]){
//                mergedArray[x] = a[idx1];
//                x++; idx1++;
//            }
//            else{
//                mergedArray[x] = a[idx2];
//                x++; idx2++;
//            }
//        }
//        while(idx1 <= mid){
//            mergedArray[x] = a[idx1];
//            x++; idx1++;
//        }
//        while(idx2 <= ei){
//            mergedArray[x] = a[idx2];
//            x++; idx2++;
//        }
//        for(int i = 0, j = si; i < mergedArray.length; i++, j++){
//            a[j] = mergedArray[i];
//        }
//    }
//    public static void mergeSort(int[] a, int si, int ei){
//        if(si >= ei){
//            return;
//        }
//        int mid = si + (ei - si) / 2;
//        mergeSort(a, si, mid);
//        mergeSort(a, mid + 1, ei);
//        conquer(a, si, mid, ei);
//    }
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the length of the list");
//        int l = input.nextInt();
//        int[] arr = new int[l];
//        System.out.println("Enter the lsit elements");
//        for(int i = 0; i < l; i++){
//            arr[i] = input.nextInt();
//        }
//        System.out.println("Unsorted List");
//        System.out.println(Arrays.toString(arr));
//        mergeSort(arr, 0, l-1);
//        System.out.println("Sorted List");
//        System.out.println(Arrays.toString(arr));
//    }
    
    
    
    //Home Task 01
    //Declare an array of size n to store account balances. Initialize with 
    //values 0 to 100000 and sort Account No’s according to highest balance 
    //values by using Quick sort, For e.g.:
    //Account No. 3547 Balance 28000
    //Account No. 1245 Balance 12000
//    public static int partition(int[] a, int low, int high){
//        int pivot = a[high];
//        int i = low-1;
//        
//        for(int j = low; j < high; j++){
//            if(a[j] < pivot){//for ascending if(a[j] < pivot){}
//                i++;
//                //Swapping
//                int temp = a[i];
//                a[i] = a[j];
//                a[j] = temp;
//            }
//        }
//        i++;
//        int temp = a[i];
//        a[i] = pivot;
//        a[high] = temp;
//        return i; //pivot Index
//    }
//    public static void quickSort(int[] a, int low, int high){
//        if(low < high){
//            int pidx = partition(a, low, high);
//            quickSort(a, low, pidx-1);
//            quickSort(a, pidx+1, high);
//        }
//    }
//    public static void main(String[] args){
//        
//    }
}
