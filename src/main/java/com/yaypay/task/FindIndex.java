package com.yaypay.task;

public class FindIndex {

    public int findElem(int[] arr, int elem) {
        return binarySearchAxis(arr, arr.length, elem);
    }

    private int binarySearchAxis(int arr[], int n, int elem) {
        int axis = findingAxis(arr, 0, n - 1);

        if (axis == -1) {
            return binarySearch(arr, 0, n - 1, elem);
        }

        if (arr[axis] == elem) {
            return axis;
        }
        if (arr[0] <= elem) {
            return binarySearch(arr, 0, axis - 1, elem);
        }
        return binarySearch(arr, axis + 1, n - 1, elem);
    }

    private int findingAxis(int arr[], int low, int high) {
        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }

        int mid = (low + high) / 2;

        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return (mid - 1);
        }
        if (arr[low] >= arr[mid]) {
            return findingAxis(arr, low, mid - 1);
        }
        return findingAxis(arr, mid + 1, high);
    }

    private int binarySearch(int arr[], int low, int high, int elem) {
        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (elem == arr[mid]) {
            return mid;
        }
        if (elem > arr[mid]) {
            return binarySearch(arr, (mid + 1), high, elem);
        }
        return binarySearch(arr, low, (mid - 1), elem);
    }
}
