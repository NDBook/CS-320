package contact;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	private static final int CONTACTIDLENGTH = 10;
	private static final byte FIRSTNAMELENGTH = 10;
	private static final byte LASTNAMELENGTH = 10;
	private static final byte PHONELENGTH = 10;
	private static final byte ADDRESSLENGTH = 30;
	private static final String INITIALIZER = "Start";
	
	Contact(){
		this.contactID = INITIALIZER;
		this.firstName = INITIALIZER;
		this.lastName = INITIALIZER;
		this.phone = INITIALIZER;
		this.address = INITIALIZER;
	}
	Contact(String contactID){
		updateContactID(contactID);
		this.firstName = INITIALIZER;
		this.lastName = INITIALIZER;
		this.phone = INITIALIZER;
		this.address = INITIALIZER;
	}
	Contact (String contactId, String firstName){
		updateContactID(contactID);
		updatefirstName(firstName);
		this.lastName = INITIALIZER;
		this.phone = INITIALIZER;
		this.address = INITIALIZER;
	}
	Contact(String contactId, String firstName, String lastName){
		updateContactID(contactID);
		updatefirstName(firstName);
		updatelastName(lastName);
		this.phone = INITIALIZER;
		this.address = INITIALIZER;
	}
	Contact(String contactId, String firstName, String lastName, String phone){
		updateContactID(contactID);
		updatefirstName(firstName);
		updatelastName(lastName);
		updatePhone(phone);
		this.address = INITIALIZER;
	}
	Contact(String contactId, String firstName, String lastName, String phone, String address){
		updateContactID(contactID);
		updateContactID(firstName);
		updateContactID(lastName);
		updateContactID(phone);
		updateContactID(address);
	}	
	protected final String getcontactID() {return contactID; }
	protected final String getfirstName() {return firstName; }
	protected final String getlastName() {return lastName; }
	protected final String getphone() {return phone; }
	protected final String getaddress() {return address; }
	
	protected void updatefirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("empty first name!");
		}
		else if (firstName.length() > FIRSTNAMELENGTH) {
			throw new IllegalArgumentException("first name cant be longer than " + FIRSTNAMELENGTH);
		}
		else { this.firstName = firstName;
		}
	}
	protected void updatelastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("empty last name!");
		}
		else if (lastName.length() > LASTNAMELENGTH) {
			throw new IllegalArgumentException("last name cant be longer than " + FIRSTNAMELENGTH);
		}
		else { this.lastName = lastName;}
	}
	protected void updatePhone(String phone) {
		String regex = "0-9";
		if (phone == null) {
			throw new IllegalArgumentException("Phone number cant be empty!");
		}
		else if (phone.length() != PHONELENGTH) {
			throw new IllegalArgumentException(
					"Phone number to long!");
		}
		else if (!phone.matches(regex)) {
			throw new IllegalArgumentException(
					"Only numbers allowed!");
		}
		else {this.phone = phone;}
	}
	protected void updateAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Need Address!");
		}
		else if (address.length() > ADDRESSLENGTH) {
			throw new IllegalArgumentException("Address is to long!");
		}
		else {this.address = address;}
	}
	protected void updateContactID(String contactID) {
		if (contactID == null) {
			throw new IllegalArgumentException("need contact ID!");
		}
		else if (contactID.length() > CONTACTIDLENGTH) {
			throw new IllegalArgumentException("Contact ID is too long!");
		}
		else {this.contactID = contactID;}
	}
}