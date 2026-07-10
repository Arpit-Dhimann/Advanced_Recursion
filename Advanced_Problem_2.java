// PROBLEM: Count total paths to reach from (0,0) to (m-1, n-1) in a maze
// Moving only Down and Right

public class Advanced_Problem_2 {

   // Recursive function to calculate total paths
   public static int countPaths(int i, int j, int m, int n) {
       // Base case: If we reach the last row or last column, there's only 1 way to reach the destination
       if(i == m-1 || j == n-1) {
           return 1;
        }

       // Recursive calls: 
       // 1. Move Down (i+1, j)
       // 2. Move Right (i, j+1)
       // Return the sum of paths from both directions
       return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
    }

   public static void main(String args[]) {
       int m = 4, n = 5; // Maze dimensions
       System.out.println(countPaths(0, 0, m, n)); // Starting the recursion from (0,0)
    }
}