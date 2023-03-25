import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Iterator;

public class TargetSelf_checkout {
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();  // Create an ArrayList object
		Iterator<String> i = items.iterator();
		System.out.println("You have logged in");
		System.out.println("***We are giving an EXTRA item for every time you buy online!***\n");
		System.out.println("Searching for: Pencil");
		System.out.println("Adding (((8 + 1) + 1) + 1) Pencil to basket\n");
		for (int i0 = 0; i0 <  (((8 + 1) + 1) + 1); i0++) {
			items.add("Pencil");
		}
		System.out.println("Removing Pencil from basket");
		i = items.iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
			if (str.equals("Pencil")) {
				 i.remove();
			}
		}	
		
		System.out.println("Searching for: Wrapper");
		System.out.println("Adding ((6 + 1) + 1) Wrapper to basket\n");
		for (int i0 = 0; i0 <  ((6 + 1) + 1); i0++) {
			items.add("Wrapper");
		}
		
		System.out.println("Searching for: Nappies");
		System.out.println("Adding ((14 + 1) + 1) Nappies to basket\n");
		for (int i0 = 0; i0 <  ((14 + 1) + 1); i0++) {
			items.add("Nappies");
		}
		
		System.out.println("Searching for: Chocolate");
		System.out.println("Adding ((2 + 1) + 1) Chocolate to basket\n");
		for (int i0 = 0; i0 <  ((2 + 1) + 1); i0++) {
			items.add("Chocolate");
		}
		System.out.println("Removing Chocolate from basket");
		i = items.iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
			if (str.equals("Chocolate")) {
				 i.remove();
			}
		}	
		System.out.println("Mode of delivery is next_day_delivery ");
		System.out.println("Confirming order"); 
		System.out.println("Checking out of web store\n");
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
