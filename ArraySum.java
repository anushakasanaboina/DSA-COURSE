public class ArraySum {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Call the method to calculate the sum
        int sum = calculateSum(numbers);
        
        // Print the result
        System.out.println("The sum of the array elements is: " + sum);
    }

    // Method to calculate the sum of array elements
    public static int calculateSum(int[] array) {
        int sum = 0;
        // Loop through the array and add each element to sum
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
