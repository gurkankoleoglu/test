public class FriendNumbers {

	public static void main(String[] args) {
		
		int num1 = 220, num2 = 284, sum1 = 0, sum2 = 0;
		
		for(int i = 1; i < num1; i++) {
			if(num1 % i == 0) {
				sum1 += i;
			}
		}
		
		for(int i = 1; i < num2; i++) {
			if(num2 % i == 0) {
				sum2 += i;
			}
		}
		
		if(num1 == sum2 && num2 == sum1) {
			System.out.println("Friend numbers.");
		} else {
			System.out.println("Not friend numbers.");
		}
	}
}
