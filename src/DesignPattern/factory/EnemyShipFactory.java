package DesignPattern.factory;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip enemyShip = null;
		
		if(newShipType.equalsIgnoreCase("U")){
			enemyShip = new UFOEnemyShip();
		}else
		if(newShipType.equalsIgnoreCase("R")){
		enemyShip = new RocketEnemyShip();
		}else
		if(newShipType.equalsIgnoreCase("B")){
		enemyShip = new BigUFOEnemyShip();	
		}else return null;
		return enemyShip;	
		
		
	}
}
