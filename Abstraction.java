package My_Access2;

public abstract class Abstraction {
	int x, y;
	
	//here the abstract class constructor is called everytime creating a new child class object
	void moveTo(int newX, int newY) { //normal method
		System.out.println(x + " " +y);
	}
	
	abstract void draw();
	abstract void resize();  //abstract method, no need to implement within Base class,
	                         // but in child class             
   
	//abstract class have to at least one abstract method
}
