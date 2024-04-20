package lesson04_ex04_inheritannce;

import java.time.LocalDate;

public class BaseEmployee {
	
	private String fullname;
	private LocalDate dateOfBirth;
	private Integer levelUpSalary;
	
	public BaseEmployee() {
	}

	public BaseEmployee(String fullname, LocalDate dateOfBirth, Integer levelUpSalary) {
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.levelUpSalary = levelUpSalary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getLevelUpSalary() {
		return levelUpSalary;
	}

	public void setLevelUpSalary(Integer levelUpSalary) {
		this.levelUpSalary = levelUpSalary;
	}

	@Override
	public String toString() {
		return "BaseEmployee [fullname=" + fullname + ", dateOfBirth=" + dateOfBirth + ", levelUpSalary="
				+ levelUpSalary + "]";
	}
	
}
