public class prime1{ 
  
    // Method to compute the prime number 
    // Time Complexity is O(sqrt(N)) 
    static boolean checkPrime(int numberToCheck) 
    { 
        if(numberToCheck == 1) { 
            return false; 
        } 
        for (int i = 2; i*i <= numberToCheck; i++) { 
            if (numberToCheck % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Method to iterate the loop from l to r 
    // If prime number detects, sum the value 
    static int primeSum(int l, int r) 
    { 
        int sum = 0; 
        for (int i = r; i >= l; i--) { 
  
            // Check for prime 
            boolean isPrime = checkPrime(i); 
            if (isPrime) { 
  
                // Sum the prime number 
                sum = sum + i; 
            } 
        } 
        return sum; 
    } 
    // Time Complexity is O(r x sqrt(N)) 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int l = 4, r = 13; 
  
        // Call the method with l and r 
        System.out.println(primeSum(l, r)); 
    } 
} 