/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab03;
import java.util.Scanner;
public class DSALab03 {
    //Lab Task 01
//    public static void main(String args[]){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any number:");
//        int k = input.nextInt();
//        System.out.println("The sequence sum in descending order is:");
//        System.out.println(recursionDemo(k));
//      }
//    public static int recursionDemo(int a){
//        //Base Case
//        if(a < 0){
//            return 0;
//        }
//        return a + recursionDemo(a-1);
//    }
    
    
    //Lab Task 02
//    public static void main(String[] args){
//       Scanner input = new Scanner(System.in);
//        System.out.println("Enter Name:");
//        String name = input.nextLine();
//        System.out.println("The name in reverse order is:");
//        System.out.println((nameReversing(name.toLowerCase())));
//    }
//    public static String nameReversing(String str){
//        //Base Case
//        if(str.isEmpty()){
//            return " ";
//        }
//        return str.charAt(str.length() - 1) + nameReversing(str.substring(0, str.length()-1));
//    }
    
    
    
    //Lab Task 03
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any number:");
//        int k = input.nextInt();
//        System.out.println("The sum of the number is:");
//        System.out.println(recursionDemo(k));
//    }
//    public static int recursionDemo(int a){
//        //Base Case
//        if(a == 0){
//            return 0;
//        }
//        return a + recursionDemo(a - 1);
//    }
    
    
    //Lab Task 04
//    public static void main(String[] args) {
//        int[] numbers = {2, 3, 4, 5, 6, 7}; //sum is 27
//        System.out.println("The sum of the array is:");
//        System.out.print(recursionDemo(numbers, 0));
//    }
//    public static int recursionDemo(int[] a, int i){
//        //Base Case for this scenario
//        if(i == a.length){
//           return 0; 
//        }
//        //Recursive case, a[i] = 0 and recursionDemo(a, i + 1) = (a , 1) 
//        return a[i] + recursionDemo(a, i + 1);
//    }
    
    //Lab Task 05
//    public static void main(String[] args){
//        int n = 6; //6x5x4x3x2x1 = 720
//        System.out.println("The factorial of " + n + " is:");
//        System.out.println(recursionDemo(n));
//    }
//    public static int recursionDemo(int a){
//        //Base Case
//        if(a <= 0){
//            return 1;
//        }
//        // 6 * rD(5)= 720, 5 * rD(4)= 120, 4 * rD(3)= 24,
//        //3 * rD(2)= 6, 2 * rD(1)= 2, 1 * rD(0) = 1
//        return a * recursionDemo(a-1);//Recursive case
//    }
    
    //Lab Task 06
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any number:");
//        int i = input.nextInt();
//        System.out.println("The digits in the given number is/are:");
//        System.out.println(recursionDemo(i));
//    }
//    public static int recursionDemo(int a){
//        //Base Case
//        if(a/10 == 0){
//            return 1;
//        }
//        return 1 + recursionDemo(a/10);//recursive case
//    }

    
    //Home Task 03
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any word");
//        String newString = input.nextLine();
//        //newString.length() - 1 because the length is +1 more than the characters
//        //aba i = 0, length = 3, j = 3 - 1 = 2 
//        System.out.println(isPalindrome(0, newString.length() - 1, newString));
//    }
//    public static String isPalindrome(int i, int j, String str){
//        //Base Case
//        if(i == j){
//            return "Yes";
//        }
//        if(str.charAt(i) != str.charAt(j)){
//            return "No";
//        }
//        return isPalindrome(i+1, j-1, str);
//        }
    
//    //Home Task 04
//    public static void main(String args[]){
//    Scanner input = new Scanner(System.in);
//    //Taking two inputs
//    System.out.println("Enter any two numbers: ");
//    int i = input.nextInt();
//    int j = input.nextInt();
//    System.out.println("The GCD of " + i + " and " + j + " is:"); 
//    System.out.println(GCD(i, j));
//    }
//    public static int GCD(int a, int b){
//        //Base Case
//        if(b == 0){//since at a point b will become 0, so a will be our
//            //GCD through Euclid's algorithm
//            //another case is, if(a%b==0) return b, but in that case
//            //methods having values of b as zero will generate an error
//            return a;
//        } else{
//            return GCD(b, a % b);//eg: a = 36 and b = 24
//            //24 is the dividened and 36 is the divisor so it
//            //returns 12 as quotient, now a = 24 which was b and
//            // b = 12 after dividing
//        }
//    }
    
    public static void bubblesortAscending(int[] a){
        for(int p = 0; p < a.length-1; p++){
            for(int i = 0; i < a.length - 1; i++){
                if(a[i] > a[i + 1]){
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }   
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void bubblesortDescending(int a[]){
        for(int p = 0; p < a.length-1; p++){
            for(int i = 0; i < a.length-1; i++){
                if(a[i] < a[i + 1]){
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
        for (int e : a){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        int[] arr1 = {6,5,4,3,2,1};
        System.out.println("Ascending array");
        bubblesortAscending(arr1);
        System.out.println("Descending array");
        bubblesortDescending(arr1);
    }
}
