package practice;

public class BinarySerach {
    public static void main(String[] args) {

        int [] arr =  {1,2,3,4,5};

        int si = 0;
        int ei = arr.length-1;
        int search = 5;

        while (si<= ei) {

            int mid = (si+ei)/2;

            if(arr[mid]==search){

                System.out.println(mid + "Is found at the location");
                return;

            }
            if (arr[mid] < search) {
                si = mid + 1;
            }else  {
                ei = mid - 1;
            }
        }
        //System.out.println("Is Not found");


    }
}
