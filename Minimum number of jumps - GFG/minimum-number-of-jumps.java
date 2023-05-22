//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] nums){
        // your code here
        int jump=0;
        int maxReach=0;
        int current=0;
        if(nums.length<=1) return -1;
        if(nums[0]==0) return -1;
        for(int i=0;i<nums.length-1;i++){
            maxReach=Math.max(maxReach,nums[i]+i);
            if(i==current){
                current=maxReach;
                jump++;
            }
        }
        if(current>=nums.length-1) return jump;
        else return -1;
    }
}