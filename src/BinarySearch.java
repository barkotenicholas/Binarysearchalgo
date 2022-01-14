public class BinarySearch {

    public static void main(String[] args) {

        int [] intArray = {-22,-15,1,7,20,35,55};

        System.out.println(iterativeBinarySearch(intArray,1));
        System.out.println(iterativeBinarySearch(intArray,7));
        System.out.println(iterativeBinarySearch(intArray,2));
    }

    public static  int iterativeBinarySearch(int [] array ,int value){

        int start = 0;
        int end = array.length;


        while (start < end){

            int midpoint = (start + end) / 2;

            if (array[midpoint] == value) {
                return midpoint;
            } else if (array[midpoint] < value) {
                start = midpoint + 1;

            }else {
                end = midpoint;
            }

        }

        return -1;
    }


    public static int recusivebinaryserach(int [] array, int value){

        return recusive(array , 0 , array.length,value);

    }

    private static int recusive(int[] array, int start, int end, int value) {

        if(start >= end) return -1;

        int midpoint  = (start + end) / 2;

        if(array[midpoint] == value){
            return  midpoint;
        }else if(array[midpoint] < value){
            recusive(array,midpoint+1,end,value);
        }
        else {
            recusive(array, start,midpoint,value);
        }
    return -1;
    }

}
