import java.util.Scanner;
public class Bubblesort
{
    public static void Bubble(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int findpeak(int arr[])
    {
        int n=arr.length;
        if(arr[0]>arr[1]){
        return 0;}
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            return i;
        }
        if(arr[n-1]>arr[n-2]){
        return n-1;}
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=Bubblesort.findpeak(arr);
        if(ans==-1){
            System.out.println("No peak element");
        }
        else{
           System.out.println(ans);
        }
        System.out.println("");
        Bubble(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        int ans1=Bubblesort.findpeak(arr);
        if(ans1==-1){
            System.out.println("No peak element");
        }
        else{
           System.out.println(ans1);
        }
    }
}