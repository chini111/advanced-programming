package uk.ac.mmu.advprog.lab1;

public class Student {

	private String name;
	private ModuleMark[] marks;
	
	public Student( String name) {
		
		this.name = name;
		
	}
				
	public void setMarks( ModuleMark[] marks) {
		
		this.marks = marks;
	}
	
	
	public double calculateOverallGrade() {
		
		double total = 0;
		
		for (int i = 0; i < marks.length; i++ ) {
			
			total += marks[i].calculateModuleGrade();
		
		}
	
		
			return total / marks.length;
	}
	
	

}