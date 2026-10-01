import java.util.Scanner;

/**
 * Software Development 1, Coursework 2
 * 
 * @author Christopher Mitchell
 * 
 * The coursework specification is available on Vision.
 * Please read through it in full before you start work.
 */
public class DataAnalysis {

	public static void main(String[] args) {
		
		//initialising Arrays
		String [] name;
		double [] age;
		String [] gender;
		
		//initial variables
		int no_people;
		int m_count;
		int f_count;
		String oldest;
		double oldestAge;
		
		//Scanner to ask user to input the total number of people
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the total number of people: ");
		no_people = scan.nextInt();
		
		//variables
		name = new String [no_people];
		age = new double [no_people];
		gender = new String [no_people];
		m_count = 0;
		f_count  = 0;
		double totalAge;
		totalAge = 0;
		oldest = "";
		oldestAge = 0.00;
		
		//code to ask the appropriate questions for each of the no_people
		for(int i = 0; i < no_people; i ++) {
		
		  System.out.println("Please enter the Name of Person: " + (i+1));
	      name [i] = scan.next();
		
		  System.out.println("Please enter the Age of Person: " +(i+1));
	      age [i] = scan.nextDouble();
	      totalAge += age [i];
	       
	      	if (oldestAge> age [i]) {
	        	oldestAge = age [i];
	            oldest = name [i];
	      	}
	      	
	      System.out.println("Please enter the Gender of Person (Enter M or F): " +(i+1));
	      gender [i] = scan.next();	
	      
	      //code to count the total number of Males & Females entered
	      if ((gender [i].equals("M")))
	    	  m_count += 1;
	      
	      if ((gender [i].equals("F")))
	    	  f_count += 1;
	      
	      //code to display error message if correct gender letter is not entered
	      while( ! (gender [i].equals("M") || gender [i].equals("F"))) { 
		
			System.out.println("Please enter M or F for persons Gender: ");
		    gender [i] = scan.next();
		
	      }
	      
	    }
		
		//code to print out the results on screen for the user
		System.out.println("The gender ratio of the entries provided are, " + ((m_count / (m_count + f_count))*100) + " % male and " +((f_count/ (m_count + f_count))*100) + " % female"); 
	    System.out.println("The mean age is, " + (totalAge / no_people) + " with a standard deviation of " );
	    System.out.println("The oldest person is, " + (oldest) + " who is " + (oldestAge));
	    
	}
	
}
