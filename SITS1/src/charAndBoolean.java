
public class charAndBoolean {

	public static void main(String[] args) {
		// width of 16 (2 bytes)and how to unicode
		char myChar = '\u00A9';
		System.out.println("Unicode output was " + myChar);
		
		boolean myBoolean = false;
		boolean isMale = true;
		
		// 1. Find the code for the registered symbol on the same line as the copy right symbol.
		// 2. Create a variable of type char,and assign it to the unicode value for that symbol
		// 3. Display it on the screen.
		
		char registeredSymbol = '\u00AE';
		System.out.println("registeredSymbol = " + registeredSymbol); 
		
		
		
		

	}

}
