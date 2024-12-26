public class VarArgs {
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num; 
        }
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method 
        int sum1 = calculateSum(1, 2, 3);
        System.out.println("Sum of 1, 2, 3: " + sum1);

        int sum2 = calculateSum(10, 20, 30, 40, 50);
        System.out.println("Sum of 10, 20, 30, 40, 50: " + sum2);

        int sum3 = calculateSum(); // No arguments
        System.out.println("Sum of no numbers: " + sum3);
    }
}