public class PrimeNumber {

	public static void main(String[] args) {

		int num = 25;
	    @SuppressWarnings("unused")
		int remainder = num % 2;
		boolean isPrime = true;
		
	  //System.out.println(remainder);
		
		if(num == 1) {
			System.out.println("Not Prime number.");
			return;
		}
		
		if(num < 1) {
			System.out.println("Undefined.");
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime number.");
		} else {
			System.out.println("Not Prime number.");
		}
	}
}
