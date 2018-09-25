
public class BuddyInfo {
	
	private String name;
	private String address;
	private int phoneNumber;

	public static void main(String[] args) {
	BuddyInfo buddy = new BuddyInfo();
	
	buddy.setName("Homer");		
	System.out.println("Hello, " + buddy.getName() + ".");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
