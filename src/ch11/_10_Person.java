package ch11;

import java.io.Serializable;

public class _10_Person implements Serializable {

	private static final long serialVersionUID = -1354635456331L;
	String name;
	String job;
	
	public _10_Person() {}
	public _10_Person(String name,String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name + "," + job;
	}
	
}
