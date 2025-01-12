/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab13;

/**
 *
 * @author tariq
 */
import java.util.*;
//Lab Task 01
//Write a program which shows the insertion of the elements in a hashtable.
//public class DSALab13 {
//
//    public static void main(String[] args) {
//        // Create a Hashtable object
//        Hashtable<Integer, String> hashtable = new Hashtable<>();
//
//        // Insert elements into the hashtable
//        hashtable.put(1, "Tariq");
//        hashtable.put(2, "Aman");
//        hashtable.put(3, "Ali");
//        hashtable.put(4, "Jawad");
//        hashtable.put(5, "Hasan");
//
//        // Display the elements in the hashtable
//        System.out.println("Elements in the hashtable:");
//        for (Integer key : hashtable.keySet()) {
//            System.out.println("Key: " + key + ", Value: " 
//                    + hashtable.get(key));
//        }
//
//        // Insert a duplicate key with a new value
//        System.out.println("\nInserting a duplicate key (2) with a"
//                + " new value (Tariq).");
//        hashtable.put(2, "Tariq");
//
//        // Display the updated hashtable
//        System.out.println("Updated hashtable:");
//        for (Integer key : hashtable.keySet()) {
//            System.out.println("Key: " + key + ", Value: "
//                    + hashtable.get(key));
//        }
//    }
//}



//Lab Task 02
//Design a HashMap without using any built-in hash table libraries.
//class HashMap<K, V> {
//
//    // Inner class for key-value pairs
//    private static class Entry<K, V> {
//        K key;
//        V value;
//
//        // Constructor for creating key-value pair
//        Entry(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//    // Array of linked lists to store the entries
//    private LinkedList<Entry<K, V>>[] table;
//    private int capacity = 16;  // Initial capacity of the hash table
//    private int size = 0;
//
//    // Constructor to initialize the hash table
//    public HashMap() {
//        table = new LinkedList[capacity];
//        for (int i = 0; i < capacity; i++) {
//            table[i] = new LinkedList<>();
//        }
//    }
//
//    // Simple hash function to compute index from the key
//    private int hash(K key) {
//        return Math.abs(key.hashCode()) % capacity;
//    }
//
//    // Put method to insert a key-value pair
//    public void put(K key, V value) {
//        int index = hash(key);
//        LinkedList<Entry<K, V>> bucket = table[index];
//
//        // Check if the key already exists and update its value
//        for (Entry<K, V> entry : bucket) {
//            if (entry.key.equals(key)) {
//                entry.value = value;
//                return;
//            }
//        }
//
//        // If key doesn't exist, create a new entry and add it
//        bucket.add(new Entry<>(key, value));
//        size++;
//
//        // Resize if load factor exceeds 0.75
//        if (size > capacity * 0.75) {
//            resize();
//        }
//    }
//
//    // Get method to retrieve the value by key
//    public V get(K key) {
//        int index = hash(key);
//        LinkedList<Entry<K, V>> bucket = table[index];
//
//        for (Entry<K, V> entry : bucket) {
//            if (entry.key.equals(key)) {
//                return entry.value;
//            }
//        }
//
//        return null;  // Return null if the key doesn't exist
//    }
//
//    // Remove method to delete a key-value pair
//    public void remove(K key) {
//        int index = hash(key);
//        LinkedList<Entry<K, V>> bucket = table[index];
//
//        for (Entry<K, V> entry : bucket) {
//            if (entry.key.equals(key)) {
//                bucket.remove(entry);
//                size--;
//                return;
//            }
//        }
//    }
//
//    // Resize method to handle the load factor and rehash the entries
//    private void resize() {
//        capacity *= 2;  // Double the capacity
//        LinkedList<Entry<K, V>>[] newTable = new LinkedList[capacity];
//
//        // Rehash all the entries into the new table
//        for (int i = 0; i < table.length; i++) {
//            for (Entry<K, V> entry : table[i]) {
//                int newIndex = Math.abs(entry.key.hashCode()) % capacity;
//                if (newTable[newIndex] == null) {
//                    newTable[newIndex] = new LinkedList<>();
//                }
//                newTable[newIndex].add(entry);
//            }
//        }
//
//        table = newTable;  // Set the new table as the hash table
//    }
//
//    // Method to check if the hash table contains a key
//    public boolean containsKey(K key) {
//        int index = hash(key);
//        LinkedList<Entry<K, V>> bucket = table[index];
//
//        for (Entry<K, V> entry : bucket) {
//            if (entry.key.equals(key)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    // Method to get the current size of the hash table
//    public int size() {
//        return size;
//    }
//}
//
//public class DSALab13 {
//    public static void main(String[] args) {
//        // Create a HashMap object
//        HashMap<String, String> map = new HashMap<>();
//
//        // Add key-value pairs
//        map.put("apple", "A sweet red fruit");
//        map.put("banana", "A yellow fruit");
//        map.put("grape", "A small purple fruit");
//
//        // Retrieve values
//        System.out.println("apple: " + map.get("apple"));
//        System.out.println("banana: " + map.get("banana"));
//        System.out.println("grape: " + map.get("grape"));
//
//        // Remove a key-value pair
//        map.remove("banana");
//        System.out.println("banana after removal: " + map.get("banana"));
//
//        // Check if a key exists
//        System.out.println("Contains 'apple'? " + map.containsKey("apple"));
//        System.out.println("Contains 'banana'? " + map.containsKey("banana"));
//        System.out.println("HashMap size: " + map.size());
//    }
//}

//Lab Task 03
//Create a HashMap object called Vehicles which store String keys and String values
//and perform add( ), remove( ) and search( ) methods on it.
//public class DSALab13 {
//
//    // Create a HashMap to store vehicle data
//    private HashMap<String, String> vehicles;
//
//    public DSALab13() {
//        vehicles = new HashMap<>();
//    }
//
//    // Add a new vehicle to the registry
//    public void add(String vehicleType, String description) {
//        vehicles.put(vehicleType, description);
//        System.out.println(vehicleType + " added successfully.");
//    }
//
//    // Remove a vehicle from the registry
//    public void remove(String vehicleType) {
//        if (vehicles.containsKey(vehicleType)) {
//            vehicles.remove(vehicleType);
//            System.out.println(vehicleType + " removed successfully.");
//        } else {
//            System.out.println(vehicleType + " not found.");
//        }
//    }
//
//    // Search for a vehicle description by its type
//    public void search(String vehicleType) {
//        if (vehicles.containsKey(vehicleType)) {
//            System.out.println("Description of " + vehicleType + ": " 
//                    + vehicles.get(vehicleType));
//        } else {
//            System.out.println(vehicleType + " not found.");
//        }
//    }
//
//    public static void main(String[] args) {
//        DSALab13 registry = new DSALab13();
//
//        // Adding vehicles to the registry
//        registry.add("Car", "A four-wheeled motor vehicle used for "
//                + "transportation.");
//        registry.add("Bicycle", "A human-powered vehicle with two wheels.");
//        registry.add("Motorcycle", "A two-wheeled motor vehicle.");
//
//        // Searching for vehicles
//        registry.search("Car");
//        registry.search("Bicycle");
//        registry.search("Bus");
//
//        // Removing a vehicle from the registry
//        registry.remove("Motorcycle");
//        registry.remove("Truck");
//
//        // Searching after removal
//        registry.search("Motorcycle");
//    }
//}


//Lab Task 04
//Given an array of integers, write a Java program to find the most frequent element in
//the array. If there are multiple elements with the same frequency, return the one with
//the smallest value. Use a HashMap to count the frequency of each element and identify
//the most frequent one.
//public class DSALab13 {
//
//    // Method to find the most frequent element
//    public static int findMostFrequent(int[] arr) {
//        // Create a HashMap to store the frequency of each element
//        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//
//        // Populate the HashMap with the frequency of each element
//        for (int num : arr) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Initialize variables to track the most frequent element
//        int mostFrequent = arr[0];
//        int highestFrequency = 0;
//
//        // Iterate over the HashMap to find the most frequent element
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            int num = entry.getKey();
//            int frequency = entry.getValue();
//
//            // If the frequency is higher, update the most frequent element
//            // If the frequency is the same, select the smaller value
//            if (frequency > highestFrequency || (frequency == highestFrequency
//                    && num < mostFrequent)) {
//                mostFrequent = num;
//                highestFrequency = frequency;
//            }
//        }
//
//        return mostFrequent;
//    }
//
//    public static void main(String[] args) {
//        // Example array of integers
//        int[] arr = {4, 5, 6, 4, 6, 4, 3, 6, 6, 4};
//
//        // Find and print the most frequent element
//        System.out.println("Most frequent element: " + findMostFrequent(arr));
//    }
//}


//Lab Task 05
//Use a HashMap to store the cumulative sum of elements and count how often a sum
//has occurred.
//public class DSALab13 {
//
//    // Method to calculate and store cumulative sums and their frequencies
//    public static void calculateCumulativeSums(int[] arr) {
//        HashMap<Integer, Integer> cumulativeSumMap = new HashMap<>();
//        int cumulativeSum = 0;
//
//        // Iterate through the array and compute the cumulative sum
//        for (int num : arr) {
//            cumulativeSum += num;
//            cumulativeSumMap.put(cumulativeSum, cumulativeSumMap.getOrDefault
//        (cumulativeSum, 0) + 1);
//        }
//
//        // Print the cumulative sums and their frequencies
//        System.out.println("Cumulative sum and frequency:");
//        for (Map.Entry<Integer, Integer> entry : cumulativeSumMap.entrySet()) {
//            System.out.println("Sum: " + entry.getKey() + ", Frequency: "
//                    + entry.getValue());
//        }
//    }
//
//    public static void main(String[] args) {
//        // Example array of integers
//        int[] arr = {1, 2, 3, -2, 1, 5};
//
//        // Calculate and display the cumulative sums and their frequencies
//        calculateCumulativeSums(arr);
//    }
//}

//Home Task 01
//Enter data of a cricket team 11 players which is supposed to be a hash table value
//and insert runs of each player as a data, find out key treat’s Rank# of a player. For
//example: Runs are 30 mod by 11 which is index no 8; rank#8 is a rank of a team
//member. (Use HashTable ADT class)
//class Player {
//    String name;
//    int runs;
//
//    public Player(String name, int runs) {
//        this.name = name;
//        this.runs = runs;
//    }
//}
//
//public class DSALab13 {
//    private static final int SIZE = 11;
//    private Player[] hashTable = new Player[SIZE];
//
//    // Insert method for hash table
//    public void insert(String name, int runs) {
//        int key = runs % SIZE;
//        while (hashTable[key] != null) {
//            key = (key + 1) % SIZE; // Handle collision using linear probing
//        }
//        hashTable[key] = new Player(name, runs);
//    }
//
//    // Display the hash table
//    public void display() {
//        for (int i = 0; i < SIZE; i++) {
//            if (hashTable[i] != null) {
//                System.out.println("Rank#" + i + ": " + hashTable[i].name + 
//                        " - " + hashTable[i].runs + " runs");
//            } else {
//                System.out.println("Rank#" + i + ": Empty");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        DSALab13 team = new DSALab13();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter data for 11 players:");
//
//        for (int i = 0; i < SIZE; i++) {
//            System.out.print("Enter player name: ");
//            String name = scanner.nextLine();
//
//            System.out.print("Enter runs scored by " + name + ": ");
//            int runs = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline
//
//            team.insert(name, runs);
//        }
//
//        System.out.println("\nHash Table with Player Rankings:");
//        team.display();
//    }
//}


//Home Task 02
//Harold is a kidnapper who wrote a ransom note, but now he is worried it will be
//traced back to him through his handwriting. He found a magazine and wants to know
//if he can cut out whole words from it and use them to create an untraceable replica of
//his ransom note. The words in his note are case-sensitive and he must use only whole
//words available in the magazine. He cannot use substrings or concatenation to create
//the words he needs.Given the words in the magazine and the words in the ransom
//note, print Yes if he can replicate his ransom note exactly using whole words from
//the magazine; otherwise, print No.
//Example:
//magazine = "attack at dawn" note = "Attack at dawn"
//The magazine has all the right words, but there is a case mismatch. The answer is
//No.
//public class DSALab13 {
//    // Function to check if ransom note can be replicated
//    public static void canReplicate(String magazine, String note) {
//        // Split the magazine and note into words
//        String[] magazineWords = magazine.split(" ");
//        String[] noteWords = note.split(" ");
//
//        // Create a hashmap to count words in the magazine
//        HashMap<String, Integer> wordCount = new HashMap<>();
//
//        // Populate the hashmap with words from the magazine
//        for (String word : magazineWords) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//
//        // Check if the ransom note can be created
//        for (String word : noteWords) {
//            if (!wordCount.containsKey(word) || wordCount.get(word) == 0) {
//                System.out.println("No");
//                return;
//            }
//            wordCount.put(word, wordCount.get(word) - 1);
//        }
//
//        System.out.println("Yes");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input magazine text
//        System.out.println("Enter the magazine text:");
//        String magazine = scanner.nextLine();
//
//        // Input ransom note text
//        System.out.println("Enter the ransom note text:");
//        String note = scanner.nextLine();
//
//        // Check if the ransom note can be replicated
//        canReplicate(magazine, note);
//    }
//}



//Home Task 03
//Scenario:
//You are building an analytics tool for a website. The tool needs to count the number of
//visitors to each page and store the data. Write a Java program that uses a HashMap to
//track the number of visits to different pages of a website. Each time a visitor accesses
//a page, the tool should increment the visit count for that page.
//Requirements:
//a) The key should be the page URL (as a string), and the value should be the
//number of visits (as an integer).
//b) Provide a method to retrieve the visit count for a given page.
//c) Provide a method to get the page with the highest visit count.
//public class DSALab13 {
//    private final HashMap<String, Integer> pageVisits;
//
//    public DSALab13() {
//        pageVisits = new HashMap<>();
//    }
//
//    // Increment the visit count for a page
//    public void visitPage(String url) {
//        pageVisits.put(url, pageVisits.getOrDefault(url, 0) + 1);
//    }
//
//    // Retrieve the visit count for a given page
//    public int getVisitCount(String url) {
//        return pageVisits.getOrDefault(url, 0);
//    }
//
//    // Get the page with the highest visit count
//    public String getMostVisitedPage() {
//        if (pageVisits.isEmpty()) {
//            return "No pages have been visited yet.";
//        }
//
//        String mostVisitedPage = null;
//        int maxVisits = 0;
//
//        for (Map.Entry<String, Integer> entry : pageVisits.entrySet()) {
//            if (entry.getValue() > maxVisits) {
//                maxVisits = entry.getValue();
//                mostVisitedPage = entry.getKey();
//            }
//        }
//
//        return mostVisitedPage + " with " + maxVisits + " visits.";
//    }
//
//    public static void main(String[] args) {
//        DSALab13 analytics = new DSALab13();
//
//        // Simulate some page visits
//        analytics.visitPage("/home");
//        analytics.visitPage("/about");
//        analytics.visitPage("/contact");
//        analytics.visitPage("/home");
//        analytics.visitPage("/home");
//        analytics.visitPage("/about");
//
//        // Retrieve and display visit counts
//        System.out.println("Visits to /home: " + 
//                analytics.getVisitCount("/home"));
//        System.out.println("Visits to /about: " + 
//                analytics.getVisitCount("/about"));
//        System.out.println("Visits to /contact: " + 
//                analytics.getVisitCount("/contact"));
//
//        // Display the most visited page
//        System.out.println("Most visited page: " + 
//                analytics.getMostVisitedPage());
//    }
//}


//Home Task 04
//4.Scenario:
//You are developing a system to track student grades. The system should store the grades
//for each student in a course and calculate the average grade. Use a HashMap where the
//key is the student name (string) and the value is their grade (integer). The system should
//be able to add new students, update existing students' grades, and calculate the class
//average.
//Requirements:
//a) Implement methods to:
//• Add or update student grades.
//• Get the grade of a specific student.
//• Calculate and return the class average grade.
//b) Handle edge cases, such as when no students have been added yet
public class DSALab13 {

    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public DSALab13() {
        studentGrades = new HashMap<>();
    }

    // Method to add or update a student's grade
    public void addOrUpdateStudent(String studentName, int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a value"
                    + " between 0 and 100.");
            return;
        }
        studentGrades.put(studentName, grade);
        System.out.println("Grade updated for student: " + studentName);
    }

    // Method to get the grade of a specific student
    public Integer getGrade(String studentName) {
        if (!studentGrades.containsKey(studentName)) {
            System.out.println("Student not found: " + studentName);
            return null;
        }
        return studentGrades.get(studentName);
    }

    // Method to calculate and return the class average grade
    public double calculateClassAverage() {
        if (studentGrades.isEmpty()) {
            System.out.println("No students have been added yet.");
            return 0.0;
        }

        int totalGrades = 0;
        for (int grade : studentGrades.values()) {
            totalGrades += grade;
        }
        return (double) totalGrades / studentGrades.size();
    }

    // Main method for demonstration
    public static void main(String[] args) {
        DSALab13 tracker = new DSALab13();

        // Add or update student grades
        tracker.addOrUpdateStudent("Ali", 85);
        tracker.addOrUpdateStudent("Jawad", 90);
        tracker.addOrUpdateStudent("Tariq", 78);
        tracker.addOrUpdateStudent("Aman", 88); // Update Aman's grade
        tracker.addOrUpdateStudent("Sarim", 92);

        // Get grades of specific students
        System.out.println("Ali's grade: " + tracker.getGrade("Ali"));
        System.out.println("Jawad's grade: " + tracker.getGrade("Jawad"));
        System.out.println("Tariq's grade: " + tracker.getGrade("Tariq"));
        System.out.println("Aman's grade: " + tracker.getGrade("Aman"));
        System.out.println("Wasif's grade: " + tracker.getGrade("Wasif")); 
        // Non-existent student
        // Calculate and display class average
        System.out.println("Class average: " + tracker.calculateClassAverage());

        // Handle edge case: No students
        DSALab13 emptyTracker = new DSALab13();
        System.out.println("Class average (no students): " 
                + emptyTracker.calculateClassAverage());
    }
}