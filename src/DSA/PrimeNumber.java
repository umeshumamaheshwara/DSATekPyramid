package DSA;

public class PrimeNumber {
    public static void main(String[] args) {

        int n = 4;
        boolean f  = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                f = false;
                break;
            }
        }

        if (f) {
            System.out.println("Prime Number");
        }
        else  {
            System.out.println("Not Prime Number");
        }
    }
}
