package edu.mum.cs472.model;

public class Room {
	private String id;
	private String type;
	private double price;
	private String view;

	public Room(String id, String type, double price, String view) {
		this.id = id;
		this.type = type;
		this.price = price;
		this.view = view;
	}

	public Room() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
}
