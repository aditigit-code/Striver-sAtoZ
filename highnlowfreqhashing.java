import java.util.*;
public class highnlowfreqhashing {
    public static void main(String args[])
{
    int arr[]={1,2,3,2,1};
    HashMap <Integer,Integer>map = new HashMap<>();
    for(int num:arr){
        map.put(num, map.getOrDefault(num, 0) + 1);

    }
    int maxf=Integer.MIN_VALUE;
    int minf=Integer.MAX_VALUE;
    int maxele=-1;
    int minele=-1;
    for(int key:map.keySet()){
        if(map.get(key) > maxf){
            maxf=map.get(key);
            maxele=key;
        }
        if(map.get(key) < minf){
            minf = map.get(key);
            minele = key;
        }
    }System.out.println("Highest= "+maxele);
    System.out.println("Lowest :"+minele);
}}
