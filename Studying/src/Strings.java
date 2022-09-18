public class Strings {

	public static void main(String[] args) {
		
	    String message = "Today, weather is nice.";
		System.out.println(message);
		
	  /*System.out.println("Number of element : " + message.length());
		System.out.println("5th element : " + message.charAt(4));
		System.out.println(message.concat(" Awesome!"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
		
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		
		System.out.println(characters);
		System.out.println(message.indexOf("ea"));
		System.out.println(message.lastIndexOf("i"));*/
		
		String newMessage = message.replace(' ','-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for(String word : message.split(" ")) {
			System.out.println(word);
		}
	}
}