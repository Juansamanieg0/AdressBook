import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
	Map <String, String> hashmap=new HashMap<>();
	
	public void load() throws IOException {
		BufferedReader reader;
			reader = new BufferedReader(new FileReader(
					"phonebook.txt"));
			String line = reader.readLine();
			
			int found=0;
			
			while (line != null) {
				if(!line.equals("")) {
					found=1;
					String [] data=line.split(",");
					
					hashmap.put(data[0], data[1]);
				}
				// read next line
				line = reader.readLine();
				
			}
			if(found==1) {
				System.out.print("Data loaded correctly\n");
			}
			else {
				System.out.print("No data to load\n");
			}
	}
	
	public void save() throws IOException {
		FileWriter myWriter = new FileWriter("phonebook.txt");
	    
	    
		int found=0;
		Iterator it = hashmap.entrySet().iterator();
	    while (it.hasNext()) {
	    	found=1;
	        Map.Entry pair = (Map.Entry)it.next();
	        myWriter.write(pair.getKey()+","+pair.getValue()+"\n");	        
	    }
	    myWriter.close();
	    if(found==1) {
			System.out.print("Data saved correctly\n");
		}
		else {
			System.out.print("No data to save\n");
		}
	}
	
	public void list() {
		System.out.print("Contacts:\n");
		Iterator it = hashmap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.print(pair.getKey()+": "+pair.getValue()+"\n");	        
	    }
	}
	
	public void create() {
		System.out.print("Enter Phone Number:\n");
	
		
		Scanner sc=new Scanner(System.in);
		
		String phno=sc.nextLine();
		
		System.out.print("Enter name:\n");
		
		String name=sc.nextLine();
		hashmap.put(phno, name);
		
		System.out.print("Created successfully\n");
	}
	public void delete() {
		System.out.print("Enter Phone Number to delete:\n");
		
		
		Scanner sc=new Scanner(System.in);
		
		String phno=sc.nextLine();
		
		
	if(hashmap.containsKey(phno)) {
		hashmap.remove(phno);
		System.out.print("Removed successfully\n");
	}
	else {
		System.out.print("Key not found\n");
	}
	

		
	}
	
	
}
