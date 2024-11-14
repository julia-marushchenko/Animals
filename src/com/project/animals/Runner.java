package com.project.animals;

/*
 *  Java class to start a program
 */
public class Runner {
	
	public static void main(String [] str) {

	// Creating animal shark
	Animal animal = new Animal("Shark", 2.5);
	// Printing information about shark to console
	System.out.println(animal);
	
	// Creating animal crow
	Animal animal1 = new Animal("Crow", 11);
	// Printing information about shark to console
	System.out.println(animal1);
	
	// Creating animal horse
	Animal animal2 = new Horse("Sally", 4, "La Cartassa");
	// Printing information about shark to console
	System.out.println(animal2);
	
	// Creating animal horse
	Horse animal3 = new Horse("Cobey", 2.1, "Stuttgart");
	// Printing information about shark to console
	System.out.println(animal3);
	
	//Calling method move from super class
	System.out.println(animal1.move());
	
	//Calling method move from sub class
	System.out.println(animal3.move());
	
	//Calling method move from sub class with type of super one
	System.out.println(animal2.move());
	
	//Calling animal by name given from the beginning
	System.out.println(animal1.getName());
	
	//Calling animal by name given from the beginning
	System.out.println(animal2.getName());
		
	//Calling animal by name given from the beginning
	System.out.println(animal3.getName());
	
	}
}
