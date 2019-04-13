package DesignPattern.factory.carExample1;

public class CarFactoryMain {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));	
	}
}
