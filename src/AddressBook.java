import java.util.*;


public class AddressBook {
	
	ArrayList<BuddyInfo> collection = new ArrayList<BuddyInfo>();
	
	public static void main(String[] args) {
		

	}

	public void addBuddy(BuddyInfo buddy) {
		collection.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy) {
		collection.remove(buddy);
	}
}
