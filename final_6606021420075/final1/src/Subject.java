// File Name : Subject.java
public class Subject {
	private String SubjectCode;
	private String SubjectName;
	private int SubjectCredit;
	private int SubjectTotal;
	private String SubjectGrade;

	/** Creates a new instance of Subject */
	public Subject() {
		setSubjectCode("");
		setSubjectName("");
		setSubjectCredit(0);
		setSubjectTotal(0);
		setSubjectGrade("");
	}

	public Subject(String Code, String Name, int Credit) {
		setSubjectCode(Code);
		setSubjectName(Name);
		setSubjectCredit(Credit);
		setSubjectTotal(0);
		setSubjectGrade("");
	}

	public void setSubjectCode(String Code) {
		SubjectCode = Code;
	}

	public void setSubjectName(String Name) {
		SubjectName = Name;
	}

	public void setSubjectCredit(int Credit) {
		SubjectCredit = Credit;
	}

	public void setSubjectTotal(int Total) {
		SubjectTotal = Total;
	}

	public void setSubjectGrade(String Grade) {
		SubjectGrade = Grade;
	}

	public String getSubjectCode() {
		return (SubjectCode);
	}

	public String getSubjectName() {
		return (SubjectName);
	}

	public int getSubjectCredit() {
		return (SubjectCredit);
	}

	public int getSubjectTotal() {
		return (SubjectTotal);
	}

	public String getSubjectGrade() {
		return (SubjectGrade);
	}

	public String toString() {
		String str = "";
		str = getSubjectCode() + " " + getSubjectName() + " ";
		str += getSubjectCredit() + ", Score Total : " + getSubjectTotal() + ", Grade id : " + getSubjectGrade();
		return (str);
	}
}
