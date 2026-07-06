package DSA.BACKTRACKING;

public class CoinPermutation {
    public static void main(String[] args) {
        int coins[] = new int[] { 2, 1, 3, 5 };
        permute(coins, 4, "");
    }

    public static void permute(int coins[], int amount, String result) {

        if (amount == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < coins.length; i++) {

            if (coins[i] <= amount) {
                permute(coins, amount - coins[i], result + coins[i]);
                /* --back tracking-- */
                // amount -= coins[i];
                // permute(coins, amount, result + coins[i]);
                // amount += coins[i];
            }
        }
    }
}
