import java.util.ArrayList;

public class permutationsofarray {
     static void permute(int arr[],boolean used[],ArrayList <Integer> list){
        if(list.size()==arr.length){
            System.out.println(list);
            return;
        }
      for(int i=0;i<arr.length;i++){
        if(!used[i]){
            used[i]=true;
            list.add(arr[i]);
            permute(arr,used,list);
            list.remove(list.size()-1);
            used[i]=false;
        }
      }

    }
    public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    boolean[] used = new boolean[arr.length];
    ArrayList<Integer> list = new ArrayList<>();
    permute(arr, used, list);
}
    
}
