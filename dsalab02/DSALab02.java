/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab02;
import java.util.*;
/**
 *
 * @author tariq
 */
public class DSALab02 {
    public static void main(String[] args) {
        //Lab task 01
//        Vector<Integer> myVector = new Vector<>();
//        //The user will define the size of the vector
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any the length: ");
//        int vecSize = input.nextInt();
//        //Loop to add elements in the vector
//        for (int i = 0; i < vecSize; i++){
//            System.out.println("Input any number: ");
//            int vecElements = input.nextInt();
//            myVector.add(vecElements);
//        }
//        System.out.println("Vector: " + myVector);
//        int sum = 0;
//        //Loop to get the sum of all the elements
//        for(int j = 0; j<myVector.size(); j++){
//            sum += myVector.get(j);
//        }
//        System.out.println("The sum of the vector is: " + sum);
        
        
        //Lab Task 02
//        ArrayList<String> myList1 = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        //user will give the number of items
//        System.out.println("Enter the number of elements: ");
//        int numOfItems = input.nextInt();
//        //Loop to add elements
//        for(int i = 0; i < numOfItems; i++){
//            System.out.println("Enter your element: ");
//            String myMenu = input.nextLine();
//            myList1.add(myMenu);
//        }
//        System.out.println(myList1);
//        //For longest word
//        String longestWord = " ";
//        for(String item : myList1){
//            if(item.length() > longestWord.length()){
//                longestWord = item;
//            }
//        }
//        System.out.println(longestWord);

        //Lab Task 04
//        Vector<Integer> myVector = new Vector<>();
//        //The user will define the size of the vector
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the length: ");
//        int vecSize = input.nextInt();
//        //Loop to add elements in the vector
//        for (int i = 0; i < vecSize; i++){
//            System.out.println("Input any number: ");
//            int vecElements = input.nextInt();
//            myVector.add(vecElements);
//        }
//        //Display all the integers
//        System.out.println("Vector: " + myVector);
//        int sum = 0;
//        //Loop to get the sum of all the elements
//        for(int j = 0; j<myVector.size(); j++){
//            sum += myVector.get(j);
//        }
//        System.out.println("The sum of the vector is: " + sum);
//        //Maximum Element
//        int maxNum = myVector.get(0);
//        for(int i = 1; i < myVector.size(); i++){
//            if(myVector.get(i) > maxNum){
//                maxNum = myVector.get(i);
//            }
//        }
//        System.out.println("The Maximum Value is: " + maxNum);

        //Lab Task 05
        //Define the ArrayList
//        ArrayList<Integer> myList1 = new ArrayList<>();
//        //User will input the number of elements
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of the ArrayList:");
//        int sizeOfList = input.nextInt();
//        //Loop for adding elements
//        for(int i = 0; i < sizeOfList; i++){
//            System.out.println("Enter any number:");
//            int listElement = input.nextInt();
//            myList1.add(listElement);
//        }
//        //sorted list
//        Collections.sort(myList1);
//        System.out.println("The sorted ArrayList in ascending order is:c" + myList1);
//        System.out.println("The smallest element in the sorted ArrayList is: " + myList1.get(0));
        
        //Lab Task 06
        //ArrayList01
//        ArrayList<String> myList1 = new ArrayList<>();
//        myList1.add("Hyundai");
//        myList1.add("Toyota");
//        myList1.add("Suzuki");
//        System.out.println("The first ArrayList is: " + myList1);
//        //ArrayList02
//        ArrayList<String> myList2 = new ArrayList<>();
//        myList2.add("Honda");
//        myList2.add("Unique");
//        myList2.add("Yamaha");
//        System.out.println("The second ArrayList is: " + myList2);
//        //Merged ArrayList
////        myList1.addAll(0,myList2); //with indexing
//        myList1.addAll(myList2); //without indexing
//        System.out.println("The merged ArrayList is: " + myList1);

        //Home Task 01
//        Vector<Integer> myVec = new Vector<>();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of elements:");
//        int numOfElements = input.nextInt();
//        //Loop for storing elements
//        for(int i = 0; i < numOfElements; i++){
//            System.out.println("Enter any number:");
//            int myElement = input.nextInt();
//            myVec.add(myElement);
//        }
//        System.out.println("The Original Vector: " + myVec);
//        //Sorted Vetor
//        Collections.sort(myVec);
//        System.out.println("The sorted Vector is: " + myVec);
//        //Largest number
//        int largestNum = myVec.get(0);
//        for(int i = 1; i < myVec.size(); i++){
//            if(myVec.get(i) > largestNum){
//                largestNum = myVec.get(i);
//            }
//        }
//        System.out.println("The Largest Number is: " + largestNum);
//        //Smallest Number
//        int smallestNum = myVec.get(0);
//        for(int i = 1; i < myVec.size(); i++){
//            if(myVec.get(i) < smallestNum){
//                smallestNum = myVec.get(i);
//            }
//        }
//        System.out.println("The Smallest Number is: " + smallestNum);


       //Home Task 02
        Scanner input = new Scanner(System.in);
        int numOfLoops = 5;
        for(int i = 0; i < numOfLoops; i++){
            System.out.print("INPUT: ");
            String myString = input.nextLine();
            System.out.println("OUTPUT: " + myString.hashCode());
        }
        
    }
}
