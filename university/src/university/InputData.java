package university;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import javax.swing.JFrame;


public class InputData {
	JFrame f;

	public static void readData(ArrayList<Course> lessons) {
		ArrayList<Student> students = new ArrayList<Student>();
		String cont;
		
		do {
			
			int category = Integer.parseInt(JOptionPane.showInputDialog("1: Student, 2: Graduate"));
			
			Component frame = null;

			while(category!=1 && category!=2){
				
				JOptionPane.showMessageDialog(frame, "You have to enter 1 or 2 only");

				category = Integer.parseInt(JOptionPane.showInputDialog("1: Student, 2: Graduate"));
	           }
			
	        String name = JOptionPane.showInputDialog("Name");
	        
	        int am = Integer.parseInt(JOptionPane.showInputDialog("ID"));
	        
	        Student person = null;
			ArrayList<Course> courses = new ArrayList<Course>();
			
	        if (category == (int)1) {
	        	person = new Student(name, am, courses);
	        } else if (category == (int)2) {
	            String svisor = JOptionPane.showInputDialog("Supervisor");
	            person = new GraduateStudent(name, am, courses, svisor);
	        }
	        
	        String course = JOptionPane.showInputDialog("Enter course Name");
	        
	        while(!course.equalsIgnoreCase("java") && !course.equalsIgnoreCase("maths") ){
	        	
				JOptionPane.showMessageDialog(frame, "You have to enter only java or maths ");
				course = JOptionPane.showInputDialog("Enter course Name");

	        }
	        
	        if (course.equalsIgnoreCase("java")) {
	        	person.addCourse(lessons.get(0));
	        }
	        
	        if (course.equalsIgnoreCase("maths")) {
	        	person.addCourse(lessons.get(1));
	        }
	        
	        students.add(person);
        
	        cont = JOptionPane.showInputDialog("More students? (Y/N)");
	        
	        while(!cont.equalsIgnoreCase("Y") && !cont.equalsIgnoreCase("N") ){
	        	
				JOptionPane.showMessageDialog(frame, "You have to enter only Y or N ");
		        cont = JOptionPane.showInputDialog("More students? (Y/N)");

	        }
	        
	    }
        while (cont.equalsIgnoreCase("y"));
		
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			student.printData();
		}
	}
}
