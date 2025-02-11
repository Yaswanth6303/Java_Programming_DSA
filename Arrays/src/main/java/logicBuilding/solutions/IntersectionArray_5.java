package logicBuilding.solutions;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArray_5 {
    public static void printArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int[] intersectionArrayBrute(int[] nums1, int[] nums2) {
        int [] visitedArray = new int[nums2.length];
        List<Integer> IntersectionList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && visitedArray[j] == 0) {
                    IntersectionList.add(nums2[j]);
                    visitedArray[j] = 1;
                    break;
                } else if (nums2[j] > nums1[i]) {
                    break;
                }
            }
        }

        int [] intersectionArray = new int[IntersectionList.size()];
        int index = 0;
        for (int num : IntersectionList) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;
    }
    
    public static int [] intersectionArrayOptimal(int [] nums1, int [] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        int i = 0;
        int j = 0;

        List<Integer> IntersectionList = new ArrayList<>();
        
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] > nums2[i]) {
                j++;
            } else {
                IntersectionList.add(nums1[i]);
                i++;
                j++;
            }
        }

        int [] intersectionArray = new int[IntersectionList.size()];
        int index = 0;
        for (int num : IntersectionList) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;
    } 

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7, 8};

        int[] intersectionArrayBrute = intersectionArrayBrute(nums1, nums2);
        printArray(intersectionArrayBrute);

        int[] intersectionArrayOptimal = intersectionArrayOptimal(nums1, nums2);
        printArray(intersectionArrayOptimal);
    }
}
