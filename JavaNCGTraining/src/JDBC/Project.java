package JDBC;

public class Project {
	private Integer projectId;
	private String projectName;
	private Integer projectDuration;

public Project() {
	
}

public Project(Integer projectId, String projectName, Integer projectDuartion) {
	this.projectId = projectId;
	this.projectName = projectName;
	this.projectDuration = projectDuartion;
}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(Integer projectDuration) {
		this.projectDuration = projectDuration;
	}

}
