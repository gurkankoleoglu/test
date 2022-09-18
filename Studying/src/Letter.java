public class Letter {

	public static void main(String[] args) {
		
		char letter = 'E';
		
		switch(letter) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Hard letter");
				break;
			default:
				System.out.println("Thin letter.");
		}
	}
}
