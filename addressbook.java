import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
	static String firstname;
	static String lastname;
	static String address;
	static String city;
	static String state;
	static String zip;
	static String phonenumber;
	static String email;
	public static void addContact()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your firstname");
		firstname=obj.nextLine();
		System.out.println("Enter your lastname");
		lastname=obj.nextLine();
		System.out.println("Enter your address");
		address=obj.nextLine();
		System.out.println("Enter your city");
		city=obj.nextLine();
		System.out.println("Enter your state");
		state=obj.nextLine();
		System.out.println("Enter your zip");
		zip=obj.nextLine();
		System.out.println("Enter your phonenumber");
		phonenumber=obj.nextLine();
		System.out.println("Enter your email");
		email=obj.nextLine();
		contact.add(new Data(firstname, lastname, address, city, state, zip, phonenumber, email));
	}
	public static void displayContact() {
    	if(contact.isEmpty())
    		System.out.println("The list is empty");
    	for(Data a : contact) {
    		System.out.println(a);
    	}
    }
	private static List<Data> contact = new ArrayList<Data>();
	private static void deleteContactByFirstName(String firstName) {
		Iterator<Data> iterator = contact.iterator();
		while(iterator.hasNext()) {
			Data temp = iterator.next();
			if (temp.getFirstname().equalsIgnoreCase(firstName)) {
				iterator.remove();
			}
		}
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Address Book Program");
		int num;
		do
		{
	        System.out.println(" 1. Add Contact");
	        System.out.println(" 2. Display Contact");
	        System.out.println(" 3. Delete Contact");
	        System.out.println("Enter number (1,2,3):");
	        num=sc.nextInt();
	        switch(num)
	        {
	        case 1:
	        	addContact();
	        	break;
	        case 2:
	        	displayContact();
	        	break;
	        case 3:
	        	System.out.println("Enter first name of the contact which you want to delete");
	        	String name=sc.next();
	        	deleteContactByFirstName(name);
	        	break;
	        default:
	        	System.out.println("Invalid Input");
	        }
	        System.out.println("Do you want to continue (1.Continue\n 0.Exit)");
            num=sc.nextInt();
		} while (num != 0);
    }
}
class Data
{
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phonenumber;
	private String email;
	public Data(String firstname, String lastname, String address, String city, String state, String zip,
			String phonenumber, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Data [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber + ", email=" + email + "]";
	}
}
