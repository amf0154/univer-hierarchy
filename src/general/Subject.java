package general;

public class Subject {

	private String nameSubject;
	private Integer grade;
	
	public Subject(String nameSubject, Integer grade) {
		super();
		this.nameSubject = nameSubject;
		this.grade = grade;
	}
	
	public Subject() {
		super();
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Subject [nameSubject=" + nameSubject + ", grade=" + grade + "]";
	}
	
	

}
