import java.util.*;
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList <Integer> res=new ArrayList<Integer>();
        int start=0;
        int end=0;
        int sum=0;
        while(start<=end && end<n){
            if(arr[start]>s){
                start++;
                end++;
            }
            if(sum==s){
                res.add(start+1);
                res.add(end);
                break;
            }else if(sum<s){
                sum+=arr[end];
                end++;
            }else{
                sum-=arr[start];
                start++;
            }
        }
        if(res.isEmpty()){
            res.add(-1);
            res.add(-1);
        }
        return res;
    }
}