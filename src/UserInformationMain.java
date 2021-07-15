import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.tcs.batch3.base.UserService;
import com.tcs.batch3.base.UserServiecImpl;

public class UserInformationMain {

	public static void main(String args[])
	{
		
		List<String> lst = new LinkedList<>();
		UserService userv = new UserServiecImpl();
		while(true) {
		System.out.println("Main Menu");
		System.out.println("Select an option from below");
		System.out.println("1. Add a user");
		System.out.println("2. Modify a user");
		System.out.println("3. Delete a user");
		System.out.println("4. See Details of User");
		System.out.println("5. See Details of all Users");
		
		
		Scanner sc = new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option)
		{
			case 1:
				userv.addUser();
				break;
			
			case 2:
				modifyUser();
				break;
				
			case 3:
			deletUser();
				break;
				
			case 4:
				viewAll();
				break;
			
			
			default:
			{
				System.out.println("Invalid input");
			}
		
		}
		System.out.println("Continue(Y/N): ");
		String cont = sc.next();
		if(ApplicationConstants.NO_CODE.equalsIgnoreCase(cont)) {
			break;
		}
		
	}
		
		
	}

	private static void deletUser() {
		System.out.println("Enter User ID:");
		Scanner sc = new Scanner(System.in); 
		Integer uid = sc.nextInt();
		
		for(UserData user : ApplicationConstants.users) {
			if(user.getEmpID().equals(uid)) {
				ApplicationConstants.users.remove(user);
				break;
			}
		}
		System.out.println("User deleted ....");
	}

	private static void viewAll() {
		System.out.println("========================================================Users======================================================================");
		System.out.println("User ID \t Name \t AGe");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		for(UserData user : ApplicationConstants.users) {
			System.out.println(user.getEmpID() +"\t"+user.getName());
		}
	}

	private static void modifyUser() {
		// TODO Auto-generated method stub
		
	}

	private static void adduser() {
		
		
		
		
		/*
		 * String userdata = "Darshan|adrress|21|"; String []values =
		 * userdata.split("\\|"); values[0]
		 */
		
		Scanner sc = new Scanner(System.in); 		
		UserData new_user = new UserData();
		System.out.print("Enter Name:");
		String name = sc.nextLine();
		new_user.setName(name);
		
		System.out.print("Enter Address:");
		String address = sc.nextLine();
		new_user.setAddress(address);
		
		System.out.print("Enter Age:");
		int age = sc.nextInt();
		new_user.setAge(age);
		
		System.out.print("Enter Employee ID:");
		Integer emp = sc.nextInt();
		new_user.setEmpID(emp);
		
		ApplicationConstants.users.add(new_user);
		System.out.println("User added ...");
	}
		
}
