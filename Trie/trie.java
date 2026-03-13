import java.util.*;

public class trie {
    
    static class Node {
        Node[] children = new Node[26]; // Array to hold 26 lowercase English characters
        boolean eow = false; // End of word flag

        Node() {
            // Initialize all children as null
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); // Root of the Trie

    // Insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a'; // Calculate index based on 'a'
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node(); // Create a new node if it doesn't exist
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // Mark the end of the word
    }

    // Search for a word in the Trie
    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a'; // Calculate index based on 'a'
            if (curr.children[idx] == null) {
                return false; // Return false if any character is missing
            }
            curr = curr.children[idx];
        }
        return curr.eow; // Return true if the end of the word is reached
    }

    public static void main(String[] args) {
        // Words to insert into the Trie
        String[] words = { "the", "a", "there", "their", "any", "thee" };
        
        // Insert each word into the Trie
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        // Test the search function
        System.out.println(search("any")); // true
        System.out.println(search("the")); // true
        System.out.println(search("there")); // true
        System.out.println(search("their")); // true
        System.out.println(search("these")); // false (not inserted)
    }
}
