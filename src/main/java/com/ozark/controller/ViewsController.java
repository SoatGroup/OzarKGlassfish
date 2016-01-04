package com.ozark.controller;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.Viewable;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Controller
@Path("views")
public class ViewsController {

	@Inject
	private Models model;
	
	@GET  
	@Path("void")
	@View("/voidview.jsp")
	public void voidController(){
		model.put("voidview", "return from void type controller method");
	}
	
	
	@GET
	@Path("string")
	public String stringController(){
		model.put("stringview", "return from string type controller method");
		return "/stringview.jsp";
	}
	
	@GET
	@Path("viewable")
	public Viewable  viewableController(){
		model.put("viewableview", "return from viewable type controller method");
		return new Viewable("/viewableview.jsp");
	}
	
	private class CustomView{
		@Override
		public String toString() {
			return "/javatype.jsp";
		}
	}
	
	@GET
	@Path("javatype")
	public CustomView customViewController(){
		model.put("javatype", "return from javatype type controller method");
		return new CustomView(); 
	}
	
	@GET
	@Path("response")
	public Response responseController(){
		model.put("response", "return from response type controller method");
		return Response.status(Status.OK).entity("/responseview.jsp").build(); 
	}
	
	
	
}
