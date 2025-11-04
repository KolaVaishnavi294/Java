package aec.edu.in;
public class AdvancedCalculator
{
    public int maximum(int arr[])
    {
         int max=arr[0];
         for(int i=1;i<arr.length;i++)
         {
            if(arr[i]>max)
            {
               max=arr[i];
            }
         }
       return max;
    }
}