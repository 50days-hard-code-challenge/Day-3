import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		 
		 // Corner case 
		 if(N==0){
			 return 0;
		 }
		 // Take a variable i to store the square root of given number N
		 int i = 1; 
		 while(i*i<=N){
			 i++;
		 }
		 return i-1;
	}
}


// Optmise Solution using Binary Search in O(logN)

import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
    
		 // corner cases 
		 if(N<=1){
			 return (int)N;
		 }
		 long start = 2; 
		 long end = N; 
		 while(start<end){
			 long mid = (start+(end-start)/2);
			 // if(mid*mid) is less than equal to N then start = mid+1
			 // else end = mid
			 if(mid*mid<=N){
				 start = mid + 1;
			 }else{
				 end = mid;
			 }
		 }
		 return (int)(start-1);
	}
}
