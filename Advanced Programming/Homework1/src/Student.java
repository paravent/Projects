
public class Student extends mainClass{

	String studentName; 
	double marks[]; //occurs everywhere different for each created
	double finalMarks; 
	double totalValue; 
 
	 
	
	
	public Student(String studentName, double finalMarks, double[] marks, double totalValue){
		
		this.studentName = studentName; 
		this.marks = marks; 
		this.finalMarks = finalMarks; 
		this.totalValue = totalValue; 
		

	}
	
	public void setMarks(double[] marks) {
		int i=0; 
		marks[i+1] = finalMarks; 
		i=i+1;
		System.out.println("We're nearly there");
		
	}
	
	double calculateOverallGrade(double[] marks, double totalValue) {
		 
		for(int i=0; i<marks.length; i++) {
			totalValue = (totalValue + marks[i]);
			//System.out.println("total atm is" + totalValue);
		}

		return(totalValue);
		
	}
	



	
	
}

