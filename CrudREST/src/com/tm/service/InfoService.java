package com.tm.service;

import java.security.Principal;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.SecurityContext;

@Path("/info")
public class InfoService implements SecurityContext{

	public InfoService() {
		// TODO Auto-generated constructor stub
	}
	@GET
	@Path("/cookie")
	public String getInformation(@Context Cookie cookie){
		return cookie.getName();
		
	}
	@GET
	@Path("/headers")
	public String getInformation(@Context HeaderParam header){
		return header.value();
		
	}
	@Override
	public String getAuthenticationScheme() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Principal getUserPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isSecure() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isUserInRole(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
