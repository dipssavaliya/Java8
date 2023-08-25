package Java8;

import java.util.*;

class Student {

	int studentId;
	String studentname;

	Student(int studentId, String studentname) {
		this.studentId = studentId;
		this.studentname = studentname;
	}

	public String toString() {
		return "studentname : " + studentname + " studentId : " + studentId;
	}

}

public class StudentList {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<Student>();
		stList.add(new Student(1, "Dipali"));
		stList.add(new Student(2, "dipalis"));
		stList.stream().filter(st -> st.studentname.equals("dipalis")).map(st -> st.studentname);
		stList.forEach(System.out::println);
	}
}
