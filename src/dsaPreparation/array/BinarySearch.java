package dsaPreparation.array;


public class BinarySearch {
    public static void main(String[] args) {

        int []  arr  = {2, 5, 7, 9, 12, 15, 18};

        int serach = 15;

        int si = 0;
        int ei = arr.length-1;

        while (si < ei) {

            int mid = (si + ei) / 2;

            if (arr[mid] == serach) {
                System.out.println("Search element Found at the location " + mid);
                return;
            }
            if (arr[mid] < serach) {
                si = mid + 1;
            }else  {
                ei = mid - 1;
            }

        }
        System.out.println("Not Found");
    }
}
