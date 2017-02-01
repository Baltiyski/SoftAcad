package hw11;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
	private boolean isOn;
	
	protected ElectronicSecuredNotepad(int pagesCount, String password) {
		super(pagesCount, password);
	}
	
	public void start(){
		isOn = true;
	}
	
	public void stop() {
		isOn = false;
	}
	
	public boolean isStarted() {
		return isOn;
	}
	
	@Override
	public void writeOnPage(int pageNumber, String text) {
		if(isOn) {
			super.writeOnPage(pageNumber, text);
		} else {
			System.out.println("The device is not switched on");
		}
	}
	
	@Override
	public void delete(int pageNumber) {
		if(isOn) {
			super.delete(pageNumber);
		} else {
			System.out.println("The device is not switched on");
		}
	}
}
