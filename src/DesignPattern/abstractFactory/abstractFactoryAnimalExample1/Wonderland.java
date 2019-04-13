package DesignPattern.abstractFactory.abstractFactoryAnimalExample1;

public class Wonderland {
	public Wonderland(AnimalFactory factory) {
		Animal animal = factory.createAnimal();
		animal.breathe();
	}
}
