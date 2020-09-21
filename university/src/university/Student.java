package university;

import java.util.ArrayList;

public class Student {
	public String name;
    public int am;
    public ArrayList<Course> courses = new ArrayList<Course>();
    public Student(String name, int am, ArrayList<Course> courses) {
        this.name = name;
        this.am = am;
        this.courses = courses;
    }
    
	public void addCourse(Course course) {
        this.courses.add(course);
    }
	
    public void printData() {
    	System.out.println("Name: " + getName() + "\nID: " + getAm() + "\n" + getCourses().get(0).getName() + "\n" +getCourses().get(0).credits);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAm() {
		return am;
	}

	public void setAm(int am) {
		this.am = am;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

}
