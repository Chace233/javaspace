package com.clin.chace.demo.logic.array;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1; j >= 0;) {
            if (i < 0 || nums2[j] >= nums1[i]) {
                nums1[i + j + 1] = nums2[j];
                j--;
            } else {
                nums1[i + j + 1] = nums1[i];
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        MergeSortedArray.merge(nums1, 0, nums2, 1);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
