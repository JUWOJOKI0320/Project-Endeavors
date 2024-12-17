package DataStructures_Algorithms;

import java.util.Arrays;

public class InterpolationSearch {
    public static void main(String[]args){
        int[] array = {35,23,30,1};
        Arrays.sort(array);
        int index = InterpolSearch(array, 35);

        if(index != -1){
            System.out.println("Index found at: " + index);
        }
        else{
            System.out.println("Index not found");
        }
    }

    public static int InterpolSearch(int[] array, int value){
        int high = array.length - 1;
        int low = 0;
        while(value >= array[low] && value <= array[high] && high>=low) {
            int probe = low + (high - low) * (array[high] - array[low]) /
                    (array[high] - array[low]);
            System.out.println("Probe: " + probe);
            if (array[probe] == value) {
                return probe;
            }
            else if(array[probe] < value){
                low = probe + 1;
            }
            else{
                high = probe -1;
            }
        }
        return -1;
    }
}
