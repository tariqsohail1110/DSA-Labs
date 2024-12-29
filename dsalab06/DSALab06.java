/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab06;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class DSALab06 {
    //Lab Task 01
    //Declare an array of size 10 to store account balances. Initialize with
    //values 0 to 1000000. Check all array if any value is less than 10000.
//    public static void search(int[] a){
//        for(int i = 0; i < a.length; i++){
//            if(a[i] < 10000){
//                System.out.println("Account No: " + (i + 1) + " has Low Balance. "
//                        + "Balance: " + a[i]);
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] accountBalances = {2000, 100000, 890000, 1200, 3400, 400000, 5000,
//        2000, 100000, 349000};
//        search(accountBalances);
//    }
    
    
    //Lab Task 02
    //Write a program to search in array using built in class
//    public static void main(String[] args){
//        int[] arr = {2000, 100000, 890000, 1200, 3400, 400000, 5000,
//        2000, 100000, 349000};
//        int key = 5000;
//        Arrays.sort(arr);
//        int i = Arrays.binarySearch(arr, key);
//        if(i > 0){
//            System.out.println("Key (" + key + ") found at index " + i);
//        }else{
//            System.out.println("Key (" + key + ") not found at index " + i);
//        }
//    }
    
    
    //Lab Task 03
    //Given an unsorted array arr of integers, find the smallest positive 
    //integer that is missing from the array. You need to implement this 
    //using binary search. The array can contain both negative numbers 
    //and positive numbers, and you can assume that the array does not 
    //have duplicates.
//    public static void smallestElement(int[] a){
//        Arrays.sort(a);
//        int smElement = 1;
//        for(int n : a){
//            if(n == smElement){
//                smElement++;
//            }
//        }
//        System.out.println("The smalllest missing positive integer is: " + 
//                smElement);
//    }
//    public static void main(String[] args){
//        int[] myarr = {3, 4, -1, 1, -5, 2, 7, 8};
//        smallestElement(myarr);
//    }
    
    //Lab Task 04
    //You are given a sorted array arr[] and a target element target.
    //Your task is to find the first occurrence of the target in the 
    //array using binary search. If the target is not found, return -1
//    public static void binarySearch(int[] a){
//        Arrays.sort(a);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your key.");
//        int key = input.nextInt();
//        boolean found = false;
//        int l = 0;
//        int r = a.length - 1;
//        while(l <= r){
//            int m = (l+r)/2;
//            if(key == a[m]){
//                found = true;
//                System.out.println("Key Found!");
//            }
//            if(key > a[m]){
//                l = m + 1;
//            }else{
//                r = m - 1;
//            }
//            if(found) break;
//        }
//        if(found == false) 
//        System.out.println(-1);
//    }
//    public static void main(String[] args){
//        int[] arr = {1000, 2311, 2611, 90, 45};
//        binarySearch(arr);
//    }
    
    
    //Home Task 01
    //Write a program initializing array of size 20 and search an
    //element using binary search.
//    public static void binarySearch(int[]a){
//        Arrays.sort(a);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your key:");
//        int key = input.nextInt();
//        boolean notFound = true;
//        int l = 0;
//        int r = a.length - 1;
//        while(l <= r){
//            int m = (l+r)/2;
//            if(key == a[m]){
//                System.out.println("Key " + key + " found at index " + a[m]);
//                notFound = false;
//            }
//            if(key > a[m]){
//                l = m + 1;
//            }
//            else{
//                r = m - 1;
//            }
//        }
//        if(notFound == true){
//            System.out.println("Key not found!");
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {2,3,5,1,6,7,3,9,13,2,16,17,21,34,33,22};
//        binarySearch(arr);
//    }
    
    //Home Task 02
    //Write a function called occurrences that, given an array of numbers A, 
    //prints all the distinct values in A each followed by its number of 
    //occurrences. 
    //For example, if A = (28, 1, 0, 1, 0, 3, 4, 0, 0, 3), the function should
    //output the following five lines (here separated by a semicolon)
    //“28 1; 1 2; 0 4; 3 2; 4 1”.
//    public static void occurences(int[] a){
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        for(int n : a){
//            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
//            
//        }
//        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
//            System.out.print(entry.getKey() + " "  + entry.getValue() + "; ");
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {28, 1, 0, 1, 0, 3, 4, 0, 0, 3};
//        occurences(arr);
//    }
    
    //Home Task 03
    //Assume a bank's system needs to identify accounts with critically 
    //low balances and alert the user. Test the function with various balance 
    //values to ensure it correctly identifies all accounts below the threshold.
    public static void lowBalance(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] < 10000){
                System.out.println("Account No: " + (i + 1) + " has Critically "
                        + "Low Balance. " + "Balance: " + a[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] accountBalances = {2000, 100000, 890000, 1200, 3400, 400000, 5000,
        2000, 100000, 349000};
        lowBalance(accountBalances);
    }
    
}
