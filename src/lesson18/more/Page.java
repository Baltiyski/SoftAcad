package lesson18.more;

public class Page {
	private String title;
	private String text;
	
	public Page(){
		
	}
	
	public Page(String title, String text) {
		this.title = title;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return title + " - " + text;
	}
	
}
