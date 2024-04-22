package datastructure.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;


/**
 * Dynamic programming is a technique used in computer science and mathematics to solve
 * optimization problems by breaking them down into simpler overlapping subproblems and
 * solving each subproblem only once, storing the solutions to avoid redundant computations
 */
public class Dpfibonacci {
    public static void main(String[] args) {
        TopdownApproach topdownApproach = new TopdownApproach();
        int result = topdownApproach.findfig(5);
        System.out.println("Result with TopdownApproach is " + result);


        BottomupApproach bottomupApproach = new BottomupApproach();
        int resultbottom = bottomupApproach.findfig(5);
        System.out.println("Result with BottomupApproach is " + resultbottom);
    }
}

/**
 * Top-Down Approach (Memoization):
 * <p>
 * In this approach, you solve the problem recursively, but you store the results of subproblems
 * in a data structure (usually an array or a HashMap) to avoid redundant computations.
 * Java provides a way to implement memoization using recursion and a memoization table.
 */
class TopdownApproach {
    private Map<Integer, Integer> intermediateMap = new HashMap<>();

    int findfig(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (intermediateMap.get(n) != null) {
            return intermediateMap.get(n);
        }
        int rest = findfig(n - 1) + findfig(n - 2);
        intermediateMap.put(n, rest);
        return rest;
    }

}

/**
 * Bottom-Up Approach (Tabulation):
 * <p>
 * In this approach, you solve the problem iteratively, starting from the smallest subproblems and building up to the larger problem.
 * You use a table (usually an array) to store solutions to subproblems.
 */

class BottomupApproach {
    int findfig(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}
