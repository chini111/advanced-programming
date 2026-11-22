package uk.ac.mmu.advprog.lab1;

public class ModuleMark {
	
	private int courseworkA;
	private int courseworkB;
	
	public ModuleMark( int courseworkA, int courseworkB) {
		
		
	this.courseworkA = courseworkA;
	this.courseworkB = courseworkB;
	
	}
	
	public double calculateModuleGrade() {
		
		
		
		return (courseworkA + courseworkB) / 2.0 ;
	}
	
	public String calculateModuleClassification() {
		
		double grade = calculateModuleGrade();
		
		if( grade >= 70) {
			
			return "I";
		}
		
		else if(grade >= 60) {
			return "II(I)";
		}
		
		else if(grade >= 50) {
			
			return "II(II)";
		}

		else if(grade >= 40) {
			return "III";
		}
		
		else {
			
			return "Fail";
		}
		
	}
}