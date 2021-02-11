import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        
        for (int i = 1; i < list.size(); i++){

            
            
            for (int j =0; j<list.size();j++){
                if ((list.get(i)<list.get(j+1) && (list.get(i) > list.get(j))){
                    list.set(list.get(i),j);
                }
            }
        }
        return list;

        
        
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int [] merged = new int[arr1.length + arr2.length];
        int x = 0;
        int y = 0;
        int z = 0;
        while (x < arr1.length && y < arr2.length){
            if (arr1[x] < arr2[y]){
                merged[z] = arr1[x];
                x++;
            }
            else {
                merged[z] = arr2[y];
                y++;
            }
            z++;
        }
        while (x < arr1.length){
            merged[z] = arr1[x];
            x++;
            z++;
        }
        while (y < arr2.length){
            merged[z] = arr2[y];
            y++;
            z++;
        }
        return merged;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
