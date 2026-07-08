import java.util.*;
public class twoSumBrute{
    public static int[] twoSum(int arr[],int target)
{
      int n=arr.length;
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
        }
      }
      return new int[]{-1,-1};
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the target: ");
    int t=sc.nextInt();
    System.out.println("Enter the array size: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int output[]=twoSum(arr,t);
    if(output[0]==-1){
        System.out.println("No pair found.");
    
    }else{
        System.out.println("Indices of the pair found is: "+output[0]+", "+output[1]);
    }
    sc.close();
}}