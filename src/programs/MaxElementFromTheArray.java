package programs;

public class MaxElementFromTheArray {
    public static void main(String[] args) {

        int[] peakRecord = {2, 3, 1, 15, 9, 35, 65, 2, 7, 5};

        int max = peakRecord[0];
        for (int i = 1; i < peakRecord.length; i++) {
            if (peakRecord[i] > max) {
                max = peakRecord[i];
            }
        }
        System.out.println("Max Element From The Array Is: "+max);
    }
}
