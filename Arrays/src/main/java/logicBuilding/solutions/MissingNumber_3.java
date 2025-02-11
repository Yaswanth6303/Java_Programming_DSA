package logicBuilding.solutions;

public class MissingNumber_3 {
    public static int missingNumberBrute(int [] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) return i;
        }
        return -1;
    }

    public static int missingNumberBetter(int [] nums) {
        int n = nums.length;

        int [] frequencyArray = new int[n + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                frequencyArray[i]++;
            }
        }

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public static int missingNumberOptimal1(int [] nums) {
        int n = nums.length;

        int n_sum = (n * (n + 1) / 2);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }

        int missingNumber = n_sum - sum;
        return missingNumber;
    }
    public static int missingNumberOptimal2(int [] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ (i + 1);
            xor2 = xor2 ^ nums[i];
        }

        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        int [] nums = {0, 1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println(missingNumberBrute(nums));
        System.out.println(missingNumberBetter(nums));
        System.out.println(missingNumberOptimal1(nums));
        System.out.println(missingNumberOptimal2(nums));
    }
}
