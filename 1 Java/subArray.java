class SubarraySum { 
	/* Returns true if the there is a 
subarray of arr[] with a sum equal to 
	'sum' otherwise returns false. 
Also, prints the result */
	int subArraySum(int arr[], int n, int sum) 
	{ 
		int curr_sum, i, j; 

		// Pick a starting point 
		for (i = 0; i < n; i++) { 
			curr_sum = arr[i]; 

			// try all subarrays starting with 'i' 
			for (j = i + 1; j <= n; j++) { 
				if (curr_sum == sum) { 
					int p = j - 1; 
					System.out.println( 
						"Sum found between indexes " + i 
						+ " and " + p); 
					return 1; 
				} 
				if (curr_sum > sum || j == n) 
					break; 
				curr_sum = curr_sum + arr[j]; 
			} 
		} 

		System.out.println("No subarray found"); 
		return 0; 
	} 

	public static void main(String[] args) 
	{ 
		SubarraySum arraysum = new SubarraySum(); 
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
		int n = arr.length; 
		int sum = 23; 
		arraysum.subArraySum(arr, n, sum); 
	} 
} 

// This code has been contributed by Mayank Jaiswal(mayank_24) 
