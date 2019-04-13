package DesignPattern.structuralPattern.decorator.car;

/*Component Implementation – The basic implementation of the component interface. We can have BasicCar class as our component impleme-
 * ntation.
*/
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}

}