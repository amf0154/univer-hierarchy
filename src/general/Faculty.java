package general;

public class Faculty {

	private String faciltyName;

	public Faculty(String faciltyName) {
		super();
		this.faciltyName = faciltyName;
	}

	public String getFaciltyName() {
		return faciltyName;
	}

	public void setFaciltyName(String faciltyName) {
		this.faciltyName = faciltyName;
	}

	@Override
	public String toString() {
		return "Faculty [faciltyName=" + faciltyName + "]";
	}
	
	
}
