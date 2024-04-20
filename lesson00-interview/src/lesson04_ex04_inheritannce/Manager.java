package lesson04_ex04_inheritannce;

public class Manager {
	
	private BaseEmployee baseEmployee;
	private Integer levelUpTitle;
	private String department;
	
	public Manager() {
	}

	public Manager(BaseEmployee baseEmployee, Integer levelUpTitle, String department) {
		this.baseEmployee = baseEmployee;
		this.levelUpTitle = levelUpTitle;
		this.department = department;
	}
	
	// Class 1: A B C D E F G --> Base 1, Base 2
	
	// Class 2: A B C E F --> Base 1
	
	// Class 3: D G --> Bas 2
	
	// Class 4: A B C D E F --> Base 1, D
	
	// Class 5: D G --> Base 2
	
	// Base 1: A B C E F
	// Base 2: D G
	
	
	
	
}
