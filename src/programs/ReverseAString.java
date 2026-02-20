package programs;

public class ReverseAString {
    public static void main(String[] args) {

        String s = "ProGRaMmInG";

        String res = " ";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                res = res + (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                res = res + (char)(ch - 32);
            }
        }
        System.out.println(res);
        }
    }
