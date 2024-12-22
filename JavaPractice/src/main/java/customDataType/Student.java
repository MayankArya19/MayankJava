package customDataType;

import java.util.Arrays;

public class Student {
	private String name;
	
	private String rollNo;
	private String className;
	
	private String [] subjects;


	
	
	public Student(String name, String rollNo, String className, String [] subjects) {
		
		this.name=name;
		this.rollNo=rollNo;
		this.className=className;
		this.subjects=subjects;
		
	}
	



	public void setName(String name) {
		this.name = name;
	}




	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", className=" + className + ", Subjects="
				+ Arrays.toString(subjects) + "]";
 	}
	
	
	
	

}
