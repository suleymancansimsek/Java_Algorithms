import java.util.Arrays;

// In textbook C1.20 example solution:

public class C1_20 {

    //main method
    public static void main(String[] args) {

        float array[] = {1.4F, 8.7F, 42.1F, 53.6F, 48.7F, 1.1F, 33.9F, 42.1F};

        float array2[] = {1.4F, 8.7F, 42.1F, 53.6F, 48.7F, 1.1F, 33.9F};

        boolean isDifferent = isAllDifferent(array2);

        if (isDifferent){
            System.out.println("all different");
        }else {
            System.out.println(" not all different");

        }

    }

    // in here we examine whether the array's children is all different from each other or not
    public static boolean isAllDifferent(float array[]){
        boolean different = true;

        insertionSort(array); //first sort array

        for (int i=0; i< array.length; i++){

            if ( i+1 != array.length && array[i] == array[i+1]){
                different = false;
            }
        }

        return different;
    }

    // ı want to use insertion sort for sorting array
    public static void insertionSort(float array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            float key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        System.out.println(Arrays.toString(array));
    }

}
