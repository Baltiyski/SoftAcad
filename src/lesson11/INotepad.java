package lesson11;

public interface INotepad {
	void writeOnPage(int pageNumber, String text);
	void writeOverPage(int pageNumber, String text);
	void delete(int pageNumber);
	void printAllPages();
}
