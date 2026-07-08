import java.util.*;
public class twosumMap {
    public static int[] twoSum(int arr[],int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(arr[i],i);
        }return new int[]{-1,-1};
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
    }
}
