public class InsertionSort {


    private static void insertionSort(int[] inputArray) {

        for (int j = 2; j < inputArray.length; j++) {
            int key = inputArray[j];

            int i = j - 1;

            while ((i > -1) && (inputArray[i] > key) ) {
                inputArray[i + 1] = inputArray[i];
                i -= 1;
            }

            inputArray[i + 1] = key;
        }
        printSortedArray(inputArray);
    }

    private static void printSortedArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }


    public static void main(String[] args){
        int[] inputArray = {4, 6, 1, 9, 55, 22, 43, 9};
        insertionSort(inputArray);

    }

}
