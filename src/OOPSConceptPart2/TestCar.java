package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("*******************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("*******************");
		
		Car d = new BMW();    //Child class object can be referred by parent reference variable
		d.start();
		d.stop();
		d.refuel();
		d.engine();
		
		System.out.println("*******************");
		
		Vehicle v = new Vehicle();
		v.engine();
		System.out.println("-------------------------");
		Vehicle x = new Car();  //Child class object can be referred by parent reference variable
		x.engine();
		System.out.println("-------------------------");
		Vehicle y = new BMW();   //Child class object can be referred by parent reference variable
		y.engine();
		System.out.println("-------------------------");
		BMW z = (BMW)new Car(); // ClassCastException
		z.engine();

	}

}
