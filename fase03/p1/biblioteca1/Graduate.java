package biblioteca1;

public class Graduate {
	String name;
	boolean gender;
	String finishYear;
	
	public Graduate(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getFinishYear() {
		return finishYear;
	}

	public void setFinishYear(String finishYear) {
		this.finishYear = finishYear;
	}		
	
}
