package abstraction;

public class DeerDemo extends AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DeerDemo obj=new DeerDemo();
obj.eat();
obj.drink();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Deer eats Non veg");
	}

}
