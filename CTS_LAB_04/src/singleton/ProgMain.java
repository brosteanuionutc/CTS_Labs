package singleton;

public class ProgMain {

	public static void main(String[] args) {

		Database db1=Database.getInstance();	//creates the instance
		Database db2=Database.getInstance(); //checks if instance is null (no)-> just returns the instance

	}

}
