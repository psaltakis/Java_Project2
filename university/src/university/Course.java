package university;

public class Course {
	public String name;
	public int credits;
	public Course (String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}

}
