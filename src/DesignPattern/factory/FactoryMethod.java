package DesignPattern.factory;

import java.util.Scanner;

/* what is factory method pattern ?
 * When a method returns one of several possible classes that share a common super class . The class chooses at run time that is call Factory method
 * 
 * when to use a factory method pattern ?
 * 1. when you don't know ahead of time what class object you need 
 * 2. when all of the potential classes are in the same hierarchy
 * 3. To centralized class selection code.
 * 4. when you don't want the user to have to know every subclass 
 * 5. To encapsulate object creation. 
 * */

public class FactoryMethod {
	public static void main(String[] args){
		/* 
		 * With out using factory pattern this is how previously object used to initialized dynamically
		 * this is not the factory pattern
		 * Below code show lots of if and else condition but this is dynamic , however this code doesn't close for being modifying and that is bad. 
		 * 
		 */
		
		/*EnemyShip enemy = null;
		
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of ship ? ( U / R )");
		
		if(userInput.hasNextLine()){
			enemyShipOption = userInput.nextLine();
		}
		
		if(enemyShipOption.equals("U")){
			enemy = new UFOEnemyShip();
		}else if(enemyShipOption.equals("R")){
			enemy = new RocketEnemyShip();
		}
		
		doStuffEnemy(enemy);*/
		
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip enemy = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship ? ( U / R / B )");
		
		if(userInput.hasNextLine()){
			String typeOfEnemy = userInput.nextLine();
			enemy = shipFactory.makeEnemyShip(typeOfEnemy);
		}
		if(enemy!=null){
			doStuffEnemy(enemy);
		}else{
			System.out.println("Enter  U / R / B only..... ");
		}
		
	}
	
	public static void doStuffEnemy(EnemyShip enemy){
		enemy.displayEnemyShip();
		enemy.followHeroShip();
		enemy.enemyShipShoots();
	}
}
