package com.example.scrumptious.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScrumptiousController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	// What do I need to do?
	// Oauth Login.
	// A project selection screen after being logged in.
	// Specific project display with task listings, add remove and edit. 
	// Task component with assigned person, name, description. etc.


	// LoggedIn Requests
	// All of these need to verify access through their user data in mongoDB. 
	// GET projects (get all projects)
	// POST projects (make project)


	// Specific project requests
	// (When in a specific project, I need to verify if user or admin, and then send that to the client 
	// to enable only certain tasks.) (Is this secure in the front end?)
	// GET projects/1234567890 ( Get a specific project )
	// DELETE projects/2345678912 (delete project) 
	
	// Specific task requests
	// (Getting a project should get a specific task)
	// POST projects/12345/task/1 (Create/Edit a task) 

	// TODO:
	// SEED data for a user, project and a task to get/post queries
	// Configure OAuth
	// Design front end.
}