import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;

public class TargetSelf_checkout {
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();  // Create an ArrayList object
		System.out.println("You have entered the store");
		System.out.println("***We are giving away EXTRA items for your purchases for using the selfcheckout!***\n");
		System.out.println("Self Checkout Scanner aquired");
		System.out.println("Move Forward (13)");
		System.out.println("Picked up: (2 + 1) Water");
		System.out.println("Dropping Water\n");
		System.out.println("Picked up: (4 + 1) Laptop");
		System.out.println("Adding Laptop in basket\n");
		for(int i=0; i < (4 + 1); i++) {
			items.add("Laptop");
		}
		
		System.out.println("Picked up: (5 + 1) Tea");
		System.out.println("Adding Tea in basket\n");
		for(int i=0; i < (5 + 1); i++) {
			items.add("Tea");
		}
		
		
		for (int i0 = 0; i0 < 7; i0++) {
			System.out.println("Move Forward (8)");
			System.out.println("Picked up: (3 + 1) Ipad");
			System.out.println("Dropping Ipad\n");
		}
		
		System.out.println("Picked up: (1 + 1) Mango");
		System.out.println("Adding Mango in basket\n");
		for(int i=0; i < (1 + 1); i++) {
			items.add("Mango");
		}
		
		System.out.println("Picked up: (9 + 1) Coffee");
		System.out.println("Dropping Coffee\n");
	}
}
