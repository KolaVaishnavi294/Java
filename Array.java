import java.util.Scanner;
public class Array
{   
    public static int product(int arr[],int pro)
    {
        for(int i=0;i<arr.length;i++){
            pro*=arr[i];
        }
        return pro;
    }
    public static int sum(int arr[],int arr1[])
    {
        int i,sum=0;
        for(i=0;i<arr.length;i++)
        {
            sum+=arr[i]+arr1[i];
        }
        return sum;
    }
    public static int minimum(int arr[],int min)
    {
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
    public static int maximum(int arr[],int max)
    {
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public static int valueCount(int arr[],int val)
    {   int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==val) c++;
        }
        return c;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,sum=0,pro=1,pro1=1;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            pro1*=arr[i];
        }
        int arr1[]=new int[n];
         for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
         }
         int ans=Array.sum(arr,arr1);
         System.out.println("Sum of 2 arrays= "+ans);
        System.out.println("Sum= "+sum);
        System.out.println("Product= "+pro1);
        int answ=Array.product(arr,pro);
        System.out.println("Product= "+answ);
        int min=arr[0];
        System.out.println("Min value+ "+Array.minimum(arr,min));
        int max=arr[0];
        System.out.println("value to search= ");
        int val=sc.nextInt();
        System.out.println("Max value= "+Array.maximum(arr,max));
        System.out.println("value count= "+Array.valueCount(arr,val));
    }
}