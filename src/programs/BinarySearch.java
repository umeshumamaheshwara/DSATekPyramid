package programs;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr =  {1,2,3,4,5};

        int si = 0;
        int ei = arr.length-1;
        int search = 5;

        while (si <= ei) {
            int mid = si + (ei-si)/2;

            if(arr[mid] == search){

                System.out.println("Found at Index Position " + mid);
                return;
            }
            else if(arr[mid] < search){
                si = mid + 1;
            }
            else{
                ei = mid-1;
            }
        }
        System.out.println("Not Found");

    }
}
