import java.util.Scanner;
import java.util.stream.IntStream;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int courseWork1, courseWork2;
		
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
		System.out.println("First coursework grade?");
		courseWork1 = scan.nextInt(); 
		System.out.println("Second coursework grade?");
		courseWork2 = scan.nextInt(); 
		
		UnitMark marks = new UnitMark(courseWork1, courseWork2);
		
		double finalMark =  marks.calculateUnitGrade(courseWork1, courseWork2);
		String finalGrade = marks.calculateUnitClassification(courseWork1, courseWork2);
		System.out.println("Your overall mark is: " + finalMark);
		System.out.println("Your overall grade is: " + finalGrade);
		 
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
