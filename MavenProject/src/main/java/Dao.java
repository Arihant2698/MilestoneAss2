import java.sql.SQLException;
import java.util.Scanner;

public class Dao {

	public static void main(String[] args) throws SQLException   {
		// TODO Auto-generated constructor stub
		
		Main main1=new Main();
		User user =new User();
		Scanner sc=new Scanner(System.in);
		
//		
//		System.out.println("Choose the operation u want to perform :");
//		System.out.println("1.Get all users.");
//		System.out.println("2.Insert User.");
//		System.out.println("3.Update User.");
//		System.out.println("4.Delete User");
//		int n=sc.nextInt();
		int n=0;
	while(n<=4) {
		System.out.println("Choose the operation u want to perform :");
		System.out.println("1.Get all users.");
		System.out.println("2.Insert User.");
		System.out.println("3.Update User.");
		System.out.println("4.Delete User");
		System.out.println("5.To exit.");
		n=sc.nextInt();
	
		
		
		switch(n) {
		
		case 1:Main.readAllUser();
			break;
		case 2:
			System.out.println("Enter Username:");
			String s=sc.next();
			user.setUsername(s);
			System.out.println("Enter Email Id:");
			s=sc.next();
			user.setEmail(s);
			System.out.println("Enter the Password:");
			s=sc.next();
			user.setPassword(s);
			
			main1.insertUser(user);
			break;
			
			
		case 3:
			System.out.println("Enter Username:");
			String ss=sc.next();
			user.setUsername(ss);
			System.out.println("Enter Email Id:");
			ss=sc.next();
			user.setEmail(ss);
			System.out.println("Enter Id:");
			int a=sc.nextInt();
			user.setId(a);
			
			Main.UpdateUser(user);
			break;
			
		case 4:
			System.out.println("Enter Id:");
			int a1=sc.nextInt();
			user.setId(a1);
			
			Main.DeleteUser(user);
			break;
		default:
		System.out.println("Good Day");
		break;
			
		}
	}
		
		sc.close();
		
		
		
//		user.setUsername("navimumbai");
//		user.setEmail("navimumbai@gmail.com");
//		user.setPassword("123456");
//			
//			//readAllUser();
//		main1.insertUser(user);
		//main1.UpdateUser(user);
		//	main1.DeleteUser(user);
		}
}
