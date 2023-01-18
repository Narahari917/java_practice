import java.util.*;
public class cyclic_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            while(i+1!=arr[i]){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1]=temp;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
