public class MergeSort {

    private static int SENTINEL = Integer.MAX_VALUE;

    public static void main(String[] args){
        int[] inputArray = {12, 4, 1, 22, 41, 86, 99, 6};
        int p = 0;
        int r = inputArray.length - 1;
        sort(inputArray, p, r);
        displaySortedArray(inputArray);
    }

    private static void sort(int[] inputArray, int p, int r){
        if (p < r) {
            int q = (p+r)/2;
            sort(inputArray, p, q);
            sort(inputArray, q+1, r);
            merge(inputArray, p, q, r);
        }

    }
    private static void merge(int[] inputArray, int low, int middle, int high) {
        int[] tempArray = new int[inputArray.length];

        for (int i = low; i <= high ; i ++) {
            tempArray[i] = inputArray[i];
        }

        int i = low;
        int j = middle +1;
        int k = low;

        while (i <= middle && j <= high){
            if(tempArray[i] < tempArray[j]) {
                inputArray[k] = tempArray[i];
                i++;
            } else {
                inputArray[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            inputArray[k] = tempArray[i];
            k++;
            i++;
        }
    }

    private static void displaySortedArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}