package programs;


public class ReverseAstringWithoutAffectingthePositionsOfSpecialCharacters {

    public static void main(String[] args) {

        String str = "a,b$c";
        char[] arr = str.toCharArray();

        int i = 0;
        int j = arr.length-1;

        while (i < j){

            if(!Character.isLetter(arr[i])){
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                j--;
            }
            // both are alphabets → swap
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
    }
        System.out.println(new String(arr));

   }
}
