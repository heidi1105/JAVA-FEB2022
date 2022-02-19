package com.heidichen.beltreview.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heidichen.beltreview.models.Project;
import com.heidichen.beltreview.repositories.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepo;
	
	// find all
	public List<Project> allProjects(){
		return projectRepo.findAll();
	}
	
	// create one
	public Project createProject(Project project) {
		return projectRepo.save(project);
	}
	
	
	// show one
	public Project oneProject(Long projectId) {
		Optional<Project> optionalProject = projectRepo.findById(projectId);
		if(optionalProject.isPresent()) {
			return optionalProject.get();
		}else {
			return null;
		}
	}
	
	// edit one
	public Project updateProject(Project project) {
		return projectRepo.save(project);
	}
	
	
	// delete one
	public void deleteProject(Long id) {
		projectRepo.deleteById(id);
	}
	
}





