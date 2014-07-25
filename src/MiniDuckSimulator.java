public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("\n");
		Duck rubberDucky = new RubberDucky();
		rubberDucky.display();
		rubberDucky.performQuack();
		rubberDucky.performFly(); // Comment
	}
}
