package uk.ac.mmu.advprog.lab1;

public class Main {

	public static void main(String[] args) {
		
		ModuleMark m = new ModuleMark(60,70);
		Student m1 = new Student("chini");
	
				
				ModuleMark[] marks = {                     // 2. make the three modules and put them in an array
					    new ModuleMark(65, 70),                //    grade 67.5
					    new ModuleMark(72, 68),                //    grade 70.0
					    new ModuleMark(58, 61)                 //    grade 59.5
					};
				
				
		m1.setMarks(marks);
		
		System.out.println(m1.calculateOverallGrade());
		
		System.out.println(m.calculateModuleClassification());
		System.out.println(m.calculateModuleGrade());
		
	}

}
 