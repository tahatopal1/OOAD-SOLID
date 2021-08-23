package section7_DesignPatterns.section55_command;

interface ICommandAC{
	// Command interface
	public void execute();
}

class AC{
	
	// Receiver class 
	
	public void turnOn() {
		System.out.println("Ac is on");
	}
	
	public void turnOff() {
		System.out.println("Ac is off");
	}
	
	public void decTemp() {
		System.out.println("Decreasing temprature by 1");
	}
	
	public void incTemp() {
		System.out.println("Increasing temprature by 1");
	}
	
}

class StartACCommand implements ICommandAC{
	
	// A concrete class
	
	AC ac;
	
	public StartACCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Turning on the AC");
		ac.turnOn();
	}
	
}

class StopACCommand implements ICommandAC{
	
	// A concrete class
	
	AC ac;
	
	public StopACCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Turning off the AC");
		ac.turnOff();
	}
	
}

class IncTempCommand implements ICommandAC{
	
	// A concrete class
	
	AC ac;
	
	public IncTempCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Increasing the temp");
		ac.incTemp();
	}
	
}

class DecTempCommand implements ICommandAC{
	
	// A concrete class
	
	AC ac;
	
	public DecTempCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		System.out.println("Decreasing the temp");
		ac.decTemp();
	}
	
}

class ACAutomationRemote{
	
	// Invoker class
	
	private ICommandAC command;
	
	public void setCommand(ICommandAC command) {
		this.command = command;
	}



	public void buttonPressed() {
		command.execute();
	}
	
}

public class CommandDesignPattern {

	public static void main(String[] args) {
		
		AC acRoomOne = new AC();
		AC acRoomTwo = new AC();
		
		ACAutomationRemote remote = new ACAutomationRemote();
		
		remote.setCommand(new StartACCommand(acRoomOne));
		remote.buttonPressed();
		
		remote.setCommand(new StartACCommand(acRoomTwo));
		remote.buttonPressed();
		
		remote.setCommand(new IncTempCommand(acRoomOne));
		remote.buttonPressed();
		
	}

}
