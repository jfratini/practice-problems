public class RotateSolution {

    /**
     * This method rotates the positions of the elements in the given array by the given integer 'n' times.
     *
     * @param n int - The number of positions to rotate the array by.
     * @param inputArray int[] - The array to rotate
     * @return int[] - The rotated array
     */
    public static int[] rotateArray(int n, final int[] inputArray) {

    	int[] output = new int[inputArray.length];
    	
    	for(int i = 0; i < inputArray.length; i++) {
    		output[i + n >= inputArray.length ? (i + n) % inputArray.length : i + n] = inputArray[i];
    	}
    	
		return output;

    }
}