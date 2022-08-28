/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {
	static double divide(double numOne, double numTwo) {
	double  result = (double)numOne/numTwo;
	return result;
	}
	
	static int divide(int numOne, int numTwo) {
		int  result = numOne/numTwo;
		return result;
		}
	
	static boolean isDivisibleBy7(int numOne) {
		if( numOne < 0 )
            return isDivisibleBy7( -numOne );
        if( numOne %7 ==0)
            return true;
        return false;
	}
	
	 public static String main(String args) {
	        return "Overloaded main method was passed \"" +args+"\".";
	       
	    }
	 
	 public static int findMin(int numOne,int numTwo,int numThree) {
		 int result = numOne;
		 if (numOne <= numTwo && numOne <= numThree) {
			 result = numOne;
		 } else if (numTwo <= numThree && numTwo <= numOne) {
			 result = numTwo;
		 } else {
			 result = numThree;
		 }
		 return result;
	 }
	 
	 public static int findMin(int[] array) {
		 int result = array[0];
		 for(int numTest: array) {
			 if(result >numTest)
				 result = numTest;
		 }
		 return result;
	 }
	 
	 public static double average(int[] array) {
		 int result = 0;
		 int count = 0;
		 for(int i = 0; i< array.length;i++) {
				 result +=array[i];
				 count++;
		 }
		 return (double)result/count;
	 }
	 
	 public static String[] toLowerCase(String[] array) {
		 for(int i = 0; i < array.length;i++) {
			 array[i] = array[i].toLowerCase();
		 }
		 return array;
	 }
	 
	 public static String[] toLowerCaseCopy(String[] array) {
		 String[] result= new String[array.length];
		 if(array.length==1) {
			 result[0] = array[0].toLowerCase();
			 return result;
		 }
		 for(int i = 0; i < array.length;i++) {
			 result[i] = array[i].toLowerCase();
		 }
		 return result;
	 }
	 
	 public static int[] removeDuplicates(int[] array) {
		 
		 int[] result = array;
		 int count = array.length;
		 int check= array[0];
		 //1
		 if(count==1)
			 return array;
		 
		 if(count == 2) {
			 if (array[0]==array[1]) {
				 array[0] = 0;
				 array[1] = 0;
				 return array;
			 }
		 }
		
			 //3+
		
			 for (int i= 0; i < count-1;i++) {
				 if(array[i]== array[i+1]) {
					 check = array[i];
				 }
			for (int j= 0; j < count;j++) {
				 if (check == array[j]) {
							 array[j]=0;
				 }
			
			}
			}
				
	 
	        return array;
	    }		 
	 
	 
	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
		int[] testOne= new int[] {1,2,1,4,1,1,2,3};
		
		for(int tem: removeDuplicates(testOne)) {
			//System.out.println(tem);
		}
		int[] testTwo= new int[] {38, 451, 101, 451, 42, 451, 101, -1};
		for(int tem: removeDuplicates(testTwo)) {
			System.out.println(tem);
		}
	}

}
