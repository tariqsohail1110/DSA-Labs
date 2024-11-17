/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab05;
import java.util.Arrays;
//Home Task 01
    //Declare an array of size n to store account balances. Initialize with 
    //values 0 to 100000 and sort Account No’s according to highest balance 
    //values by using Quick sort, For e.g.:
    //Account No. 3547 Balance 28000
    //Account No. 1245 Balance 12000
public class QuickSort {
    static class Account{
        int accountNo;
        int balance;
    
        //Constructor
        Account(int accountNo, int balance){
            this.accountNo = accountNo;
            this.balance = balance;
        }
        @Override
        public String toString(){
            return "[Account number: " + accountNo + ", Account balance: " + balance + " ]\n";
        }
    }
    public static int partition(Account[] a, int low, int high){
        Account pivot = a[high];
        int i = low-1;
        
        for(int j = low; j < high; j++){
            if(a[j].balance > pivot.balance){//for ascending if(a[j] < pivot){}
                i++;
                //Swapping
                Account temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        Account temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i; //pivot Index
    }
    public static void quickSort(Account[] a, int low, int high){
        if(low < high){
            int pidx = partition(a, low, high);
            quickSort(a, low, pidx-1);
            quickSort(a, pidx+1, high);
        }
    }
    public static void main(String[] args){
        int n = 6;
        //initialize array
        Account[] accounts = new Account[n];
        
        //add elements
        accounts[0] = new Account(3457, 28000);
        accounts[1] = new Account(1245, 12000);
        accounts[2] = new Account(2316, 18000);
        accounts[3] = new Account(2001, 28900);
        accounts[4] = new Account(1211, 38000);
        accounts[5] = new Account(3456, 10000);
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(accounts));
        System.out.println("After Sorting");
        quickSort(accounts, 0, n-1);
        System.out.println(Arrays.toString(accounts));
    }
}
