package com.project.animals;

import java.util.Objects;

/*
 * Java entity to create animals with type Horse
 */
public class Horse extends Animal{
	
	public String place;

	public String getPlace() {
		return place;
	}

	public Horse(String name, double age, String place) {
		super(place, age);
		this.place = place;
		this.place = place;
	}

	@Override
	public int hashCode() {
		return Objects.hash(place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Horse other = (Horse) obj;
		return Objects.equals(place, other.place);
	}

	@Override
	public String toString() {
		return "Horse [place=" + place + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
