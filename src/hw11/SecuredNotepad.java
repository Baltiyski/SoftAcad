package hw11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad{
	public static final int MIN_PASSWORD_LENGTH = 5;
	
	private String password;
	
	protected SecuredNotepad(int pagesCount, String password) {
		super(pagesCount);
		if(isStrongPassword(password)) {
			this.password = password;
		}
	}
	
	public static SecuredNotepad createSecuredNotepad(int pagesCount, String password) {
		if(isStrongPassword(password)) {
			return new SecuredNotepad(pagesCount, password);
		}
		System.out.println("The password is not strong!");
		return null;
	}
	
	@Override
	public void writeOnPage(int pageNumber, String text) {
		if(checkPassword()) {
			super.writeOnPage(pageNumber, text);
		}
	}
	
	public void writeOverPage(int pageNumber, String text) {
		if(checkPassword()) {
			super.writeOverPage(pageNumber, text);
		}
	}
	
	@Override
	public void delete(int pageNumber) {
		if(checkPassword()) {
			super.delete(pageNumber);
		}
	}
	
	private boolean checkPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pass");
		String enteredPassword = sc.nextLine();
		if(enteredPassword.equals(password)) {
			return true;
		}
		System.out.println("Wrong password!");
		return false;
	}
	
	private static boolean isStrongPassword(String pass) {
		if(pass.length() < MIN_PASSWORD_LENGTH) {
			return false;
		}
		
		if(!checkForCharacter(pass, '0', '9')) {
			return false;
		}
		
		if(!checkForCharacter(pass, 'a', 'z')) {
			return false;
		}
		
		if(!checkForCharacter(pass, 'A', 'Z')) {
			return false;
		}
		
		return true;
	}
	
	private static boolean checkForCharacter(String text, char c1, char c2) {
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) >= c1 && text.charAt(i) <= c2) {
				return true;
			}
		}
		return false;
	}
}
