// File Name : Student.java

public class Student {
	private String StudentCode;
	private String StudentName;
	private String StudentSurName;
	private String StudentDept;
           
	/** Creates a new instance of Student */
	public Student() {
		setStudentCode("");
		setStudentName("");
		setStudentSurName("");
		setStudentDept("");
	}

	public Student(String Code, String Name, String SurName) {
		setStudentCode(Code);
		setStudentName(Name);
		setStudentSurName(SurName);
		setStudentDept("");
	}
    
	public void setStudentCode(String Code) {
   	    StudentCode = Code;
	}

	public void setStudentName(String Name) {
   	    StudentName = Name;
	}
 
	public void setStudentSurName(String SurName) {
   	    StudentSurName = SurName;
	}
	
	public void setStudentDept(String Dept) {
   	    StudentDept = Dept;
	}

	public String getStudentCode() {
		return(StudentCode);
	}

	public String getStudentName() {
   	    return(StudentName);
	}
 
	public String getStudentSurName() {
   	    return(StudentSurName);
	}

	public String getStudentDept() {
   	    return(StudentDept);
	}

	public String toString() {
   	    String str = "";
        str = getStudentCode()+" "+getStudentName()+" ";
        str += getStudentSurName()+"\nDepartment : "+getStudentDept();
        return(str);
	} 
}
