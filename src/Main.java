
public class Main  implements Dog, Cat{

	public static void main(String[] args) {
		Main main = new Main();
		main.cring();
		main.own();
		main.two();

	}

	@Override
	public void two() {
		System.out.println("two");
		
		
	}

	@Override
	public void cring() {
		System.out.println("¾ß¿Ë");
		
		
	}

	@Override
	public void own() {
		System.out.println("own");
		
		
	}

}
