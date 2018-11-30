import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Smallestinteger {
	public static void main(String[] args){
		
		int [] D = {1,3,6,4,1,2}; 
		int [] B = {1,2,3};
		int [] C = {4,-1, -3};
		
		//prints memory location
		//System.out.println(D);
		
		solution(D);
		solution(C);
		solution(B);
	}
	
	public static int solution(int[] A) {
			// write your code in Java SE 8
			int x=0;
			int N=1;
			
			//Scanner inputDevice= new Scanner(System.in);
		   // A = {1, 3, 6, 4, 1, 2};
		   
		  // System.out.println("What's the length of your array?");
		  // N = inputDevice.nextInt();
		  // A= new int [N];
		   Arrays.sort(A); 
		   
		   int [] positiveA= new int [A.length];
		   
		   for(int i=0; i<A.length; i++) {
				//System.out.println("What's the "+  (A[i]+1) +" number?" );
				//A[i] = inputDevice.nextInt();
				
			   if(A[i]>0){
					positiveA[i]=A[i];
					//System.out.println(A[i]);
					//System.out.println(positiveA[i]);
			   }
		   }
		   for(int number:positiveA) {
				System.out.println("Positive array numbers: "+ number);
				
		   }
			for(int i=0; i<positiveA.length-1;i++){
				
				if (positiveA[i]<=positiveA[i+1]){
					if(!((positiveA[i+1]-positiveA[i])==1 || (positiveA[i+1]-positiveA[i])==0)){
						x=positiveA[i]+1;
						System.out.println("The smallest missing integer is "+ x);
						
					}
					
					//	System.out.println("There is no smallest missing integer.");
						//continue;
					//}
			
				}else if (((positiveA[i]<positiveA[i+1])&&((positiveA[i+1]-positiveA[i])==1))){
					System.out.println("There is no smallest missing integer.");
					
				}
			}
		   
		   // for(int number:A) {
			   
			    //foreach loop
		   // }
		   
			
			
			return x;
	}
	
}

