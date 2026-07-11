import java.util.Scanner;

public class parenthesis {
    static void generate(String s,int open,int close,int n){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n){
            generate(s+"(",open+1,close,n);
        }
        if(close<open){
            generate(s+")",open,close+1,n);

        }   
     }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.hasNextInt() ? sc.nextInt() : 3;
        sc.close();
        generate("",0,0,n);
     }
    
}
