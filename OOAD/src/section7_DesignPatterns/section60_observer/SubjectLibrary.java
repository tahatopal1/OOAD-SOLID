package section7_DesignPatterns.section60_observer;

public interface SubjectLibrary {
	
	public void subscribeObserver(Observer ob);
	
	public void unSubscribeObserver(Observer ob);
	
	public void notifyObserver();
	
}
