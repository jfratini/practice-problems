package solutions;

import java.util.Arrays;

public class MyCoinChangeSolution {

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
					if (totalAmount <= amount) {
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

	private int[] incrementIndex(int[] coinCount, int index) {
		coinCount[index]++;
		for (int i = index - 1; i >= 0; i--) {
			coinCount[i] = 0;
		}
		return coinCount;
	}

	private int calculateFirstCoin(int amount, int[] coins, int[] coinCount) {
		coinCount[0] = 0;
		return (amount - findTotalAmount(coins, coinCount)) / coins[0];
	}

	private int findTotalAmount(int[] coins, int[] counts) {
		int sum = 0;
		for (int i = 0; i < coins.length; i++) {
			sum += (coins[i] * counts[i]);
		}
		return sum;
	}

}
