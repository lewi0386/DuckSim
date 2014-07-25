
public class RubberDucky extends Duck {

	public RubberDucky() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm all yellow and stuff.");
	}

}
