import self_checkout_experience.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestSelf_checkout {
	public static void main(String[] args) {
		SelfCheckoutFrame scf = new SelfCheckoutFrame();
		
		Self_checkout sc = new Self_checkout(scf) {
			@Override
			public void run() {
				ArrayList<String> items = new ArrayList<String>();  // Create an ArrayList object
				System.out.println("You have entered the store");
				System.out.println("Self Checkout Scanner aquired");
				System.out.println("Move Forward (9)");
				System.out.println("Picked up: 55 Watah");
				System.out.println("Dropping watah");
				System.out.println("Picked up: 5 Car");
				System.out.println("Adding car in basket");
				for(int i=0; i <= 5; i++) {
					items.add("car")
				}
				
				System.out.println("Picked up: 5 Tea");
				System.out.println("Adding tea in basket");
				for(int i=0; i <= 5; i++) {
					items.add("tea")
				}
				
				
				for (int i0 = 0; i0 < 7; i0++) {
					System.out.println("Move Forward (8)");
					System.out.println("Picked up: 5 Bread");
					System.out.println("Dropping bread");
				}
				
				System.out.println("Picked up: 5 Mango");
				System.out.println("Adding mango in basket");
				for(int i=0; i <= 5; i++) {
					items.add("mango")
				}
				System.out.println("Going to checkout");
				System.out.println("Load self scanner onto till");
				System.out.println("Checking out of store");
				String str = String.join(",", items);
				System.out.println("Items purchased: " + str);
				System.out.println("Number of items purchased: " + items.size());
				if(items.size() >= 20){
					System.out.println("You have purchased over 20 items, you have earnt a voucher for the next time you use the self checkout!");  //condition that we give voucher
				else {
					System.out.println("Next time you shop with us make sure to purchase 20 items or more when using the self checkout to earn a free voucher off your next self checkout order");  //condition that we don't give voucher
				}
			}
		};
		
		sc.run();
	}
}
