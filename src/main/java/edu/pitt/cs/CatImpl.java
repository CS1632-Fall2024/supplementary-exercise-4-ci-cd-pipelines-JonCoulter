package edu.pitt.cs;

public class CatImpl implements Cat {

	private String name;
	private int id;
	private boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	public void rentCat() {
		if(rented) {
			// error
		}
		rented = true;
	}

	public void returnCat() {
		if(!rented) {
			// error
		}
		rented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		return "ID " + id + ". " + name;
	}

}