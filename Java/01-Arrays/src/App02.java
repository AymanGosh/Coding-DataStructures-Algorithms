
public class App02 {
    public static void main(String[] args) throws Exception {
        App02 app = new App02();
        int[] arr1 = { 0, 3, 4, 31 };
        int[] arr2 = { 3, 4, 6, 30 };

        int[] mergedArray = app.mergeSortedArrays(arr1, arr2);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    private int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }
        return mergedArr;

    }

}
