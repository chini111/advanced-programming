package uk.ac.mmu.advprog.lab1;

public class Main {

	public static void main(String[] args) {
		
		ModuleMark m = new ModuleMark(65, 70);
		ModuleMark m2 = new ModuleMark(30, 40);
		
		System.out.println(m2.calculateModuleGrade());
		System.out.println(m2.calculateModuleClassification());
		
	}

}
