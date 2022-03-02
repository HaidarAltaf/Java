package projectExercise;

import java.util.List;

public class Project {
	private String project;

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	public void developer(Developer dev) {
		dev.Dev(project);
	}
	//list of devs
	private List<Developer> Developer;

	//list dev constructor
	public Project(List<Developer> Developers) {
		this.Developer = Developers;
	}
	//single dev
	public void implementOneDev(Developer dev) {
		dev.Dev(project);
	}
	//list of devs method 1
	public void implementListOne() {
		for(Developer dev : Developer) {
			dev.Dev(project);
		}
	}
}
	//single dev
//	private Developer developer;
	
	//default constructor
//	public Project() {}
	
	//single dev constructor
//	public Project(Developer developer) {
//		this.developer = developer;
//	}

	//list of devs method 2
//	public void implementListTwo(List<Developer> devs) {
//		for(projectExercise.Developer dev : devs) {
//			dev.Dev(project);
//		}
//			
//	}

	

