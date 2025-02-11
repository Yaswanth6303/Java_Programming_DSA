package logicBuilding.solutions;

public class MoveZeroes_1 {
    public static void printArray(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void moverZeroesBrute(int [] nums) {
        int n = nums.length;
        int [] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[count] = nums[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }

        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }

    public static void moveZeroesOptimal(int [] nums) {
        int n = nums.length;

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }

    public static void moveZeroesOptimal_1(int [] nums) {
        int n = nums.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moverZeroesBrute(nums);
        printArray(nums);
        int [] nums1 = {0, 0, 0, 1, 3, -2};
        moveZeroesOptimal(nums1);
        printArray(nums1);
        int [] nums2 = {0, 20, 0, -20, 0, 20};
        moveZeroesOptimal_1(nums2);
        printArray(nums2);
    }
}
