//PROBLEM: Tiling problem

public class Advanced_Problem_3 {

   // Function to count ways to place tiles of size 1xM in a floor of size NxM
   public static int placeTiles(int n, int m) {
        // Base Case 1: If floor width is less than tile width, only 1 way (vertical placement)
        if(n < m) {
            return 1;
        } 
        // Base Case 2: If floor width equals tile width, 2 ways: all vertical OR all horizontal
        else if(n == m) {
            return 2;
        }

        // Recursive Step:
        // 1. placeTiles(n-1, m): Place one tile vertically (removes 1 unit width)
        // 2. placeTiles(n-m, m): Place m tiles horizontally (removes m unit width)
        return placeTiles(n-1, m) + placeTiles(n-m, m);
    }

   public static void main(String args[]) {
       int n = 4, m = 2; // Usually n=4, m=2 is the standard example
       System.out.println(placeTiles(n, m));
    }
}