package DesignPattern.builder.pizzaMeal;

import DesignPattern.builder.pizzaMeal.OrderBuilder;
import DesignPattern.builder.pizzaMeal.OrderedItems;

import java.io.IOException;


class BuilderDemoMain {  
	  
    public static void main(String[] args) throws IOException {  
        // TODO code application logic here  
          
        OrderBuilder builder=new OrderBuilder();  
          
        OrderedItems orderedItems=builder.preparePizza();  
          
        orderedItems.showItems();  
          
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getCost());  
          
    }  
}// End of the BuilderDemo class 
