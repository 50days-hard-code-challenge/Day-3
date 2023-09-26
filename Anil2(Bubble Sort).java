public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i = 0; i<n; i++){
            for(int j = 1; j<n-i; j++){
                // Compare the adjacent element 
                // first largest element come to end and so on
                if(arr[j-1]>arr[j]){
                    // swap it 
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
