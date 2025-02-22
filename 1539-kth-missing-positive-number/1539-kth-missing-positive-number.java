class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0, num = 1, i = 0;

    while (count < k) {
        if (i < arr.length && arr[i] == num) {
            i++; // Skip existing numbers in arr
        } else {
            count++; // Count missing numbers
        }
        num++;
    }
    return num - 1;
    }
}