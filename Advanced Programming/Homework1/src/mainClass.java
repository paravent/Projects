import java.util.Scanner;
import java.util.stream.IntStream;

public class mainClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int courseWork1, courseWork2;
		double marks[] = new double[100]; 
		double totalValue = 0; 
		
		System.out.println("Enter name... \n");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine(); 
		System.out.println("Enter age... \n");
		int age = scan.nextInt(); 
		String userTicket = null; 
		
		System.out.println(name + "\n");
		System.out.println(age + "\n");
		
		int[] youngAdultTicket = IntStream.rangeClosed(16,25).toArray(); //Way to put range of ages into array
		int[] childTicket = IntStream.iterate(5, n -> n + 1).limit(15).toArray(); //Same thing more general
		int[] middleAgeTicket = IntStream.iterate(26, n -> n + 1).limit(30).toArray();
		
		
		if(findTicket(age, youngAdultTicket) == true) {
			userTicket = "Young adult ticket"; 
		}
		if(findTicket(age, childTicket) == true) {
			userTicket = "Child ticket"; 
			
		}
		if(findTicket(age, middleAgeTicket) == true) {
			userTicket = "Middle aged ticket"; 
			
		}
		
		System.out.println("Your ticket is :" +  "Aiden :" + userTicket);

		System.out.println("------------------------------------------------------------");
		System.out.println("Next Task \n ");
		
		
		
		
		boolean stop = false;
		double runningTotal = 0.0; 
		int counter = 0; 
		while(!stop) {
			counter++; 
			
			String studentName = addName();
			System.out.println("First coursework grade?");
			courseWork1 = scan.nextInt(); 
			System.out.println("Second coursework grade?");
			courseWork2 = scan.nextInt(); 
			
			UnitMark markings = new UnitMark(courseWork1, courseWork2);
			UnitMark dummyMarkings = new UnitMark(courseWork1, courseWork2);
			String finalGrade = markings.calculateUnitClassification(courseWork1, courseWork2);
			
			double finalMark =  markings.calculateUnitGrade(courseWork1, courseWork2);
			double finalMarks =  dummyMarkings.calculateUnitGrade(courseWork1, courseWork2);
			
			Student students = new Student(studentName, finalMark, marks, totalValue); 

			students.setMarks(marks);
			
			
			
			System.out.println("Your overall mark is: " + finalMark);
			System.out.println("Your overall grade is: " + finalGrade);
			System.out.println("------------------------------------------------------------");
			System.out.println("Next Task \n");
			System.out.println("total average is " + students.calculateOverallGrade(marks, totalValue));
		    System.out.println("Would you like to continue? (yes(1) or no(2))");
		    int s = scan.nextInt();
		    
		    
		    runningTotal = runningTotal + students.calculateOverallGrade(marks, totalValue); 
		    counter++; 
		    if(s == 2) {
		        stop = true;
		        System.out.println(counter);
		        System.out.println("total is" + (runningTotal / counter) * 2);
		        System.out.println("here");
		        
		        break; 
		    }
		    
		}
		
		
		 
		
		
		 
	}
	
static String addName() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter name... \n");
	String studentName = scan.nextLine();
	
	return(studentName);
	
}
	

static boolean findTicket(int age, int[] myArray) {
	
	for(int i = 0; i < myArray.length; i++) {
		if(age == myArray[i]) {
			return true;
		}
	}
	return false; 
	
}
}

