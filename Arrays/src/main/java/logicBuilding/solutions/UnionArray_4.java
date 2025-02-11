package logicBuilding.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionArray_4 {
    public static void printArray(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static int [] unionArrayBrute(int [] nums1, int [] nums2) {
        Set<Integer> set = new TreeSet<>();

        for (int value : nums1) {
            set.add(value);
        }

        for (int value : nums2) {
            set.add(value);
        }

        int [] unionArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            unionArray[index++] = num;
        }

        return unionArray;
    }

    public static int [] unionArrayOptimal(int [] nums1, int [] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        List<Integer> UnionList = new ArrayList<>();

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums1[i]) {
                    UnionList.add(nums1[i]);
                }
                i++;
            } else {
                if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums2[j]) {
                    UnionList.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums1[i]) {
                UnionList.add(nums1[i]);
            }
            i++;
        }

        while (j < m) {
            if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums2[j]) {
                UnionList.add(nums2[j]);
            }
            j++;
        }

        int [] unionArray = new int[UnionList.size()];
        int index = 0;
        for (int num : UnionList) {
            unionArray[index++] = num;
        }

        return unionArray;
    }
    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 4, 4, 5};
        int [] nums2 = {3, 4, 5, 6, 7, 8, 9};

        int [] unionArray = unionArrayOptimal(nums1, nums2);
        printArray(unionArray);
    }
}
