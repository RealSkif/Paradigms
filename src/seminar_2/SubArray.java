package seminar_2;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
    //Не стал полностью перебирать все варианты подмассивов, это будет уже довольно сложной задачей)
    public static void divideArray(int[] nums, int xValue) {
        List<Integer> currentSubarray = new ArrayList<>();
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num <= xValue) {
                currentSubarray.add(num);
                currentSum += num;
            } else {
                System.out.println(currentSubarray);
                currentSubarray = new ArrayList<>();
                currentSubarray.add(num);
                currentSum = num;
            }

        }
        System.out.println(currentSubarray);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int X = 15;

        divideArray(nums, X);
    }
}
