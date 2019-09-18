package general;
import general.Group;
import general.Subject;
public class Student extends Group {

	private String name;
	private Subject[] subject;
	public Student(String faciltyName, String groupName, String name, Subject[] subject) {
		super(faciltyName, groupName);
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrades() {
		String obj="";
		for(Subject s: this.subject) {
			obj += s.getNameSubject() + "=" + s.getGrade().toString() + "; ";
		}
		return obj;
	}
	
	public Integer getAverageGrade() {
		try {
			Integer sumOfGrades = 0;
			Integer countGrades = 0;
			for(Subject s: this.subject) {
				sumOfGrades += s.getGrade();
				countGrades +=1;
			}
			return sumOfGrades / countGrades;			
		}catch(ArithmeticException e) {
			throw(e);
		}
	}
	@Override
	public String toString() {
		return "Name=" + name + "; Faculty="+ super.getFaciltyName() +  "; Group="+ super.getGroupName() + ", subjects: " + this.getGrades();
	}

	
	
	

}
