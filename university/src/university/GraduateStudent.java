package university;

import java.util.ArrayList;

public class GraduateStudent extends Student {
	public String Supervisor;
    public GraduateStudent(String name, int am, ArrayList<Course> courses, String supervisor) {
		super(name, am, courses);
		this.Supervisor = supervisor;
	}

	public void printData () {
        super.printData();
        System.out.println("Supervisor: " + Supervisor);
    }
    
    public String getSupervisor() {
		return Supervisor;
	}

	public void setSupervisor(String supervisor) {
		Supervisor = supervisor;
	}
}
