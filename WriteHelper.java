package TEST;

import java.util.ArrayList;

public class WriteHelper {
	public void writeList() {
		try {
			ArrayList<Integer> list = new ArrayList<>(10);
			list.add(10);
			
			System.out.println("Entering try statement ");
			Integer a = list.get(1); //index 1 position
			System.out.println("accessing the first elemnent: " + a); //will run when no exception
			
		} catch(IndexOutOfBoundsException e) {
			System.err.println("Caught indexoutofbound exception:" + e.getMessage());
			
		} finally {
			System.out.println("This will always be executed");
		}
	}

}
