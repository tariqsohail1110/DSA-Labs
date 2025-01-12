/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab11;
import com.sun.source.tree.BinaryTree;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author tariq
 */
//Lab Task 01
//Write a program to create binary search tree of the following list of 
//elements -> - 45, 15, 79, 90, 10, 55, 12, 20, 50
//class Node{
//    int key;
//    Node left, right;
//    
//    public Node(int item){
//        key = item;
//        left = right = null;
//    }
//}
//public class DSALab11{
//    static Node insert(Node root, int key){
//        if(root == null){
//            return new Node(key); //if the tree is empty, return a new node
//        }
//        if(root.key == key){
//            return root; //If the key is already present return the node
//        }
//        //Otherwise recur down the tree
//        if(key < root.key){
//            root.left = insert(root.left, key);
//        }else
//            root.right = insert(root.right, key);
//        return root;
//    }
//    //Inorder traversing
//    static void inOrder(Node root){
//        if(root != null){
//        inOrder(root.left);
//        System.out.print(root.key + " ");
//        inOrder(root.right);
//        }
//    }
//    public static void main(String[] args){
//        
//        Node root = null;
//        //creating an array to minimize LOC
//        int[] elements = {-45, 15, 79, 90, 10, 55, 12, 20, 50};
//        for(int element : elements){
//            root = insert(root, element);
//        }
//        inOrder(root);
//    }
//}

//Lab Task 02
//Write a program that takes an item input to search if there is an
//item present, deletes it otherwise insert it in a tree. 
//class Node {
//    Node left, right;
//    int key;
//
//    public Node(int item) {
//        key = item;
//        left = right = null;
//    }
//}
//public class DSALab11 {
//    // Insert a node in the BST
//    static Node insert(Node root, int key) {
//        if (root == null) {
//            return new Node(key);
//        }
//        if (key < root.key) {
//            root.left = insert(root.left, key);
//        } else if (key > root.key) {
//            root.right = insert(root.right, key);
//        }
//        return root;
//    }
//    // Search for a node in the BST
//    static boolean search(Node root, int key) {
//        if (root == null) {
//            return false;
//        }
//        if (root.key == key) {
//            return true;
//        }
//        if (key < root.key) {
//            return search(root.left, key);
//        }
//        return search(root.right, key);
//    }
//    // Find the minimum value node in a subtree
//    static Node findMin(Node root) {
//        while (root.left != null) {
//            root = root.left;
//        }
//        return root;
//    }
//    // Delete a node in the BST
//    static Node delete(Node root, int key) {
//        //This method implies all nodes i.e: leaf node, one child and two child
//        if (root == null) {
//            return root; // Base case: key not found
//        }
//        if (key < root.key) {
//            root.left = delete(root.left, key); // Recur on the left subtree
//        } else if (key > root.key) {
//            root.right = delete(root.right, key); // Recur on the right subtree
//        } else {
//            // Node with one child or no child
//            if (root.left == null) {
//                return root.right;
//            } else if (root.right == null) {
//                return root.left;
//            }
//            // Node with two children
//            Node minNode = findMin(root.right); // Find the inorder successor
//            root.key = minNode.key; // Copy the inorder successor's value to this node
//            root.right = delete(root.right, minNode.key); // Delete the inorder successor
//        }
//        return root;
//    }
//    // Inorder traversal to display the BST
//    static void inOrder(Node root) {
//        if (root != null) {
//            inOrder(root.left);
//            System.out.print(root.key + " ");
//            inOrder(root.right);
//        }
//    }
//    public static void main(String[] args) {
//        Node root = null;
//        int[] elements = {-45, 15, 79, 90, 10, 55, 12, 20, 50};
//        for (int element : elements) {
//            root = insert(root, element);
//        }
//
//        // Display the initial BST
//        System.out.println("Initial BST (Inorder Traversal):");
//        inOrder(root);
//        System.out.println();
//
//        // Take input from the user
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an item to search, delete, or insert: ");
//        int item = scanner.nextInt();
//
//        // Check if the item exists in the BST
//        if (search(root, item)) {
//            System.out.println("Item found! Deleting it...");
//            root = delete(root, item);
//        } else {
//            System.out.println("Item not found! Inserting it...");
//            root = insert(root, item);
//        }
//
//        // Display the updated BST
//        System.out.println("Updated BST (Inorder Traversal):");
//        inOrder(root);
//    }
//}

//Lab Task 03
//Insert multiple values into the tree, and perform an in-order 
//traversal to verify the values are inserted correctly.
//class Node{
//    Node left, right;
//    int key;
//    
//    public Node(int item){
//        key = item;
//        left = right = null;
//    }
//}
//public class DSALab11{
//    static Node insert(Node root, int key){
//        if(root == null){
//            return new Node(key);
//        }
//        if(root.key == key){
//            return root;
//        }
//        if(key < root.key){
//            root.left = insert(root.left, key);
//        }else{
//            root.right = insert(root.right, key);
//        }
//        return root;
//    }
//    static void inOrder(Node root){
//        if(root != null){
//            inOrder(root.left);
//            System.out.print(root.key + " ");
//            inOrder(root.right);
//        }
//    }
//    public static void main(String[] args){
//        Node root = null;
//        int[] arr = {4,6,1,3,9,32,11,90};
//        for(int el : arr){
//            root = insert(root, el);
//        }
//        inOrder(root);
//    }
//}


//Lab Task 04
//Find the lowest common ancestor (LCA) of two nodes in a Binary Search Tree
//class Node {
//    int key;
//    Node left, right;
//
//    public Node(int item) {
//        key = item;
//        left = right = null;
//    }
//}
//
//public class DSALab11 {
//    // Method to insert a node in the BST
//    static Node insert(Node root, int key) {
//        if (root == null) {
//            return new Node(key);
//        }
//        if (key < root.key) {
//            root.left = insert(root.left, key);
//        } else if (key > root.key) {
//            root.right = insert(root.right, key);
//        }
//        return root;
//    }
//
//    // Inorder traversal to display the tree
//    static void inOrder(Node root) {
//        if (root != null) {
//            inOrder(root.left);
//            System.out.print(root.key + " ");
//            inOrder(root.right);
//        }
//    }
//
//    // Function to find the LCA of two nodes in BST
//    static Node LCA(Node root, int n1, int n2) {
//        if (root == null) {
//            return null;
//        }
//
//        // If both n1 and n2 are smaller than root, LCA lies in the left subtree
//        if (n1 < root.key && n2 < root.key) {
//            return LCA(root.left, n1, n2);
//        }
//
//        // If both n1 and n2 are greater than root, LCA lies in the right subtree
//        if (n1 > root.key && n2 > root.key) {
//            return LCA(root.right, n1, n2);
//        }
//
//        // If one key is on the left and the other is on the right, the root is the LCA
//        return root;
//    }
//
//    public static void main(String[] args) {
//        DSALab11 tree = new DSALab11();
//        Node root = null;
//
//        // Create BST
//        int[] arr = {20, 8, 22, 4, 12, 10, 14};
//        for (int element : arr) {
//            root = insert(root, element);
//        }
//
//        // Display the BST using inorder traversal
//        System.out.println("Inorder Traversal of the BST:");
//        inOrder(root);
//        System.out.println();
//
//        // Find and display LCA of different pairs of nodes
//        int n1 = 10, n2 = 14;
//        Node t = LCA(root, n1, n2);
//        System.out.println("LCA of " + n1 + " and " + n2 + " is " + (t != null
//                ? t.key : "null"));
//
//        n1 = 14;
//        n2 = 8;
//        t = LCA(root, n1, n2);
//        System.out.println("LCA of " + n1 + " and " + n2 + " is " + (t != null 
//                ? t.key : "null"));
//
//        n1 = 10;
//        n2 = 22;
//        t = LCA(root, n1, n2);
//        System.out.println("LCA of " + n1 + " and " + n2 + " is " + (t != null 
//                ? t.key : "null"));
//    }
//}


//Home Task 01
//Write a function called MergeBST that give a combine Binary search tree
//of two different binary search trees according to rules of binary tree 
//then print all nodes. 
//class Node{
//    int key;
//    Node left, right;
//    
//    public Node(int item){
//        key = item;
//        left = right = null;
//    }
//}
//public class DSALab11{
//    static Node insert(Node root, int key) {
//        if (root == null) return new Node(key);
//        if (key < root.key) {
//            root.left = insert(root.left, key);
//        } else if (key > root.key) {
//            root.right = insert(root.right, key);
//        }
//        return root;
//    }
//
//    // Method to perform inorder traversal of the BST
//    static void inOrder(Node root) {
//        if (root != null) {
//            inOrder(root.left);
//            System.out.print(root.key + " ");
//            inOrder(root.right);
//        }
//    }
//
//    // Helper method to store inorder traversal of a tree in a list
//    private static void storeInOrder(Node node, ArrayList<Integer> list) {
//        if (node == null) return;
//        storeInOrder(node.left, list);
//        list.add(node.key);
//        storeInOrder(node.right, list);
//    }
//
//    // Method to merge two sorted lists
//    private static ArrayList<Integer> merge(ArrayList<Integer> list1, 
//            ArrayList<Integer> list2) {
//        ArrayList<Integer> merged = new ArrayList<>();
//        int i = 0, j = 0;
//
//        // Merge both lists into a single sorted list
//        while (i < list1.size() && j < list2.size()) {
//            if (list1.get(i) < list2.get(j)) {
//                merged.add(list1.get(i++));
//            } else {
//                merged.add(list2.get(j++));
//            }
//        }
//
//        // Add remaining elements from list1
//        while (i < list1.size()) {
//            merged.add(list1.get(i++));
//        }
//
//        // Add remaining elements from list2
//        while (j < list2.size()) {
//            merged.add(list2.get(j++));
//        }
//
//        return merged;
//    }
//
//    // Method to convert a sorted list into a balanced BST
//    private static Node sortedListToBST(ArrayList<Integer> list,
//            int start, int end) {
//        if (start > end) {
//            return null;
//        }
//
//        // Middle element becomes the root
//        int mid = (start + end) / 2;
//        Node node = new Node(list.get(mid));
//
//        // Recursively build the left and right subtrees
//        node.left = sortedListToBST(list, start, mid - 1);
//        node.right = sortedListToBST(list, mid + 1, end);
//
//        return node;
//    }
//
//    // Method to merge two BSTs
//    public static Node mergeBST(Node root1, Node root2) {
//        // Store inorder traversal of both trees
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        storeInOrder(root1, list1);
//        storeInOrder(root2, list2);
//
//        // Merge the two sorted lists
//        ArrayList<Integer> mergedList = merge(list1, list2);
//
//        // Convert the merged list into a balanced BST
//        return sortedListToBST(mergedList, 0, mergedList.size() - 1);
//    }
//    public static void main(String[] args){
//        Node root1 = null;
//        Node root2 = null;
//        int[] arroot1 = {23, 45, 12, 67, 80};
//        int[] arroot2 = {1, 32, 43, 56, 90};
//        for(int el1 : arroot1){
//            root1 = insert(root1, el1);
//        }
//        for(int el2 : arroot2){
//            root2 = insert(root2, el2);
//        }
//        
//        System.out.print("The first BST is: ");
//        inOrder(root1);
//        System.out.println();
//        System.out.print("The second BST is: ");
//        inOrder(root2);
//        System.out.println();
//        System.out.println("The merged BST is:");
//        Node mergedRoot = mergeBST(root1, root2);
//        inOrder(mergedRoot);
//    }
//}


//Home Task 02
//Write a program to insert new element ‘60’ in the Binary tree 
//created in above ques.2
//class Node {
//    Node left, right;
//    int key;
//
//    public Node(int item) {
//        key = item;
//        left = right = null;
//    }
//}
//public class DSALab11 {
//    // Insert a node in the BST
//    static Node insert(Node root, int key) {
//        if (root == null) {
//            return new Node(key);
//        }
//        if (key < root.key) {
//            root.left = insert(root.left, key);
//        } else if (key > root.key) {
//            root.right = insert(root.right, key);
//        }
//        return root;
//    }
//    // Search for a node in the BST
//    static boolean search(Node root, int key) {
//        if (root == null) {
//            return false;
//        }
//        if (root.key == key) {
//            return true;
//        }
//        if (key < root.key) {
//            return search(root.left, key);
//        }
//        return search(root.right, key);
//    }
//    // Find the minimum value node in a subtree
//    static Node findMin(Node root) {
//        while (root.left != null) {
//            root = root.left;
//        }
//        return root;
//    }
//    // Inorder traversal to display the BST
//    static void inOrder(Node root) {
//        if (root != null) {
//            inOrder(root.left);
//            System.out.print(root.key + " ");
//            inOrder(root.right);
//        }
//    }
//    public static void main(String[] args) {
//        Node root = null;
//        int[] elements = {-45, 15, 79, 90, 10, 55, 12, 20, 50};
//        for (int element : elements) {
//            root = insert(root, element);
//        }
//
//        // Display the initial BST
//        System.out.println("Initial BST (Inorder Traversal):");
//        inOrder(root);
//        System.out.println();
//
//        // Take input from the user
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an item to insert: ");
//        int item = scanner.nextInt();
//        root = insert(root, item);
//        // Display the updated BST
//        System.out.println("Updated BST (Inorder Traversal):");
//        inOrder(root);
//    }
//}

//Home Task 03
//You are given a sequence of operations to be performed on a Binary Search Tree
//(BST). The operations are:
//a) INSERT X: Insert a new node with the value X into the BST. If a node with the
//value X already exists, do not insert it again.
//b) FIND X: Check if the node with value X exists in the BST.
//c) INORDER: Print all values in the BST in ascending order (inorder traversal).
//Your task is to implement a program that will execute the given sequence of operations
//and output the results accordingly
//class Node {
//    int key;
//    Node left, right;
//
//    public Node(int item) {
//        key = item;
//        left = right = null;
//    }
//}
//
//public class DSALab11 {
//
//    // Insert a node in the BST
//    static Node insert(Node root, int key) {
//        if (root == null) {
//            return new Node(key);
//        }
//        if (key < root.key) {
//            root.left = insert(root.left, key);
//        } else if (key > root.key) {
//            root.right = insert(root.right, key);
//        }
//        return root;
//    }
//
//    // Search for a node in the BST
//    static boolean search(Node root, int key) {
//        if (root == null) {
//            return false;
//        }
//        if (root.key == key) {
//            return true;
//        }
//        if (key < root.key) {
//            return search(root.left, key);
//        }
//        return search(root.right, key);
//    }
//
//    // Inorder traversal to display the BST
//    static void inOrder(Node root) {
//        if (root != null) {
//            inOrder(root.left);
//            System.out.print(root.key + " ");
//            inOrder(root.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        Node root = null; // Initialize the BST root
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number of operations:");
//        int n = scanner.nextInt(); // Number of operations
//        scanner.nextLine(); // Consume the newline character
//
//        System.out.println("Enter the operations (INSERT X, FIND X, INORDER):");
//        for (int i = 0; i < n; i++) {
//            String operation = scanner.nextLine();
//            String[] parts = operation.split(" ");
//
//            switch (parts[0].toUpperCase()) {
//                case "INSERT":
//                    int insertValue = Integer.parseInt(parts[1]);
//                    root = insert(root, insertValue);
//                    System.out.println("Inserted " + insertValue + " into the "
//                            + "BST.");
//                    break;
//
//                case "FIND":
//                    int findValue = Integer.parseInt(parts[1]);
//                    if (search(root, findValue)) {
//                        System.out.println("Found " + findValue + " in the "
//                                + "BST.");
//                    } else {
//                        System.out.println(findValue + " not found in the "
//                                + "BST.");
//                    }
//                    break;
//
//                case "INORDER":
//                    System.out.print("Inorder Traversal: ");
//                    inOrder(root);
//                    System.out.println();
//                    break;
//
//                default:
//                    System.out.println("Invalid operation! Please use INSERT,"
//                            + " FIND, or INORDER.");
//            }
//        }
//    }
//}


//Home Task 04
//Create a task for employee management system. In an employee management
//system, each employee is represented by an ID, and you need to maintain an efficient
//system that allows you to:
//a) Insert a new employee into the system.
//b) Search for an employee by their ID.
//c) Remove an employee from the system.
//d) Display the employees in different sorted orders
class EmployeeNode {
    int id;
    String name;
    EmployeeNode left, right;

    public EmployeeNode(int id, String name) {
        this.id = id;
        this.name = name;
        left = right = null;
    }
}

public class DSALab11 {
    // Insert a new employee into the system
    static EmployeeNode insert(EmployeeNode root, int id, String name) {
        if (root == null) {
            return new EmployeeNode(id, name);
        }
        if (id < root.id) {
            root.left = insert(root.left, id, name);
        } else if (id > root.id) {
            root.right = insert(root.right, id, name);
        } else {
            System.out.println("Employee with ID " + id + " already exists.");
        }
        return root;
    }

    // Search for an employee by their ID
    static EmployeeNode search(EmployeeNode root, int id) {
        if (root == null || root.id == id) {
            return root;
        }
        if (id < root.id) {
            return search(root.left, id);
        }
        return search(root.right, id);
    }

    // Find the minimum value node in the BST
    static EmployeeNode findMin(EmployeeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Remove an employee from the system
    static EmployeeNode remove(EmployeeNode root, int id) {
        if (root == null) {
            System.out.println("Employee with ID " + id + " does not exist.");
            return root;
        }
        if (id < root.id) {
            root.left = remove(root.left, id);
        } else if (id > root.id) {
            root.right = remove(root.right, id);
        } else {
            // Node with one or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor
            EmployeeNode temp = findMin(root.right);
            root.id = temp.id;
            root.name = temp.name;
            root.right = remove(root.right, temp.id);
        }
        return root;
    }

    // Display employees in ascending order of their IDs (Inorder Traversal)
    static void displayInOrder(EmployeeNode root) {
        if (root != null) {
            displayInOrder(root.left);
            System.out.println("ID: " + root.id + ", Name: " + root.name);
            displayInOrder(root.right);
        }
    }

    // Display employees in descending order of their IDs
    static void displayDescendingOrder(EmployeeNode root) {
        if (root != null) {
            displayDescendingOrder(root.right);
            System.out.println("ID: " + root.id + ", Name: " + root.name);
            displayDescendingOrder(root.left);
        }
    }

    public static void main(String[] args) {
        EmployeeNode root = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Insert a new employee");
            System.out.println("2. Search for an employee");
            System.out.println("3. Remove an employee");
            System.out.println("4. Display employees in ascending order");
            System.out.println("5. Display employees in descending order");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    root = insert(root, id, name);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    id = scanner.nextInt();
                    EmployeeNode employee = search(root, id);
                    if (employee != null) {
                        System.out.println("Employee Found: ID = " 
                                + employee.id + ", Name = " + employee.name);
                    } else {
                        System.out.println("Employee with ID "
                                + id + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    id = scanner.nextInt();
                    root = remove(root, id);
                    break;

                case 4:
                    System.out.println("Employees in ascending order of IDs:");
                    displayInOrder(root);
                    break;

                case 5:
                    System.out.println("Employees in descending order of IDs:");
                    displayDescendingOrder(root);
                    break;

                case 6:
                    System.out.println("Exiting the Employee Management "
                            + "System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
