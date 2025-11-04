import java.util.Scanner;
public class peak
{
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
          x[i]=sc.nextInt();
        }
        int ans=peak.findpeak(x);
        if(ans==-1){
            System.out.println("No peak element");
        }
        else{
           System.out.println(ans);
        }

    }
}