import java.util.*;
public class TwoSumTwoPointer 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++)
		{
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        while (left < right) 
		{
            int sum = nums[left] + nums[right];
            if (sum == target) 
			{
                System.out.println("Output: [" + left + ", " + right + "]");
                return;
            } else if (sum < target) 
			{
                left++;
            } else
			{
                right--;
            }
        }
        System.out.println("No solution found.");
    }
}