package DesignPattern.structuralPattern.bridge.vehicle;

/**
 * Concrete implementation 2 for bridge pattern
 * */
public class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.println(" Assembled.");
	}

}