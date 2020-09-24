import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static String menu() {
		System.out.print("Enter 1 to load form file\n");
		System.out.print("Enter 2 to save in file\n");
		System.out.print("Enter 3 to create address\n");
		System.out.print("Enter 4 to delete address\n");
		System.out.print("Enter 5 to list addresses\n");
		System.out.print("Enter 6 to exit\n");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		return choice;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AddressBook abook = new AddressBook();
		while (true) {

			String choice = menu();
			if (choice.equals("1")) {
				abook.load();
			} else if (choice.equals("2")) {
				abook.save();
			} else if (choice.equals("3")) {
				abook.create();
			} else if (choice.equals("4")) {
				abook.delete();
			} else if (choice.equals("5")) {
				abook.list();
			} else if (choice.equals("6")) {
				System.out.print("\nExiting");
				break;
			}

		}
	}

}
