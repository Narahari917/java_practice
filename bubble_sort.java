import java.util.Scanner;
public class bubble_sort {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Bubble_sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    public static void Bubble_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                int temp=0;
                    if(arr[j]<arr[j-1]){
                        temp = arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }

            }
        }
    }
    
}
