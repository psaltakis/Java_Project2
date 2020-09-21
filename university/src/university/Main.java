package university;

import java.util.ArrayList;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		ArrayList<Course> lessons = new ArrayList<Course>();
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Maths", 5);
		lessons.add(c1);
		lessons.add(c2);
	    InputData.readData(lessons);
	}

}
