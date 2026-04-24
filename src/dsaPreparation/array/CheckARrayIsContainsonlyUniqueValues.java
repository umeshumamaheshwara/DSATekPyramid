package dsaPreparation.array;

public class CheckARrayIsContainsonlyUniqueValues {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,100,200};
        boolean unique =  true;

        for(int i=0; i<arr.length; i++){
            for(int j = i +1 ; j<arr.length; j++){

                if(arr[i]==arr[j]){

                    unique=false;
                    break;
                }
            }
        }

        if(unique){
            System.out.println("Only Unique Elements are present");
        }else {
            System.out.println("Only Unique Elements are not present");
        }
    }
}
