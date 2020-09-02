public class CarApp{
	public static void main(String[] args){
		new F1().run();
		new Truck().run();
	}
}

abstract class Car{
	String name;
	abstract void run();
}

class F1 extends Car{
	@Override
	void run(){
		System.out.println("ファーン");
	}
}

class Truck extends Car{
	@Override
	void run(){
		System.out.println("ゴおー");
	}
}
