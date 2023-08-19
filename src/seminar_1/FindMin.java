package seminar_1;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 4, 9, 88, 5, 0, 3};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        System.out.println("Min of array is " + min);
    }
}