public class PerfectNumber {

	public static void main(String[] args) {
		
		int num = 5, total = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				total += i;
			}
		}
		
		if(total == num) {
			System.out.println("Perfect number.");
		} else {
			System.out.println("Not perfect number.");
		}
	}

}
