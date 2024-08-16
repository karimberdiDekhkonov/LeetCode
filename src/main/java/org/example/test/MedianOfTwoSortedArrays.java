package org.example.test;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int index1 = 0, index2 = 0;
        int currentMedian = 0, previousMedian = 0;

        System.out.println("Starting to find median:");
        System.out.println("nums1: " + java.util.Arrays.toString(nums1));
        System.out.println("nums2: " + java.util.Arrays.toString(nums2));

        // Find the median by iterating up to the middle of the combined array length
        for (int iteration = 0; iteration <= (length1 + length2) / 2; iteration++) {
            previousMedian = currentMedian;
            System.out.printf("Iteration %d: previousMedian = %d, currentMedian = %d\n", iteration, previousMedian, currentMedian);

            if (index1 != length1 && index2 != length2) {
                if (nums1[index1] > nums2[index2]) {
                    currentMedian = nums2[index2++];
                } else {
                    currentMedian = nums1[index1++];
                }
            } else if (index1 < length1) {
                currentMedian = nums1[index1++];
            } else {
                currentMedian = nums2[index2++];
            }

            System.out.printf("Updated values: index1 = %d, index2 = %d, currentMedian = %d\n", index1, index2, currentMedian);
        }

        System.out.println("Final values before median calculation:");
        System.out.printf("previousMedian = %d, currentMedian = %d\n", previousMedian, currentMedian);

        // Check if the total length is odd or even and return the appropriate median value
        if ((length1 + length2) % 2 == 1) {
            System.out.println("The total length is odd. Median = " + (double) currentMedian);
            return (double) currentMedian;
        } else {
            double medianSum = (double) currentMedian + (double) previousMedian;
            double median = medianSum / 2.0;
            System.out.println("The total length is even. Median = " + median);
            return median;
        }
    }
}

