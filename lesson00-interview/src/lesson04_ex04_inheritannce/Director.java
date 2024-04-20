package lesson04_ex04_inheritannce;

import java.time.LocalDate;

// Inheritance
public class Director extends BaseEmployee {
	
	private Integer levelUpTitle;
	
	public Director() {
	}

	public Director(String fullname, LocalDate dateOfBirth, Integer levelUpSalary, Integer levelUpTitle) {
		super(fullname, dateOfBirth, levelUpSalary);
		this.levelUpTitle = levelUpTitle;
	}
	
	public Integer getLevelUpTitle() {
		return levelUpTitle;
	}
	
	public void setLevelUpTitle(Integer levelUpTitle) {
		this.levelUpTitle = levelUpTitle;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + getLevelUpTitle();
	}
	
}
