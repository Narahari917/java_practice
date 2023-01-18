import java.util.*;
public class prog1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        calculate(array);
    }
  
    public static int binaryToDec(int n){
        int rem=0;
        int ans=0;
        while(n>0){
            rem=n%2;
            ans=ans*10+rem;
            n/=2;
        }
        return ans;
    }
    public static void calculate(int [] array){
        int max=0,result=0;
        for(int i=0;i<array.length;i++){
            int temp=binaryToDec(array[i]);
            if(max<=temp){
                max=temp;
                result=array[i];
            }
        }
        System.out.println(result);
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

} 
