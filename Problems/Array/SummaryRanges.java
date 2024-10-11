package Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int nums_length = nums.length;

        if (nums_length == 0) return result;

        int flag = 0;
        for (int i = 1; i < nums_length; ++i) {
            StringBuilder sb = new StringBuilder();
            if (nums[i] != nums[i-1]+1) {
//                result.add(
//                        (nums[flag] != nums[i-1])
//                        ? nums[flag] + "->" + nums[i - 1]
//                        : String.valueOf(nums[flag])
//                );
                if (nums[flag] != nums[i-1])
                    sb.append(nums[flag]).append("->").append(nums[i-1]);
                else
                    sb.append(nums[flag]);

                result.add(sb.toString());
                flag = i;
            }
        }

//        result.add(
//                (nums[flag] != nums[nums_length-1])
//                        ? nums[flag] + "->" +nums[nums_length-1]
//                        : String.valueOf(nums[flag])
//        );

        StringBuilder sb = new StringBuilder();
        if (nums[flag] != nums[nums_length-1])
            sb.append(nums[flag]).append("->").append(nums[nums_length-1]);
        else
            sb.append(nums[flag]);
        result.add(sb.toString());

        return result;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}
