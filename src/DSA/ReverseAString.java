package DSA;

public class ReverseAString {
    public static void main(String[] args) {

        String original = "automation";

        String rev = new StringBuilder(original).reverse().toString();

        System.out.println(rev);


    }
}
