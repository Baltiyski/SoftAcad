package hw11;

public class Page {
	public static final String DEFAULT_TEXT = "";
	
	private String title;
	private String text;
	
	public Page() {
		title = DEFAULT_TEXT;
		text = DEFAULT_TEXT;
	}
	
	public Page(String title, String text) {
		this.title = title;
		this.text = text;
	}
	
	public void addText(String textToAdd) {
		text = text.concat(textToAdd);
	}
	
	public void deleteText() {
		text = DEFAULT_TEXT;
	}
	
	public String viewPage() {
		return title + "\n" + text;
	}
	
	public boolean searchWord(String word) {
		return text.contains(word);
	}
}
