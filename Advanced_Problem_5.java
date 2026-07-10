import java.util.ArrayList;

public class Advanced_Problem_5 {

   // Helper function to print the current subset
   public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

   // Recursive function to find all subsets of natural numbers from 1 to n
   public static void findSubsets(int n, ArrayList<Integer> subset) {
       // Base case: jab n=0 ho jaye, current subset print karke return karo
       if(n == 0) {
           printSubsets(subset);
           return;
        }

       // Choice 1: 'n' ko subset mein SHAMIL NAHI karna (Exclude)
       findSubsets(n - 1, subset);
       
       // Choice 2: 'n' ko subset mein SHAMIL KARNA (Include)
       subset.add(n);
       findSubsets(n - 1, subset);
       
       // Backtracking: element ko wapas remove karna taaki doosre paths ke liye list sahi rahe
       subset.remove(subset.size() - 1);
    }

   public static void main(String args[]) {
       int n = 3;
       System.out.print("Permutations for 'abc':");
       findSubsets(n, new ArrayList<Integer>());
    }
}