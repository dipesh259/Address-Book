package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		static ArrayList<AddessBookData> contact = new ArrayList<>();

		public static void setData() {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String firstName, lastName, phoneNumber, email, address, city, state;
			int zipCode;
			System.out.println("----- Please fill below fields -----");
			System.out.print("Enter first name : ");
			firstName = sc.nextLine();
			System.out.print("Enter last name : ");
			lastName = sc.nextLine();
			System.out.print("Enter phone number : ");
			phoneNumber = sc.nextLine();
			System.out.print("Enter email : ");
			email = sc.nextLine();
			System.out.print("Enter address : ");
			address = sc.nextLine();
			System.out.print("Enter city : ");
			city = sc.nextLine();
			System.out.print("Enter state : ");
			state = sc.nextLine();
			System.out.print("Enter zip code : ");
			zipCode = sc.nextInt();

			contact.add(new AddessBookData(firstName, lastName, phoneNumber, email, address, city, state, zipCode));
		}
		
		public static void editData() {
			String editFirstName, editLastName, editPhoneNumber, editEmail, editAddress, editCity, editState;
			int editZipCode;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("You can edit contact by using name :");
			System.out.print("Enter the name : ");
			String name = sc.nextLine();
			
			 for (int i = 0; i < contact.size(); i++) {
				if (contact.get(i).getFirst_name().equalsIgnoreCase(name)) {
					System.out.println("Found : " + contact.get(i).getFirst_name());
					System.out.print("Enter first name : ");
		       		editFirstName = sc.nextLine();
		       		System.out.print("Enter last name : ");
		       		editLastName = sc.nextLine();
		       		System.out.print("Enter phone number : ");
		       		editPhoneNumber = sc.nextLine();
		       		System.out.print("Enter email : ");
		       		editEmail = sc.nextLine();
		       		System.out.print("Enter address : ");
		       		editAddress = sc.nextLine();
		       		System.out.print("Enter city : ");
		       		editCity = sc.nextLine();
		       		System.out.print("Enter state : ");
		       		editState = sc.nextLine();
		       		System.out.print("Enter zip code : ");
		       		editZipCode = sc.nextInt();
		       		contact.set(i,new AddessBookData(editFirstName, editLastName, editPhoneNumber, editEmail, editAddress, editCity, editState, editZipCode));
	        	}
			 }
		}
		
		public static void deleteData() {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("You can delete contact by using name :");
			System.out.print("Enter the name : ");
			String deleteName = sc.nextLine();
			
			 for (int i = 0; i < contact.size(); i++) {
	            if (contact.get(i).getFirst_name().equalsIgnoreCase(deleteName)) {
	                System.out.println("Found : " + contact.get(i).getFirst_name());
	                if(contact.remove(i) != null) {
	                	System.out.println("Deleted!");
	                }else {
	                	System.out.println("Error at deleteing.");
	                }
	            }
	        }
		}

		public static void showAllContacts() {
			System.out.println("");
			for (int i = 0; i < contact.size(); i++) {
				System.out.println("Contact of " + contact.get(i).getFirst_name() + " is " + contact.get(i).getPhoneNumber() + " and mail is " + contact.get(i).getEmail());
			}
		}

		public static void repeat() {
			@SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
			System.out.println("");
			System.out.println("press 1 to create contact :");
			System.out.println("press 2 to edit contact :");
			System.out.println("press 3 to delete contact :");
			System.out.println("press 0 to exit program :");
			int res = sc1.nextInt();
			switch (res) {
			case 1:
				setData();
				repeat();
				break;
			case 2:
				editData();
				repeat();
				break;
			case 3:
				deleteData();
				repeat();
				break;
			case 0:
				System.out.println("Exit");
				break;
			}
		}

		public static void main(String[] args) {
			System.out.println("Welcome to Address Book Program");
			repeat();
			showAllContacts();
		}

	}

}
