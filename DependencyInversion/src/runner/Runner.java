package runner;

import java.util.ArrayList;
import java.util.List;

import projectExercise.BackendDev;
import projectExercise.Developer;
import projectExercise.FrontendDev;
import projectExercise.Project;

public class Runner {
	public static void main(String[] args) {
		
	BackendDev backend = new BackendDev();
	FrontendDev frontend = new FrontendDev();
	Project project = new Project(null);
	
	project.implementOneDev(frontend);
	project.implementOneDev(backend);
	
	List<Developer> developer = new ArrayList<>();
	developer.add(backend);
	developer.add(frontend);
	
	Project multiDevs = new Project(developer);
	multiDevs.implementListOne();
	}
}