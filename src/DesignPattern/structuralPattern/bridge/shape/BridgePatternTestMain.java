package DesignPattern.structuralPattern.bridge.shape;

public class BridgePatternTestMain {
	 
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
         
        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
 
}
