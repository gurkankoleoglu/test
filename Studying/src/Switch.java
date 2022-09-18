public class Switch {

	public static void main(String[] args) {
		
		char grade = 'C';
		
		switch (grade) {
			case 'A':
				System.out.println("Perfect, You passed.");
				break;
			case 'B':
				System.out.println("Good, You passed.");
				break;
			case 'C':
				System.out.println("You passed.");
				break;
			case 'D':
				System.out.println("Not bad.");
				break;
			case 'F':
				System.out.println("You failed.");
				break;
			default:
				System.out.println("Enter again.");
					
		}
	}

}
