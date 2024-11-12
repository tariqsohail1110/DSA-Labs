/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab04;
import java.util.Arrays;
import java.util.Scanner;
public class DSALab04 {
//    Lab Task 01
//    Write a program that takes two arrays of size 4 and swap the elements of those arrays.
//    public static void arraySwap(int[] a, int[] b){
//       int[] c = b;
//       b = a;
//       a = c;
//       System.out.println("Array 1 after swapping");
//       System.out.println(Arrays.toString(a));
////       for(int elements : a){
////           System.out.println(elements);
////       }
//       System.out.println("Array 2 after swapping");
//       System.out.println(Arrays.toString(b));
////       for(int elements : b){
////           System.out.println(elements);
////       }
//    }
//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4};
//        int[] arr2 = {5,6,7,8};
//        System.out.println("Array 1 before swapping");
//        System.out.println(Arrays.toString(arr1));
////        for(int elements : arr1){
////           System.out.println(elements);
////        }
//        System.out.println("Array 2 before swapping");
//        System.out.println(Arrays.toString(arr2));
////        for(int elements : arr2){
////           System.out.println(elements);
////        }
//        arraySwap(arr1, arr2);
//    }
    
    
    //Lab Task 02
    //Add a method in the class that takes array and merge it with the existing one.
//    public static void arrayMerge(int[] a, int [] b){
//        int n = a.length + b.length; //to eliminate hard code (a fixed value).
//        int[] c = new int[n];
//        for(int i = 0; i < a.length; i++){
//            c[i] = a[i];
//        }
//        for(int i = 0; i < b.length; i++){
//            c[a.length + i] = b[i];
//        }
//        System.out.println(Arrays.toString(c));//Writes the array in one line
//    }
//    public static void main(String[] args){
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {6,7,8,9,10};
//        arrayMerge(arr1, arr2);
//    }
    
    
    //Lab Task 03
    //In a JAVA program, take an array of type string and then check whether the 
    //strings are palindrome or not.
//    public static void palindromeChecker(String[] s){
//        for(int a = 0; a < s.length; a++){
//            String currentString = s[a];
//            boolean isPalindrome = true;
//            int i = 0;
//            int j = currentString.length()-1;
//            while(i < j){
//                if(currentString.charAt(i) != currentString.charAt(j)){
//                    isPalindrome = false;
//                    break;
//                }
//                i++;
//                j--;
//            }
//            if(isPalindrome){
//                System.out.println("The String " + currentString + " is a Palindrome");
//            }
//            else{
//                System.out.println("The String " + currentString + " is not a Palindrome");
//            }
//        }
//    }
//    public static void main(String[] args){
//        String[] str = {"aba", "racecar", "dad", "hello", "world"};
//        palindromeChecker(str);
//    }
    
    
    //Lab Task 04
    //Given an array of integers, count how many numbers are even and how many are odd
//    public static void evenOdd(int[] a){
//            int m = 0;
//            int n = 0;
//        for(int i = 0; i < a.length; i++){
//            int currentNumber = a[i];
//            if(currentNumber % 2 == 0){
////                System.out.println(currentNumber + " is Even.");
//                m++;
//            }
//            else{
////                System.out.println(currentNumber + " is odd");
//                n++;
//            } 
//        }
//        System.out.println("The number of even numbers are: " + m);
//        System.out.println("The number of odd numbers are: " + n);
//    }
//    public static void main(String[] args){
//        int[] arr1 = {1,2,3,4,5,6,7,8,9};
//        evenOdd(arr1);
//    }


    //Lab Task 05
    //. Given two integer arrays, merge them and remove any duplicate values
    //from the resulting array.
//        public static void arrayMerge(int[] a, int [] b){
//            int n = a.length + b.length; //to eliminate hard code (a fixed value).
//            int[] c = new int[n];
//            int[] temp = new int[c.length];//temporary array to store unique
//            //elements
//            int j = 0;//for indexing the temporary array
//            for(int i = 0; i < a.length; i++){
//                c[i] = a[i];
//            }
//            for(int i = 0; i < b.length; i++){
//                c[a.length + i] = b[i];
//            }
//            Arrays.sort(c);//sort the resultant array
//            for(int i = 0; i < c.length-1; i++){
//                if(c[i] != c[i + 1]){
//                    temp[j] = c[i];
//                    j++;
//                    //Or
//                    //temp[j++] = c[i];
//                }
//            }
//            temp[j++] = c[c.length-1];//adding the last element of array c, to
//            //the temp array
//            int[] result = Arrays.copyOf(temp, j);//creating copy of temp with
//            //the length of the unique elements
//            System.out.println("The merged array is: ");
//            System.out.println(Arrays.toString(result));//Writes the array in 
//            //one line
//        }
//        public static void main(String[] args){
//            int[] arr1 = {1,2,3,4,5};
//            int[] arr2 = {3,4,5,6,7};
//            arrayMerge(arr1, arr2);
//        }
    
    
//    Home Task 01
//    Write a program that takes an array of Real numbers having size 7 and 
//    calculate the sum and mean of all the elements. Also depict the
//    memory management of this task
//    public static void sumOfArray(int[] a){
//        int sum = 0;
//        for(int i = 0; i < a.length; i++){
//            sum += a[i];
//        }
//        System.out.println("The Array entered is:");
//        System.out.println(Arrays.toString(a));
//        System.out.println("The Sum of the Elements is:");
//        System.out.println(sum);
//        System.out.println("The Mean of the Elements is:");
//        System.out.println(sum/a.length);
//    }
//    public static void main(String args[]){
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[7];
//        for(int i = 0; i < arr.length; i++){
//            System.out.println("Enter any integer in the array:");
//            int num = input.nextInt();
//            arr[i] = num;
//        }
//        sumOfArray(arr);
//        System.out.println("Enter the split key");
//        int arrayKey = input.nextInt();
//        arraySplit(arr, arrayKey);
//    }
    //Home Task 02
    //Add a method in the same class that splits the existing array into two. 
    //The method should search a key in array and if found splits the array 
    //from that index of the key.
//    public static void arraySplit(int[] a, int k){
//        int key = -1;
//        for(int i = 0; i < a.length; i++){
//            if (a[i] == k){
//                key = i;
//                break;
//            }
//        }
//        if(key == -1){
//            System.out.println("The entered key is not found");
//        }
//        int[] a1 = Arrays.copyOfRange(a, 0, key);
//        int[] a2 = Arrays.copyOfRange(a, key, a.length);
//        System.out.println("The first part of the array is: " + Arrays.toString(a1));
//        System.out.println("The second part of the array is: " + Arrays.toString(a2));
//    }
    
    
    //Home Task 03
    //Given an array of distinct integers and a target integer, return all 
    //unique combinations of numbers that add up to the target. Each number
    //can be used only once in the combination.
//    public static void uniqueCombination(int[] a, int k){
//        for(int i = 0; i < a.length; i++){
//            for(int j = i + 1; j < a.length; j++){
//                if(a[i] + a[j] == k){
//                    System.out.println("The unique found at " + a[i] + 
//                            " + " + a[j]+ " = " + k);
//                }
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5,6,7,8};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any number");
//        int key = input.nextInt();
//        uniqueCombination(arr, key);
//    }
    
    
    //Home Task 03
    //You are given an array containing n distinct numbers taken from 
    //0, 1, 2, ..., n. Write a program to find the one number that is 
    //missing from the array.
//    public static void missingNumber(int[] a){
//        int min = Arrays.stream(a).min().orElse(0);
//        int max = Arrays.stream(a).max().orElse(0);
//        int sum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2;
//        int actualSum = 0;
//        for(int elements : a){
//            actualSum += elements;
//        }
//        int result = sum - actualSum;
//        System.out.println("The missing number is: " + result);
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5,7};
//        missingNumber(arr);
//    }
    
    
    //Home Task 05
    //You are given an array of integers. Write a program to sort the array 
    //such that it follows a zigzag pattern: the first element is less than 
    //the second, the second is greater than the third, and so on.
    public static void zigzagSorting(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            if(i % 2 == 0){//Even Indexing
                if(a[i] > a[i + 1]){
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
            else{//Odd Indexing
                if(a[i] < a[i + 1]){
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args){
        int[] arr = {10,4,5,1,9,8};
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(arr));
        zigzagSorting(arr);
    }
}
