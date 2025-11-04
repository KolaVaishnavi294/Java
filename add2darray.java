import java.util.Scanner;
public class add2darray
{
    public static void add(int arr1[][],int arr2[][],int r,int c)
    {
        int i,j,arr3[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
         for(i=0;i<r;i++)
         {
            for(j=0;j<c;j++)
            {
                System.out.println(arr3[i][j]); 
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("row: ");
        int r=sc.nextInt();
        System.out.println("colum: ");
        int c=sc.nextInt();
        System.out.println("Enter matrix 1 elements");
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int i,j;
        for(i=0;i<r;i++)
        {
           for(j=0;j<c;j++)
           {
              arr1[i][j]=sc.nextInt();
           }
        }
        System.out.println("Enter matrix 2 elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        add2darray.add(arr1,arr2,r,c);
    }
}
