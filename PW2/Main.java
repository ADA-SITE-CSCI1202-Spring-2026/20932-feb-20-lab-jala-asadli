import java.util.Scanner;

public class Main {

    //min
    public static int findMin(int[] nums) {
        if (nums.length == 0) {
            System.out.println("No value entered");
            return 0;
        }

        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    // max
    public static int findMax(int[] nums) {
        if (nums.length == 0) {
            System.out.println("No value entered");
            return 0;
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // min and max
    public static int[] findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("No value entered");
            return new int[]{0, 0};
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    
    public static void main(String[] args) {

        // command line
        if (args.length > 0) {
            int[] nums = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Command Line Input:");
            System.out.println("Min number is: " + findMin(nums));
            System.out.println("Max number is: " + findMax(nums));

            int[] result = findMinMax(nums);
            System.out.println("MinMax together -> Min: " + result[0] + ", Max: " + result[1]);
        }

        // scanner input
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Scanner Input:");
        System.out.println("Min number is: " + findMin(nums));
        System.out.println("Max number is: " + findMax(nums));

        int[] result = findMinMax(nums);
        System.out.println("MinMax together -> Min: " + result[0] + ", Max: " + result[1]);

        sc.close();
    }
}