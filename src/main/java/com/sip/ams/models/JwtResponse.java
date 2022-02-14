package com.sip.ams.models;
import java.io.Serializable;
import java.util.*;
import com.sip.ams.entities.Role;
public class JwtResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String jwttoken;
	private final String fname;
	private final String lname;
	private final String temp;
	private final Set<Role> role;

	public JwtResponse(String jwttoken, String fname, String lname, Set<Role> role,String temp) {
		this.jwttoken = jwttoken;
		this.fname = fname;
		this.lname = lname;
		this.role = role;
		this.temp = temp;
	}

	public String getTemp() {
		return temp;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Set<Role> getRole() {
		return role;
	}


	
	
	

	/*public String getToken() {
		return this.jwttoken + " "+ this.name +" "+this.role;
	}*/
}