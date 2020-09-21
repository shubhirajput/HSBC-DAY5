package com.demo.io.q1;

public class Stud {

	int StId;
	String name;
	public int getStId() {
		return StId;
	}
	public void setStId(int stId) {
		StId = stId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Stud(int StId,String s)
	{
		this.name=s;
		this.StId=StId;
		
	}
}
