package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		String naam, pasw,naam1, pasw1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("______Register here!!_______");
		System.out.println("Give a username: ");
		naam= sc.next();
		System.out.println("Give a password: ");
		pasw= sc.next();
		
		System.out.println("REGISTERED SUCCESSFULLY");
		
		System.out.println("_______Login here_______");
		System.out.println("Enter username: ");
		naam1= sc.next();
		System.out.println("Enter password: ");
		pasw1=sc.next();
		
		if(naam.equals(naam1)&& pasw.equals(pasw1)) {
			System.out.println("*******LOGIN SUCCESSFUL********");
			options();
		}
		else {
			System.out.println("!!!!!!Username or password doesnot match. Try again!!!!!!!");
		}
	}
	
		static ArrayList<Player> arl= new ArrayList<Player>();
		
		 public static void options() {
			 System.out.println("Choose any option below: ");
			System.out.println("1. Add a player.");
			System.out.println("2. View players.");
			System.out.println("3. Remove a player.");
			System.out.println("4. View a player by their Id.");
			System.out.println("5. Replace a player.");
			Player p = new Player();
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter any one case: ");
		int a= input.nextInt();
		int id;
		String name,clb; 
		float sal; 
		
		switch (a) {
		case 1: 
			System.out.println("_____Add players here_____");
			System.out.println("Enter Id: ");
			 id= input.nextInt();
			System.out.println("Enter a player's name: ");
			name=  input.next();
			System.out.println("Enter the name of club: " );
			clb= input.next();
			System.out.println("Enter a player's salary: ");
			sal= input.nextFloat();
		
			p.setId(id);
			p.setName(name);
			p.setClub(clb);
			p.setSalary(sal);
			
			arl.add(p);
			
			System.out.println("Successfully addeed a player.");
//			options();
			
			break;
			
		case 2:
			System.out.println("_____Welcome to the view point_____");
			System.out.println("ID | NAME | CLUB | SALARY  ");
			for(Player obj: arl) {
				
				System.out.println(obj.id+" "+obj.name+" "+obj.club+" "+obj.salary);
				
				
				
			}
			System.out.println("_______________________________________________-");
			break;
			
		case 3:  
			System.out.println("_______Remove a player________");
			
			System.out.println("Enter an Id you want to delete.");
			
			
			
			
			break;
			
		case 4:
			System.out.println("____View a player by id_____");
			break;
			
		case 5:
			System.out.println("____Replace a player____");
			Player p2= new Player();
			
			
			System.out.println("Enter Id: ");
				 id= input.nextInt();
				System.out.println("Enter a player's name: ");
				name=  input.next();
				System.out.println("Enter the name of club: " );
				clb= input.next();
				System.out.println("Enter a player's salary: ");
				sal= input.nextFloat();
				p2.setId(id);
				p2.setName(name);
				p2.setClub(clb);
				
				p2.setSalary(sal);
				System.out.println("Enter an id you want to replace.");
				
				arl.set(p.getId(),p2);
				
			
			break;
		default:
			System.out.println("*****Invalid id*****");
			break;
		}
		options();
		
		}
}
