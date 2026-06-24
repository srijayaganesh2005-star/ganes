import java.util.*;
public class SpiralMatrix
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (n): ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                A[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        System.out.println("Spiral Order:");
        while (top <= bottom && left <= right) 
        {
            for (int i = left; i <= right; i++) 
            {
                System.out.print(A[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) 
            {
                System.out.print(A[i][right] + " ");
            }
            right--;
            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--) 
                {
                    System.out.print(A[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    System.out.print(A[i][left] + " ");
                }
                left++;
            }
        }
        sc.close();
    }
}