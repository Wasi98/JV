package TEST;

public class Static_Class {
	
	static int count = 0; //instance variable
	
	Static_Class(){
		count++; //incremented with constructor
		System.out.println(count);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Static_Class ob1 = new Static_Class();
		Static_Class ob2 = new Static_Class();
		Static_Class ob3 = new Static_Class();
		System.out.println(count); //can be accessed without creating objects
	}

}
