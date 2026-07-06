package DSA.BACKTRACKING;

public class PalindromePartition {

    public static void main(String[] args) {

        partition("nitin", "");
    }

    private static void partition(String remainingString, String currentResult) {

        if (remainingString.length() == 0) {
            System.out.println(currentResult);
            return;
        }
        for (int i = 1; i <= remainingString.length(); i++) {
            String ans = remainingString.substring(0, i);

            partition(remainingString.substring(i), currentResult + "|"+ans);

        }
    }
    private 
}
