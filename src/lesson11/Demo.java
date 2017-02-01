package lesson11;

public class Demo {
	public static void main(String[] args) {
//		SimpleNotepad np = new SimpleNotepad(100);
//		np.writeOnPage(2, "some text");
//		np.writeOnPage(2, "........");
//		
//		np.printAllPages();
		
		INotepad sn = new SecuredNotepad(30, "abc");
		sn.writeOnPage(1, "This is text on poge 1");
		sn.printAllPages();
	}
}
