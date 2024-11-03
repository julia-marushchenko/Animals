package com.project.animals;

import java.util.Objects;

/*
 * Java class to create animals generally
 */
public class Animal {
	
	public String name;
	public double age;
	
	public Animal(String string, double d) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Double.doubleToLongBits(age) == Double.doubleToLongBits(other.age) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
