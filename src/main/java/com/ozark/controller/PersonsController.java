package com.ozark.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("persons")
public class PersonsController {
	
	@Inject
	private Models model;
	
	
	@GET
	public String listPersons(){
		
		List<String> persons = new ArrayList<>();
		persons.add("Michel");
		persons.add("David");
		persons.add("Jérome");
		model.put("persons", persons);
		
		return "/persons.jsp";
	}
}
