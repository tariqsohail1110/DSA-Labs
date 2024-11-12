/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab03;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Memoization {
    //Hashmap for storing values
    private Map<Integer, Integer> memoizeTable = new HashMap<>();
    
    public int fibonacciMemoization(int n){
        //Base Case
        if(n<= 1){
            return n;
        }
        //Condition to check whether the number is in the hashmap or not
        //if o=it exists then the memoizeTable.get(n) method will call that
        //number
        if(this.memoizeTable.containsKey(n)){
            return this.memoizeTable.get(n);
        }
        //recursive case
        int result = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);
        //storing result using n as key and result as the value
        this.memoizeTable.put(n, result);
        return result;
    }
    public static void main(String[] args){
        //initializing object
        Memoization fibonacciSeriesMemo = new Memoization();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();
        System.out.println("The " + n + "th term in the Fibonacci Series is:");
        //calling the function with the object
        System.out.println(fibonacciSeriesMemo.fibonacciMemoization(n));
    }
}