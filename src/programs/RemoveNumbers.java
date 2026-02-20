package programs;

public class RemoveNumbers {
    public static void main(String[] args) {

        String input = "alsjdnfghgm12345341mkjahsm21343" ;

        String s = input.replaceAll("[0-9]","");

        System.out.println(s);

        //OR

        String str = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A'  && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

                str = str + ch;
            }
        }
        System.out.println(str);

    }
}
