//PROBLEM: Friends pairing problem

public class Advanced_Problem_4 {

    // Function to calculate the number of ways to pair n friends
    public static int pairFriends(int n) {
        // Base case: If 0 or 1 friend, only 1 way (everyone alone)
        if(n <= 1) {
            return 1;
        }

        // Recursive Logic:
        // 1. pairFriends(n-1): Friend n stays alone.
        // 2. (n-1) * pairFriends(n-2): Friend n pairs with any of the (n-1) friends.
        return pairFriends(n-1) + (n-1) * pairFriends(n-2);
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println(pairFriends(n));
    }
}