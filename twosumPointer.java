import java.util.*;
public class twosumPointer {
    public static boolean twoSum(int arr[],int target){
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if (sum==target){
                return true;
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }return false;
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
    boolean output=twoSum(arr,t);
    if(output==false){
        System.out.println("No pair found.");
    
    }else{
        System.out.println("Pair found");
    }
    sc.close();
    }
}
