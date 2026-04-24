package DSA;

public class SmallestInArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 25, 8, 15, 3};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
