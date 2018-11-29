package solutions;

import java.util.Arrays;

public class MyCoinChangeSolution {

	/**
	 * This method calculates the number of combinations that are possible to make
	 * change for the given amount, using the given coins.
	 * 
	 * @param amount
	 *            int - The number to make change for.
	 * @param coins
	 *            int[] - An array of different coins.
	 * @return int - The number of possible combinations.
	 */
	public int findChangeCombinations(int amount, int[] coins) {
		int solutionCount = 0;
		Arrays.sort(coins);
		int[] coinCount = new int[coins.length];

		if (amount > coins[0]) {
			if (amount % coins[0] == 0) {
				solutionCount++;
			}
			for (int i = 1; i < coins.length; i++) {
				do {
					coinCount = incrementIndex(coinCount, i);
					coinCount[0] = calculateFirstCoin(amount, coins, coinCount);
					if (coinCount[0] < 0) {
						// cant have negative coins so filter out this case
						coinCount[0] = 0;
					}
					int totalAmount = findTotalAmount(coins, coinCount);
					if (totalAmount == amount) {
						solutionCount++;
					}
					while (totalAmount <= amount && i > 0) {
						i--;
						coinCount[i] = 0;
					}
				} while (coinCount[0] > 0);
			}
		} else {
			return 0;
		}

		return solutionCount;
	}

	/**
	 * This helper method increments the coin count for the coin corresponding to
	 * the given index
	 * 
	 * @param coinCount
	 *            int[] - The current count of each coin.
	 * @param index
	 *            int - The index of the coin we want to increment.
	 * @return int[] the array of coin counts after the increment procedure.
	 */
	private int[] incrementIndex(int[] coinCount, int index) {
		coinCount[index]++;
		for (int i = index - 1; i >= 0; i--) {
			coinCount[i] = 0;
		}
		return coinCount;
	}

	/**
	 * This helper method calculates the value of the first coin, this saves time as
	 * we dont have to try as many combinations if we already know how many of the
	 * first coin we need to end up with most posilbe first coins to hit or exceed
	 * the amount.
	 * 
	 * @param amount
	 *            int - The number to make change for.
	 * @param coins
	 *            int[] - An array of different coins.
	 * @param coinCount
	 *            int[] - The current count of each coin.
	 * @return int - The value to use for the first coin. This value may or may not
	 *         make for an even total amount of the coins.
	 */
	private int calculateFirstCoin(int amount, int[] coins, int[] coinCount) {
		coinCount[0] = 0;
		return (amount - findTotalAmount(coins, coinCount)) / coins[0];
	}

	/**
	 * Calculate the total amount for the given list of coins and coin counts.
	 * 
	 * @param coins
	 *            int[] - An array of different coins.
	 * @param counts
	 *            int[] - The current count of each coin.
	 * @return int - The total sum of the given coins.
	 */
	private int findTotalAmount(int[] coins, int[] counts) {
		int sum = 0;
		for (int i = 0; i < coins.length; i++) {
			sum += (coins[i] * counts[i]);
		}
		return sum;
	}

}
