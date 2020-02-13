package Main;

public class Main {
	public static void main(String[] args) {
		
		// Task 1
		//printFun(3);
		
		// Task 2
		//System.out.println(fact(4));
		
		// Task 3
		//System.out.println(power(3, 5));
		
		// Task 4
		//int[] test = new int[] {1, 3, 4, 5};
		//System.out.println(findMax(test, 4));
		
		// Task 5
		//System.out.println(countKey("testhihitesthi", "hi"));
		
		// Task 6
		//System.out.println(XY("testxxhehyy"));
		
		// Task 7
		System.out.println(removeX("testxxhehyy"));
	}

	// Task 1
	static void printFun(int test) {
		if (test < 1)
			return;
		else {
			System.out.printf("%d ", test);
			printFun(test-1);
			//System.out.printf("%d ", test);
			//return;
		}
	}

	// Task 2
	// fact(4) = 4 * 3 * 2 * 1
	static int fact(int number) {
		if (number == 1)
			return number;
		else {
			return number * fact(number-1);
		}
	}
	
	// Task 3
	// power(base, n)
	// base ^ n = base * base^ n-1
	static int power(int base, int number) {
		if (number == 0)
			return 1;
		else {
			return base * power(base, number-1);
		}
		
	}
	
	// Task 4
	// 1, 3, 4, 5
	static int findMax(int[] arr, int size) {

		if (size == 1)
				return arr[0];
		else {
			return Math.max(arr[size-1], findMax(arr, size-1));
		}
		
	}

	// Task 5
	// count the number of lowercase "hi" inside a string with recursive
	// "testhihihihmmhi"
	static int countKey(String string, String key) {
		
		int count = 0;
		
		if (string.length() < 2)
			return count;
		
		else { 
			if (string.substring(0, 2).equals(key)) {
				count++;
				return 1 + countKey(string.substring(2), key);
			}
			return countKey(string.substring(1), key);
		}
	}
	
	// Task 6
	// Given a string, replace all lowercase "x" to lowercase "y"
	// abcdxfx => abcdyfy
	
	static String XY(String string) {
		if (string.length() < 1) {
			return string;
		}
		
		else {
			if (string.charAt(0) == 'x') 
				return 'y' + XY(string.substring(1));
			
			return string.charAt(0) + XY(string.substring(1));
		}

	}
	
	// Task 7
	// given a string, compute recursively a new string where all the x chars has been removed
	// abcdxfx => abcdf
	
	static String removeX(String string) {
		if (string.length() < 1) {
			return string;
		}
		else {
			if (string.charAt(0) == 'x')
				return removeX(string.substring(1));
			return string.charAt(0) + removeX(string.substring(1));
		}
	}
	
}
