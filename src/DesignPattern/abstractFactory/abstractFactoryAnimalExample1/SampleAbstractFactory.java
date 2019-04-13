package DesignPattern.abstractFactory.abstractFactoryAnimalExample1;

public class SampleAbstractFactory {

	public static void main(String args[]){
		new Wonderland(createAnimalFactory("water"));
	}

	public static AnimalFactory createAnimalFactory(String type){
		if("water".equals(type))
			return new SeaFactory();
		else
			return new LandFactory();
	}
}