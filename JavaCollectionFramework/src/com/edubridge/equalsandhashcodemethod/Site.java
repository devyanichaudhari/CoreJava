package com.edubridge.equalsandhashcodemethod;

import java.util.Objects;

// Program to demonstrate on equals() method
public class Site {
	private String name;
	private Integer id;
	
	// overriding hashCode() and equals() method
	
	// Only using hashCode() method, when we compare two objects, 
	// we will not get the comparison as true... for that we need 
	// to override equals method
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	// Only using equals() method, when we compare two objects, 
	// we will not get the comparison as true... for that we need 
	// to override equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Site other = (Site) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	public Site(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

}