/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab01;
import java.util.Scanner;
public class DSALab01 {

    public static void main(String[] args) {
//      Lab Task 01
//        String s1 = "Hello";
//        String s2 = "World";
//        String s3 = new String("Java");
//        String s4 = new String("Programming");
//        String s5 = s3.intern();
//        System.out.println(s1+",--> String1");
//        System.out.println(s2+",--> String2");
//        System.out.println(s3+",--> String3");
//        System.out.println(s4+",--> String4");
//        System.out.println(s5+",--> String5");

//      Lab Task 02
//          int i1 = 5;
//          double d1 = 4.0;
//          char c1 = 'T';
//          Integer i2 = i1;
//          Double d2 = d1;
//          Character c2 = c1;
//          System.out.println("Primitive Integer: "+ i1);
//          System.out.println("Wrapper Integer: " + i2);
//          System.out.println("Primitive Double: "+ d1);
//          System.out.println("Wrapper Double: "+ d2);
//          System.out.println("Primitive Character: "+ c1);
//          System.out.println("Wrapper Character: "+ c2);

//       Lab Task 03
//            String s1 = "Welcome";
//            String s2 = "To The";
//            String s3 = "World";
//            String s4 = "Of";
//            String s5 = "Programming";
////          Concatenate
//            String concat = s1+s2+s3+s4+s5;
//            System.out.println(concat);
////          Uppercase
//            String st_upper = s4.toUpperCase();
//            System.out.println(st_upper);
////          SubString
//            String sub_str = concat.substring(8);
//            System.out.println(sub_str);

//       Lab Task 04
//            String word1 = "abc";
//            String word2 = "pqr";
//            String mergedStr = "";
//
//            int i = 0, j = 0;
//            while (i < word1.length() && j < word2.length()) {
//                mergedStr += word1.charAt(i);
//                mergedStr += word2.charAt(j);
//                i++;
//                j++;
//            }
//            while (i < word1.length()) {
//                mergedStr += word1.charAt(i);
//                i++;
//            }
//            while (j < word2.length()) {
//                mergedStr += word2.charAt(j);
//                j++;
//            }
//            System.out.println(mergedStr);

//       Lab Task 05
//        // Minimum and Maximum values of Integer
//        int intMin = Integer.MIN_VALUE;
//        int intMax = Integer.MAX_VALUE;
//        
//        System.out.println("Integer Minimum Value: " + intMin);
//        System.out.println("Integer Maximum Value: " + intMax);
//        
//        // Minimum and Maximum values of Float
//        float floatMin = Float.MIN_VALUE;
//        float floatMax = Float.MAX_VALUE;
//        
//        System.out.println("Float Minimum Value: " + floatMin);
//        System.out.println("Float Maximum Value: " + floatMax);
//        
//        // Minimum and Maximum values of Double
//        double doubleMin = Double.MIN_VALUE;
//        double doubleMax = Double.MAX_VALUE;
//        
//        System.out.println("Double Minimum Value: " + doubleMin);
//        System.out.println("Double Maximum Value: " + doubleMax);
        
        
//      Home Task 01
//        int intPrimitive = 100;
//        Integer intWrapper = intPrimitive;
//        
//        float floatPrimitive = 12.5f;
//        Float floatWrapper = floatPrimitive;
//        
//        double doublePrimitive = 45.67;
//        Double doubleWrapper = doublePrimitive;
//        
//        System.out.println("Autoboxed Integer value: " + intWrapper);
//        System.out.println("Autoboxed Float value: " + floatWrapper);
//        System.out.println("Autoboxed Double value: " + doubleWrapper);
//        
//        int unboxedInt = intWrapper;
//        float unboxedFloat = floatWrapper;
//        double unboxedDouble = doubleWrapper;
//        System.out.println("Unboxed Integer value: " + unboxedInt);
//        System.out.println("Unboxed Float value: " + unboxedFloat);
//        System.out.println("Unboxed Double value: " + unboxedDouble);
//        
////        Method 01
//        String numberStr = "123";
//        int parsedInt = Integer.parseInt(numberStr);
//        System.out.println("Parsed Integer from String: " + parsedInt);
//        
////        Method 02
//        String intToStr = intWrapper.toString();
//        System.out.println("Integer to String using toString(): " + intToStr);
//        
////        Method 03
//        Integer valueOfInt = Integer.valueOf("456");
//        System.out.println("Integer object using valueOf(): " + valueOfInt);
            

//        Home Task 02
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//        
//        Integer evenCount = 0; 
//        Integer oddCount = 0;  
//        
//        while (number != 0) {
//            int digit = number % 10;
//            
//            if (digit % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//            
//            number /= 10;
//        }
//        
//        System.out.println("Number of even digits: " + evenCount);
//        System.out.println("Number of odd digits: " + oddCount);

//      Home Task 03
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        Double number = scanner.nextDouble();
//
//        Double absValue = Math.abs(number);
//        System.out.println("Absolute value: " + absValue);
//
//        Double sqrtValue = Math.sqrt(number);
//        System.out.println("Square root: " + sqrtValue);
//
//        Double powerValue = Math.pow(number, 3);
//        System.out.println(number + " raised to the power of 3 is: " + powerValue);

//      Home Task 04
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//        
//        char[] strArray = input.toCharArray();
//        String vowels = "aeiouAEIOU";
//        int left = 0, right = strArray.length - 1;
//
//        while (left < right) {
//            // Move left and right pointers to the next vowel
//            if (vowels.indexOf(strArray[left]) == -1) {
//                left++;
//                continue;
//            }
//            if (vowels.indexOf(strArray[right]) == -1) {
//                right--;
//                continue;
//            }
//            // Swap vowels
//            char temp = strArray[left];
//            strArray[left] = strArray[right];
//            strArray[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        System.out.println("String after reversing vowels: " + new String(strArray));

//        Home Task 05
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Variable to hold the longest word
        String longestWord = "";

        // Loop through the words to find the longest one
        for (String word : words) {
            // Check if the current word is longer than the longest found so far
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
