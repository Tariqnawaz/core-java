package DesignPattern.abstractFactory.abstractFactoryAnimalExample1;

public class SeaFactory implements AnimalFactory {

	public Animal createAnimal() {
		return new Shark();
	}

}
