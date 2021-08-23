package section7_DesignPatterns.section66_adapter;

interface ISpeakFrench{
	public void speakFrench();
}

class FrenchPerson implements ISpeakFrench{
	@Override
	public void speakFrench() {
		System.out.println("Speaking French!");
	}
}

interface ISpeakEnglish{
	public void speakEnglish();
}

class EnglishPerson implements ISpeakEnglish{
	@Override
	public void speakEnglish() {
		System.out.println("Speaking French!");		
	}
}

class FrenchToEnglishAdapter implements ISpeakEnglish{
	private ISpeakFrench french;
	public FrenchToEnglishAdapter(ISpeakFrench french) {
		this.french = french;
	}
	
	@Override
	public void speakEnglish() {
		this.french.speakFrench();
		
		// Most of the people miss this conversion step while explaning this pattern
		System.out.println("Converting into the Brain...");
		System.out.println("Put it out with English");
		
	}
}


public class AdapterDemo {
	public static void main(String[] args) {
		 FrenchToEnglishAdapter adapter = new FrenchToEnglishAdapter(new FrenchPerson());
		 adapter.speakEnglish();
	}
}
