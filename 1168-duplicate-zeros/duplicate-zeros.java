class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeros++;
        }
        int j = arr.length - 1 + zeros;

        for(int i = arr.length - 1; i != j; i--) {
            shift(arr, i, j);
            j--;
            if (arr[i] == 0) {
                shift(arr, i, j);
                j--;
            }
        }
    }

    void shift(int arr[], int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
}