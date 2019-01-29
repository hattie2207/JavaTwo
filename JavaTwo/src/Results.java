
public class Results {

	private int physics, chemistry, maths, failCount;
	private boolean errorInput; 

	public void setPhysics(int physics) {

		if (physics >= 0 && physics <= 150) {
			this.physics = physics;
			checkPass(physics);
		}
		else {
			System.out.println("Invalid physics mark");
			errorInput = true; 

		}
	}

	public void setChemistry(int chemistry) {
 
		if (chemistry >= 0 && chemistry <= 150) {
			this.chemistry = chemistry;
			checkPass(chemistry);
		}
		else {
			System.out.println("Invalid chemistry mark");
			errorInput = true; 

		}
	}
	
	public void setMaths(int maths) {
		
		if (maths >= 0 && maths <= 150) {
			this.maths = maths;
			checkPass(maths);
		}
		else {
			System.out.println("Invalid maths mark");
			errorInput = true; 

		}
	}

	public void checkPass(int subject) {
		
		if(subject < 60) {
			failCount++; 
		}
		
	}
	
	public void checkResults() {
		
		switch(failCount) {
		
		case 0:
			showResults(); 
			break;
		case 1:
			System.out.println("Retake the exam");
			break;
		case 2:
			System.out.println("Repeat the course");
			break;
		case 3: 
			System.out.println("Go home");
			break;
		}

	}
	
	private void showResults() {
		
		int total;
		double percentage; 
		total = physics + chemistry + maths;
		percentage = (total * 100) / 450;

		if (errorInput == false) {			
			System.out.println("Total Marks: " + total);
			System.out.println("Percentage: " + percentage);
		}
		else {
			System.out.println("Cannot show results with invalid marks");
		}

	}
	
	public static void main(String[] args) {
		
		Results peter = new Results();
		peter.setPhysics(40);
		peter.setChemistry(60);
		peter.setMaths(60);
		peter.checkResults();		
	}

}
