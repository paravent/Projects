
public class UnitMark extends mainClass {

	double courseWork1, courseWork2; 
	
	UnitMark(int courseWork1, int courseWork2)
	{
		
		this.courseWork1 = courseWork1;
		this.courseWork2 = courseWork2;
		 
	}
	
	double calculateUnitGrade(int courseWork1, int courseWork2) {
		
		return((courseWork1 + courseWork2)/2); 
		
		
	}
	
	String calculateUnitClassification(int courseWork1 , int courseWork2) {
		double finalGrade = ((courseWork1 + courseWork2)/2); 
		if(finalGrade >= 70.0) {
			 return("I"); 
		}
		if(finalGrade > 60.0 && finalGrade < 70.0) {
			 return("II(I)"); 
		}
		if(finalGrade > 50 && finalGrade < 60.0) {
			 return("II(II)"); 
		}
		else
			return("FAIL");

	}
	
	
}
