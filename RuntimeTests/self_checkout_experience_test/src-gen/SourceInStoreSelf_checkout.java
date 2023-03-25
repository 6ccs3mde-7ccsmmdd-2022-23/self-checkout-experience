import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Iterator;

public class SourceInStoreSelf_checkout {
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();  // Create an ArrayList object
		System.out.println("You have entered the store");
		System.out.println("***We are giving away EXTRA items for your purchases for using the selfcheckout!***\n");
		System.out.println("Self Checkout Scanner aquired");
		System.out.println("Move Forward (13)");
		System.out.println("Picked up: (5 + 1) Water");
		System.out.println("Dropping Water\n");
		System.out.println("Picked up: (4 + 1) Laptop");
		System.out.println("Adding Laptop in basket\n");
		for (int i0 = 0; i0 < (4 + 1); i0++) {
			items.add("Laptop");
		}
		
		System.out.println("Picked up: (3 + 1) Tea");
		System.out.println("Adding Tea in basket\n");
		for (int i0 = 0; i0 < (3 + 1); i0++) {
			items.add("Tea");
		}
		
		
		for (int i0 = 0; i0 < 3; i0++) {
			System.out.println("Move Forward (8)");
			System.out.println("Picked up: (1 + 1) Ipad");
			System.out.println("Dropping Ipad\n");
		}
		
		System.out.println("Picked up: (1 + 1) Mangos");
		System.out.println("Adding Mangos in basket\n");
		for (int i0 = 0; i0 < (1 + 1); i0++) {
			items.add("Mangos");
		}
		
		System.out.println("Picked up: (9 + 1) Coffee");
		System.out.println("Dropping Coffee\n");
		System.out.println("Going to checkout");
		System.out.println("Load self scanner onto till");
		System.out.println("Checking out of store\n");
		System.out.println("///////////////RECEIPT//////////////" );
		Map<Object, Long> counts =
				items.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		for(Map.Entry<Object, Long> entry : counts.entrySet()) {
			System.out.println("- " + entry.getKey() + " x" + entry.getValue());
		}
		System.out.println();
		System.out.println("Number of items purchased: " + items.size());
		if(items.size() >= 20){
			System.out.println();
			System.out.println("///////////////VOUCHER///////////////");
			System.out.println("//    You bought over 20 items!    //");
			System.out.println("//     You've earned a voucher     //");
			System.out.println("//    to spend on self-checkout    //");
			System.out.println("//     next time you shop here.    //");
			System.out.println("/////////////////////////////////////");
		}else {
			System.out.println("Next time you shop with us make sure to purchase 20 items or more when using the self checkout to earn a free voucher off your next self checkout order");  //condition that we don't give voucher
		}
	}
}
