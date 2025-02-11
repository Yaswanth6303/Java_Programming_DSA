package faq_medium.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray_1 {
    public static void printArray(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> leadersBrute(int [] nums) {
        int n = nums.length;

        ArrayList<Integer> LeaderList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                LeaderList.add(nums[i]);
            }
        }

        return LeaderList;
    }
    public static ArrayList<Integer> leadersOptimal(int [] nums) {
        int n = nums.length;

        ArrayList<Integer> LeadersList = new ArrayList<>();
        int max = nums[nums.length - 1];
        LeadersList.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                LeadersList.add(nums[i]);
            }
        }

        Collections.reverse(LeadersList);
        return LeadersList;
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 5, 3, 1, 2};
        List<Integer> leaderListBrute = leadersBrute(nums);
        printArray(leaderListBrute);
        List<Integer> leaderListOptimal = leadersOptimal(nums);
        printArray(leaderListOptimal);
    }
}
