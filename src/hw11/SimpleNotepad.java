package hw11;

public class SimpleNotepad implements INotepad{
	private Page[] pages;
	
	public SimpleNotepad(int pagesCount) {
		pages = new Page[pagesCount];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page("Page " + (i + 1), "");
		}
	}

	@Override
	public void writeOnPage(int pageNumber, String text) {
		if(isValidPage(pageNumber)) {
			pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void writeOverPage(int pageNumber, String text) {
		if(isValidPage(pageNumber)) {
			pages[pageNumber - 1].deleteText();
			pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void delete(int pageNumber) {
		if(isValidPage(pageNumber)) {
			pages[pageNumber - 1].deleteText();
		}
	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println(pages[i].viewPage());
		}
		
	}
	
	private boolean isValidPage(int pageNumber) {
		if(pageNumber > 0 && pageNumber <= pages.length) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}
}
