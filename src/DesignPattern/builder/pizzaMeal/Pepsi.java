package DesignPattern.builder.pizzaMeal;

import DesignPattern.builder.pizzaMeal.ColdDrink;

abstract class Pepsi extends ColdDrink {  
	  
    @Override  
    public abstract  String name();  
  
    @Override  
    public abstract  String size();  
      
    @Override  
    public abstract  float price();   
      
}// End of the Pepsi class
