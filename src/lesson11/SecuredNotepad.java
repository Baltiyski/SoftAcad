package lesson11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad{
	private String password;
	
	public SecuredNotepad(int pagesCount, String password) {
		super(pagesCount);
		this.password = password;
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
}
