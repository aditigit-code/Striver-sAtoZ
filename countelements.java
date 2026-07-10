import java.util.*;
public class countelements {
    public static void main(String args[])
{
    int arr[]={1,2,3,2,1};
    HashSet<Integer>set=new HashSet<>();
    
    for(int num:arr){
        set.add(num);
    }
    System.out.println("Count of distinct elements: "+set.size());

    HashMap<Integer,Integer>map=new HashMap<>();
    for(int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(int key:map.keySet()){
        if(map.get(key)>1){
            System.out.println("Duplicate elements: "+key);
        }
    }

}

}
