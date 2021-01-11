package Assigments;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
		
		printName();
		printIC();
		printAge();
		printGender();
		printDownpayment();
		printCars();
		printFreegift();
		
		}
		
	    static int downpayment;
	
	
		//for loop
		public static void printName() {
		Scanner input = new Scanner (System.in);
		System.out.println("Details of Customer");
		
		String[][] name = {{"Mr", "Ms", "Miss"},
				           {"Natasya", "Siti Rahayu", "Nurin Nabihah", "Azri", "Akmal"}
		}; 
		
		for(int i = 0; i < 1; i++) 
		System.out.print("Enter Your Name: " + name[0][2] + " " + name [1][0]);
		System.out.println();
		
		}
		
		public static void printIC() {
		Scanner input = new Scanner (System.in);
		int ic;
		
		System.out.println("Enter Your I/C Number: ");
		ic = input.nextInt();
		System.out.println("IC Number: " + ic);
		
		}
		
		//do while loop
		public static void printAge() {
		Scanner input = new Scanner (System.in);
		
		int[] age = {21, 40, 50, 35, 28};
			
		int k = 0;
		do {
			
			System.out.println("Enter Your Age: " + age[0]);
			k++;
			
		}while (k < 1);
		
		}
		
		public static void printGender() {
		Scanner input = new Scanner (System.in);
		
		String[] gender = {"Female", "Male"};
		
		int b = 0;
		do {
			
			System.out.println("Enter Your Gender: " + gender[0]);
			b++;
			
		}while (b < 1);
		
		}
		
		public static void printDownpayment() {
		Scanner input = new Scanner (System.in);
		int downpayment;
		
		System.out.print("Enter Your Package Downpayment: ");
		downpayment = input.nextInt();
		
		
		}
	
		public static void printCars() {
		Scanner input = new Scanner (System.in);
	    
		
		if(downpayment < 5000) {
			System.out.println("Your Suitable Car is: " + "Axia");
			
		} else if(downpayment < 7000) {
			System.out.println("Your Suitable Car is: " + "Bezza");
			
			
		} else if(downpayment< 9000) {
			System.out.println("Your Suitable Car is: " + "Myvi");
		
			
		} else if(downpayment < 10000) {
			System.out.println("Your Suitable Car is: " + "Alza");
			
			
		} else
			System.out.println("Your Suitable Car is: " + "Aruz");
			
		}
		
		
		//while loop
		public static void printFreegift() {
		Scanner input = new Scanner (System.in);
		
		String[] freegift = {"Keychain", "Books", "Pen", "Umbrella"};
		
		int a = 0;
		while(a < 1) {
			  System.out.println("Your Freegift is: " + freegift[3] + "," + " " + freegift[0]);
			  a++;	   
			}
		
		}
 
}

