
public class Driver {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Car c = new Car();
		
		System.out.println(v);
		System.out.println(c);
		
		Vehicle v2 = new Car(); //mixing constructors
		//has to pass is-a relationship right to left
		// cannot work other way around
		//Parent-Class name = new Sub-Class();
		
		Truck t = new Truck();
		System.out.println(t);
		

	}

}


class Truck extends Car{
	
	public Truck() {
		motor = "V8";
	}
	
	public String toString() {
		return "I am a truck";
	}
}


//anything public or protected in vehicle is inherited by Car
class Car extends Vehicle{ //is-a relationship (a car is-a vehicle)
	
	public Car() {
		super(); //super keyword invokes parent constructor (vehicle constructor)
	}
	//keyword super.METHOD can invoke parent methods from super class / parent class
	public String toString() {
		return super.toString() + "I am a car";
	}
}


class Yacht extends Boat {
	
	public Yacht() {
		super();
	}
	
	public String toString() {
		return "I am a yacht";
	}
}


class Boat extends Vehicle{
	
	public Boat() {
		super();
		numWheels = 0;
	}
	
	public String toString() {
		return "I am a boat";
	}
}


class Vehicle{
	//properties of a vehicle
	protected int numWheels;  //protected changes visibility to all related classes (sub-classes / child classes)
	protected String motor;
	protected String color;
	protected String model;
	
	//default constructor
	public Vehicle() {
		numWheels = 4;
		motor = "4-cylinder";
		color = "red";
		model = "generic";
	}
	
	public String toString() {
		return "I am a vehicle";
	}
	
	
	
	public int getNumWheels() {
		return numWheels;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
