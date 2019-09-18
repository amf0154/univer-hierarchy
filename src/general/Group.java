package general;
import general.Faculty;
public class Group extends Faculty{

	private String groupName;

	public Group(String faciltyName, String groupName) {
		super(faciltyName);
		this.groupName = groupName;
	}

	
	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	@Override
	public String toString() {
		return "Group [groupName=" + groupName + "]";
	}
	
	

}

