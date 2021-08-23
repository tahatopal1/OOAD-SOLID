package section7_DesignPatterns.section60_observer;

public class EndUser implements Observer {

	private String name;
	
	public EndUser(String name, SubjectLibrary subjectlibrary) {
		this.name = name;
		subjectlibrary.subscribeObserver(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(String avail) {
		System.out.println("Hello " + this.name + "We are glad to notify you that your book is now " + avail);
	}

}
