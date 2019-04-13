package DesignPattern.structuralPattern.adapter.bank;

//This is the client class.  
public class AdapterPatternDemoMain {  
public static void main(String args[]){  
CreditCard targetInterface=new BankCustomer();  
targetInterface.giveBankDetails();  
System.out.print(targetInterface.getCreditCard());  
}   
}//End of the BankCustomer class.  