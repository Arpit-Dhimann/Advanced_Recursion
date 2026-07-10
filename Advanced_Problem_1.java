// PROBLEM: Print all the permutations of a string.

public class Advanced_Problem_1 {

    // Function to generate all permutations
    // str: current available string, perm: string built so far
    public static void printPermutation(String str, int idx, String perm) {
        // Base case: If no characters left in the input string, print the permutation
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
       
        // Recursive loop: Pick each character once and create a new string excluding it
        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            
            // newStr contains everything except the picked character
            String newStr = str.substring(0, i) + str.substring(i + 1);
            
            // Recursive call with reduced string and updated permutation
            printPermutation(newStr, idx + 1, perm + currChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        // Start recursion with empty permutation string
        printPermutation(str, 0, "");
    }
}