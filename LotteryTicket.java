package Day5;

public class LotteryTicket {
	public static void main( String[] args ){
	int numA = 1;
	int numB = 2;
	int numC = 1;
	System.out.println(result(numA,numB,numC));
}
	public static int result(int a, int b , int c) {
		int result;
	
	 if  ( a == b && b==c){
			return result = 20;
			
	 }
	 if ( a ==b ||a ==c || c==b) {
		return result = 10;
		
	
		
	} else {
	return result =0;
	}
		
		
	}
	
	
	}