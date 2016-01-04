package com.ozark.controller;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ozark.model.Person;

@Path("hybrid")
public class HybridResources {

	@Inject
	private Models model;
	
	@GET
	@Controller
	@Path("mvc")
	public String hybridController(){
		model.put("modelhybrid", "come from controller method");
		return "/hybrid.jsp";
	}
	
	@GET
	@Path("jaxrs")
	@Produces(MediaType.APPLICATION_JSON) 
	public Person jaxrsResource(){
		Person person = new Person("firstname","lastname");
		return person;
	}
	
}
