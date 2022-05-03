package bubblesort.scheifle.com;

import java.util.Arrays;

public class Application {

    private static int[] array = new int[]{10, 20, 9, 42, 31 , 1337, 9, 5};

    public static void main(String[] args){
        boolean isSorted = false;

        while(!isSorted){
            isSorted=true;
            for(int i = 1; i<array.length-1; i++){
                if(array[i]>array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
