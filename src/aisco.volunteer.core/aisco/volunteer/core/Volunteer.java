package aisco.volunteer.core;

import java.util.UUID;
import java.util.List;

public class Volunteer {
	private String name;
	private List<String> skills;
	private UUID ID;
	private int phone;
	private int hoursLogged;
	private boolean availability;
	private String status;

	public Volunteer(String name, List<String> skills, int phone, boolean availability, String status) {
		this.name = name;
		this.skills = skills;
		this.phone = phone;
		this.availability = availability;
		this.status = status;
		this.hoursLogged = 0;
		this.ID = UUID.randomUUID();
	}

	public void addLog(int hours) {
		this.hoursLogged += hours;
	}

	public void updateAvailibility(boolean availability) {
		this.availability = availability;
		System.out.print(availability);
	}
}