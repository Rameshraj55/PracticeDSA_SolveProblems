package etc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 0, 8, 1, 3};
        int[] resArray = new int[array.length];

        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j < array.length-1 ; j++) {
                if(array[i] < array[j]){
                    resArray[i] = array[j];
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(resArray));

    }
}
