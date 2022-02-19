package com.heidichen.beltreview.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.heidichen.beltreview.models.Project;
import com.heidichen.beltreview.models.User;
import com.heidichen.beltreview.services.ProjectService;
import com.heidichen.beltreview.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private UserService userService;
	
	// dashboard for all projects
	@GetMapping("/dashboard")
	public String dashboard(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		List<Project> projects = projectService.allProjects();
		model.addAttribute("projects", projects);
		
		Long userId = (Long)session.getAttribute("userId");
		User user = userService.findOneUser(userId);
		model.addAttribute("user", user);
		
		return "dashboard.jsp";
	}
	
	// create project (render the form, process the form)
	@GetMapping("/projects/new")
	public String createProjectForm(@ModelAttribute("project")Project project) {
		
		return "createProject.jsp";
	}
	
	@PostMapping("/projects/new")
	public String createProjectProcess(@Valid @ModelAttribute("project")Project project, BindingResult result) {
		if(result.hasErrors()) {
			return "createProject.jsp";
		}else {
			projectService.createProject(project);
			return "redirect:/dashboard";
		}
	}
	

	// show one project
	@GetMapping("/projects/{projectId}")
	public String showOneProject(@PathVariable("projectId")Long projectId, Model model) {
		model.addAttribute("project", projectService.oneProject(projectId));
		return "showOneProject.jsp";
	}
	
	// edit project
	@GetMapping("/projects/edit/{projectId}")
	public String updateProject(@PathVariable("projectId")Long projectId, Model model) {
		model.addAttribute("project", projectService.oneProject(projectId));
		return "editProject.jsp";
	}
	
	// edit process (similar to create)
	// 1. PUT routes include id  2. add hidden method PUT in jsp 3. path is called id
	@PutMapping("/projects/edit/{id}")
	public String editProjectProcess(@Valid @ModelAttribute("project")Project project, BindingResult result) {
		if(result.hasErrors()) {
			return "editProject.jsp";
		}else {
			projectService.updateProject(project);
			return "redirect:/dashboard";
		}
	}
	
	
	// delete project
	@DeleteMapping("/projects/{projectId}")
	public String deleteProject(@PathVariable("projectId")Long projectId) {
		projectService.deleteProject(projectId);
		return "redirect:/dashboard";
	}
	
	
	
	
	
}













