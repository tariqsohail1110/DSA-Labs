/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab12;

/**
 *
 * @author tariq
 */
import java.util.*;
//Lab Task 01
//Implement BFS and DFS on the given graph.
//public class DSALab12 {
//    // Function to perform BFS
//    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, 
//            int start) {
//        List<Integer> result = new ArrayList<>();
//        Set<Integer> visited = new HashSet<>();
//        Queue<Integer> queue = new LinkedList<>();
//        
//        queue.add(start);
//        visited.add(start);
//        
//        while (!queue.isEmpty()) {
//            int node = queue.poll();
//            result.add(node);
//            
//            for (int neighbor : graph.get(node)) {
//                if (!visited.contains(neighbor)) {
//                    visited.add(neighbor);
//                    queue.add(neighbor);
//                }
//            }
//        }
//        
//        return result;
//    }
//
//    // Function to perform DFS
//    public static List<Integer> dfs(Map<Integer, List<Integer>> graph, 
//            int start) {
//        List<Integer> result = new ArrayList<>();
//        Set<Integer> visited = new HashSet<>();
//        dfsHelper(graph, start, visited, result);
//        return result;
//    }
//
//    private static void dfsHelper(Map<Integer, List<Integer>> graph, int node,
//            Set<Integer> visited, List<Integer> result) {
//        visited.add(node);
//        result.add(node);
//
//        for (int neighbor : graph.get(node)) {
//            if (!visited.contains(neighbor)) {
//                dfsHelper(graph, neighbor, visited, result);
//            }
//        }
//    }
//
//    // Main method
//    public static void main(String[] args) {
//        // Representing the graph as an adjacency list
//        Map<Integer, List<Integer>> graph = new HashMap<>();
//        graph.put(0, Arrays.asList(1, 3));
//        graph.put(1, Arrays.asList(0, 2));
//        graph.put(2, Arrays.asList(1, 3, 4));
//        graph.put(3, Arrays.asList(0, 2));
//        graph.put(4, Arrays.asList(2));
//
//        // Perform BFS and DFS
//        int startNode = 0;
//        List<Integer> bfsResult = bfs(graph, startNode);
//        List<Integer> dfsResult = dfs(graph, startNode);
//
//        // Print results
//        System.out.println("BFS: " + bfsResult);
//        System.out.println("DFS: " + dfsResult);
//    }
//}

//Lab Task 02
//Follow the below instructions to implement BFS traversal.
//a) Declare a queue and insert the starting vertex.
//b) Initialize a visited array and mark the starting vertex as visited.
//Follow the below process till the queue becomes empty:
//a) Remove the first vertex of the queue.
//b) Mark that vertex as visited.
//c) Insert all the unvisited neighbors of the vertex into the queue.
//public class DSALab12 {
//    // Function to perform BFS traversal
//    public static void bfsTraversal(Map<Integer, List<Integer>> graph, 
//            int start) {
//        // Step a) Declare a queue and insert the starting vertex
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(start);
//
//        // Step b) Initialize a visited array and mark the starting vertex as visited
//        boolean[] visited = new boolean[graph.size()];
//        visited[start] = true;
//
//        // BFS Traversal process
//        System.out.print("BFS Traversal: ");
//        while (!queue.isEmpty()) {
//            // a) Remove the first vertex of the queue
//            int currentVertex = queue.poll();
//            System.out.print(currentVertex + " "); // Visit the vertex
//
//            // c) Insert all the unvisited neighbors of the vertex into the queue
//            for (int neighbor : graph.get(currentVertex)) {
//                if (!visited[neighbor]) {
//                    visited[neighbor] = true; // Mark as visited
//                    queue.add(neighbor);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        // Representing the graph as an adjacency list
//        Map<Integer, List<Integer>> graph = new HashMap<>();
//        graph.put(0, Arrays.asList(1, 3));
//        graph.put(1, Arrays.asList(0, 2));
//        graph.put(2, Arrays.asList(1, 3, 4));
//        graph.put(3, Arrays.asList(0, 2));
//        graph.put(4, Arrays.asList(2));
//
//        // Perform BFS starting from node 0
//        int startNode = 0;
//        bfsTraversal(graph, startNode);
//    }
//}


//Home Task 01
//Implement BFS and DFS on the below given graph. 
//public class DSALab12 {
//
//    // BFS Implementation
//    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
//        Queue<Integer> queue = new LinkedList<>();
//        Set<Integer> visited = new HashSet<>();
//
//        // Start BFS
//        queue.add(start);
//        visited.add(start);
//
//        System.out.print("BFS Traversal: ");
//        while (!queue.isEmpty()) {
//            int currentNode = queue.poll();
//            System.out.print(currentNode + " ");
//
//            // Add unvisited neighbors to the queue
//            for (int neighbor : graph.get(currentNode)) {
//                if (!visited.contains(neighbor)) {
//                    visited.add(neighbor);
//                    queue.add(neighbor);
//                }
//            }
//        }
//        System.out.println();
//    }
//
//    // DFS Implementation
//    public static void dfs(Map<Integer, List<Integer>> graph, int start) {
//        Set<Integer> visited = new HashSet<>();
//        System.out.print("DFS Traversal: ");
//        dfsHelper(graph, start, visited);
//        System.out.println();
//    }
//
//    private static void dfsHelper(Map<Integer, List<Integer>> graph, 
//            int currentNode, Set<Integer> visited) {
//        visited.add(currentNode);
//        System.out.print(currentNode + " ");
//
//        // Visit unvisited neighbors
//        for (int neighbor : graph.get(currentNode)) {
//            if (!visited.contains(neighbor)) {
//                dfsHelper(graph, neighbor, visited);
//            }
//        }
//    }
//
//    // Main Method
//    public static void main(String[] args) {
//        // Represent the graph as an adjacency list
//        Map<Integer, List<Integer>> graph = new HashMap<>();
//        graph.put(10, Arrays.asList(20, 30));
//        graph.put(20, Arrays.asList(40, 50));
//        graph.put(30, Arrays.asList(60));
//        graph.put(40, Arrays.asList(10, 20));
//        graph.put(50, Arrays.asList(70));
//        graph.put(60, Arrays.asList(50));
//        graph.put(70, Collections.emptyList());
//
//        // Perform BFS and DFS starting from node 10
//        bfs(graph, 10);
//        dfs(graph, 10);
//    }
//}

//Home Task 02
//Write a JAVA program that creates a recursive function that takes 
//the index of the node and a visited array. Mark the current node as 
//visited and print the node and traverse all the adjacent and unmarked
//nodes and call the recursive function with the index of the adjacent node.
//public class DSALab12 {
//
//    // Recursive DFS function
//    public static void dfsRecursive(Map<Integer, List<Integer>> graph, 
//            int currentNode, boolean[] visited) {
//        // Mark the current node as visited
//        visited[currentNode] = true;
//
//        // Print the current node
//        System.out.print(currentNode + " ");
//
//        // Traverse all adjacent nodes
//        for (int neighbor : graph.get(currentNode)) {
//            if (!visited[neighbor]) {
//                // Call the recursive function for the unvisited neighbor
//                dfsRecursive(graph, neighbor, visited);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        // Represent the graph as an adjacency list
//        Map<Integer, List<Integer>> graph = new HashMap<>();
//        graph.put(0, Arrays.asList(1, 2));
//        graph.put(1, Arrays.asList(0, 3, 4));
//        graph.put(2, Arrays.asList(0, 5));
//        graph.put(3, Arrays.asList(1));
//        graph.put(4, Arrays.asList(1, 5));
//        graph.put(5, Arrays.asList(2, 4));
//
//        // Total number of nodes (adjust based on the graph)
//        int totalNodes = graph.size();
//
//        // Initialize the visited array
//        boolean[] visited = new boolean[totalNodes];
//
//        // Perform DFS starting from node 0
//        System.out.print("DFS Traversal: ");
//        dfsRecursive(graph, 0, visited);
//        System.out.println();
//    }
//}

//Home Task 03
//Find the shortest transformation sequence from a start word to an end word, 
//changing one letter at a time such that each transformed word exists in a given dictionary.
//a)	Use BFS to explore all possible transformations and keep track of the sequence length.
//b)	Each word must be connected by a single letter change, and BFS ensures the shortest sequence is found.
//public class DSALab12 {
//    // Function to find the shortest transformation sequence
//    public static int shortestTransformation(String startWord, 
//            String endWord, List<String> wordList) {
//        // Convert the word list to a set for fast lookup
//        Set<String> wordSet = new HashSet<>(wordList);
//        
//        // If the endWord is not in the dictionary, return 0 (impossible transformation)
//        if (!wordSet.contains(endWord)) {
//            return 0;
//        }
//
//        // Initialize BFS queue
//        Queue<String> queue = new LinkedList<>();
//        queue.add(startWord);
//
//        // To keep track of the number of transformations (levels in BFS)
//        int steps = 1;
//
//        // Perform BFS
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                String currentWord = queue.poll();
//
//                // Check if we have reached the endWord
//                if (currentWord.equals(endWord)) {
//                    return steps;
//                }
//
//                // Explore all possible transformations
//                List<String> neighbors = getNeighbors(currentWord, wordSet);
//                for (String neighbor : neighbors) {
//                    queue.add(neighbor);
//                    wordSet.remove(neighbor); // Remove the word from the set to prevent revisiting
//                }
//            }
//            steps++; // Increment the level (step)
//        }
//
//        // If we exhaust all possibilities and don't find the endWord
//        return 0;
//    }
//
//    // Helper function to generate all possible one-letter transformations
//    private static List<String> getNeighbors(String word, Set<String> wordSet) {
//        List<String> neighbors = new ArrayList<>();
//        char[] wordChars = word.toCharArray();
//
//        for (int i = 0; i < wordChars.length; i++) {
//            char originalChar = wordChars[i];
//
//            for (char c = 'a'; c <= 'z'; c++) {
//                if (c == originalChar) continue; // Skip the original character
//                wordChars[i] = c;
//
//                String transformedWord = new String(wordChars);
//                if (wordSet.contains(transformedWord)) {
//                    neighbors.add(transformedWord);
//                }
//            }
//
//            wordChars[i] = originalChar; // Restore the original character
//        }
//
//        return neighbors;
//    }
//
//    public static void main(String[] args) {
//        String startWord = "hit";
//        String endWord = "cog";
//        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot",
//                "log", "cog");
//
//        int result = shortestTransformation(startWord, endWord, wordList);
//
//        if (result != 0) {
//            System.out.println("The shortest transformation sequence "
//                    + "length is: " + result);
//        } else {
//            System.out.println("No transformation sequence exists.");
//        }
//    }
//}


//Home Task 04
//4. Clone a graph where each node has a value and a list of its neighbors.
//a)Use BFS to traverse and clone each node and its neighbors while maintaining the graph structure.
//b)Ensure that all nodes are copied correctly and no node is visited more than once.
class GraphNode {
    int value; // Node's value
    List<GraphNode> neighbors; // List of neighbors

    public GraphNode(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
}

public class DSALab12 {
    // Function to clone the graph using BFS
    public static GraphNode cloneGraph(GraphNode node) {
        if (node == null) {
            return null;
        }

        // Map to store the mapping from original node to cloned node
        Map<GraphNode, GraphNode> nodeMap = new HashMap<>();

        // Initialize the BFS queue
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        // Create the clone of the starting node and add to the map
        nodeMap.put(node, new GraphNode(node.value));

        // Perform BFS
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();

            // Iterate through the neighbors of the current node
            for (GraphNode neighbor : currentNode.neighbors) {
                // If the neighbor has not been cloned yet
                if (!nodeMap.containsKey(neighbor)) {
                    // Clone the neighbor and add it to the map
                    nodeMap.put(neighbor, new GraphNode(neighbor.value));
                    // Add the neighbor to the queue for BFS
                    queue.add(neighbor);
                }
                // Add the cloned neighbor to the cloned current node's neighbors list
                nodeMap.get(currentNode).neighbors.add(nodeMap.get(neighbor));
            }
        }

        // Return the cloned graph's starting node
        return nodeMap.get(node);
    }

    // Function to print the graph (for verification)
    public static void printGraph(GraphNode node, Set<GraphNode> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }
        visited.add(node);

        // Print the current node and its neighbors
        System.out.print("Node " + node.value + " -> ");
        for (GraphNode neighbor : node.neighbors) {
            System.out.print(neighbor.value + " ");
        }
        System.out.println();

        // Recursively print all neighbors
        for (GraphNode neighbor : node.neighbors) {
            printGraph(neighbor, visited);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create the graph
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        System.out.println("Original graph:");
        printGraph(node1, new HashSet<>());

        // Clone the graph
        GraphNode clonedGraph = cloneGraph(node1);

        System.out.println("\nCloned graph:");
        printGraph(clonedGraph, new HashSet<>());
    }
}
