import java.util.*;
public class recursions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
   static void print(int n){
    if(n>=0){
        System.out.print(n+" ");
        print(n-1);
    }
}
}
