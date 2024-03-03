package org.example.easy.array;

public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int res = 0;
            quickSort(nums, 0, nums.length-1);
            binarySearch(nums, val, res);

            return res;
        }

        public static void binarySearch(int[] arr, int val, int res){

            System.out.println();
        }

        public static void quickSort(int[] arr, int low, int high){
            if(low<high){
                int pivotIndex = partition(arr, low, high);
                quickSort(arr,low, pivotIndex-1);
                quickSort(arr, pivotIndex+1, high);
            }
        }

        public static int partition(int[] arr, int low, int high){
            int pivot=arr[high];
            int i = low;

            for(int j = low; j < high; j++){
                if(arr[j] < pivot){
                    swap(arr, i, j);
                    i++;
                }
            }

            swap(arr, i, high);
            return i;
        }

        public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
