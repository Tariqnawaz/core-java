package DesignPattern.abstractFactory.abstractFactoryCarExample1;

public class LuxuryCar extends Car
{
    public LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println(" LuxuryCar.. LuxuryCar..");
        //add accessories
    }
}