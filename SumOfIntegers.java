public class SumOfIntegers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) { // Changed 'b' to 'i' and fixed the condition
            sum += i;
        }
        System.out.println("Sum of integers from 1 to 10: " + sum);
    }
}
