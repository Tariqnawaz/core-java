package DesignPattern.abstractFactory.abstractFactoryAnimalExample1;

public class LandFactory implements AnimalFactory {
	public Animal createAnimal() {
		return new Elephant();
	}
}
