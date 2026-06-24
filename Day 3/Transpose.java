import java.util.*;
class Transpose {
    public static void main(String[] args) {
       int i, j;
       int[][] a=new int[3][3];
       Scanner s=new Scanner(System.in);
       System.out.println("Enter given Matrix:");
       for(i=0;i<3;i++)
       {
           for(j=0;j<3;j++)
           {
               a[i][j]=s.nextInt();
           }
       }
       System.out.println("Transpose a Matrix is:");
       for(i=0;i<3;i++)
       {
           for(j=0;j<3;j++)
           {
               System.out.print(a[j][i]+" ");
           }
           System.out.println();
       }
    }
}