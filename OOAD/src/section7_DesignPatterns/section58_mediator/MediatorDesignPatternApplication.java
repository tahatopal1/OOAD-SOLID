package section7_DesignPatterns.section58_mediator;

import java.util.ArrayList;
import java.util.List;

abstract class User{
	
	protected Mediator mediator;
	protected String name;
	
	public User(Mediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
	
}

class UserImpl extends User{

	public UserImpl(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + ": Sending message: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + ": Receiving message: " + message);
	}
	
}

interface Mediator{
	public void sendMessage(String message, User user);
	public void registerUser(User user);
}

class MediatorImpl implements Mediator{

	private List<User> users;
	
	public MediatorImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User u: this.users) {
			if (u != user) {
				u.receive(message);
			}
		}
	}

	@Override
	public void registerUser(User user) {
		this.users.add(user);
	}
	
}

public class MediatorDesignPatternApplication {
	public static void main(String[] args) {
		Mediator mediator = new MediatorImpl();
		
		User shiva  = new UserImpl(mediator, "Shiva");
		User vishnu = new UserImpl(mediator, "Vishnu");
		User john   = new UserImpl(mediator, "John");
		User rohn   = new UserImpl(mediator, "Rohn");
		
		// Shiva and vishnu are registered each other
		mediator.registerUser(shiva);
		mediator.registerUser(vishnu);
		
		shiva.send("Hi Vishnu");
		
		// All users are registered each other
		mediator.registerUser(rohn);
		mediator.registerUser(john);
		
		System.out.println("After all folks registered...");
		vishnu.send("Hello all!");
		
		
		
		
	}
}
