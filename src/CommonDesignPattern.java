import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;


public class CommonDesignPattern {
	
}

/* Calculate Electricity Bill : A Real World Example of Factory Method */
abstract class Plan{  
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}//end of Plan class. 


class  DomesticPlan extends Plan{  
    //@override  
     public void getRate(){  
         rate=3.50;              
    }  
}//end of DomesticPlan class.  

class  CommercialPlan extends Plan{  
   //@override   
    public void getRate(){   
        rate=7.50;  
   }
}	    
//end of CommercialPlan class. 
class  InstitutionalPlan extends Plan{  
   //@override  
    public void getRate(){   
        rate=5.50;  
   } 
}	    
//end of InstitutionalPlan class. 

class GetPlanFactory{  
    //use getPlan method to get object of type Plan   
        public Plan getPlan(String planType){  
             if(planType == null){  
              return null;  
             }  
           if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
                  return new DomesticPlan();  
                }   
            else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
                 return new CommercialPlan();  
             }   
           else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
                 return new InstitutionalPlan();  
           }  
       return null;  
    }  
 }//end of GetPlanFactory class.  
class GenerateBill{  
    public static void main(String args[])throws IOException{  
      GetPlanFactory planFactory = new GetPlanFactory();  
        
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String planName=br.readLine();  
      System.out.print("Enter the number of units for bill will be calculated: ");  
      int units=Integer.parseInt(br.readLine());  
  
      Plan p = planFactory.getPlan(planName);  
      //call getRate() method and calculateBill()method of DomesticPaln.  
  
       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
       p.getRate();  
       p.calculateBill(units);  
   }  
}//end of GenerateBill class. 

/* ************************** Example of Abstract Factory Pattern *******************************************/

interface Bank{  
    String getBankName();  
} 

class HDFC implements Bank{  
    private final String BNAME;  
    public HDFC(){  
           BNAME="HDFC BANK";  
   }  
   public String getBankName() {  
             return BNAME;  
   }  
} 

class ICICI implements Bank{  
    private final String BNAME;  
    ICICI(){  
             BNAME="ICICI BANK";  
     }  
     public String getBankName() {  
               return BNAME;  
    }  
}  

class SBI implements Bank{  
    private final String BNAME;  
    public SBI(){  
              BNAME="SBI BANK";  
      }  
     public String getBankName(){  
                return BNAME;  
     }  
}  

abstract class Loan{  
   protected double rate;  
   abstract void getInterestRate(double rate);  
   public void calculateLoanPayment(double loanamount, int years)  
   {  
/* 
              to calculate the monthly loan payment i.e. EMI   
                            
              rate=annual interest rate/12*100; 
              n=number of monthly installments;            
              1year=12 months. 
              so, n=years*12; 
 
            */  
                
         double EMI;  
         int n;  
  
         n=years*12;  
         rate=rate/1200;  
         EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
  
  System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");     
   }  
}// end of the Loan abstract class. 

class HomeLoan extends Loan{  
    public void getInterestRate(double r){  
        rate=r;  
   }  
}//End of the HomeLoan class. 

class BussinessLoan extends Loan{  
    public void getInterestRate(double r){  
          rate=r;  
     }  
  
}//End of the BusssinessLoan class.  

class EducationLoan extends Loan{  
    public void getInterestRate(double r){  
      rate=r;  
}  
}//End of the EducationLoan class.  

abstract class AbstractFactory{  
    public abstract Bank getBank(String bank);  
    public abstract Loan getLoan(String loan);  
  }  

class BankFactory extends AbstractFactory{  
	   public Bank getBank(String bank){  
	      if(bank == null){  
	         return null;  
	      }  
	      if(bank.equalsIgnoreCase("HDFC")){  
	         return new HDFC();  
	      } else if(bank.equalsIgnoreCase("ICICI")){  
	         return new ICICI();  
	      } else if(bank.equalsIgnoreCase("SBI")){  
	         return new SBI();  
	      }  
	      return null;  
	   }  
	  public Loan getLoan(String loan) {  
	      return null;  
	   }  
	}//End of the BankFactory class. 

class LoanFactory extends AbstractFactory{  
    public Bank getBank(String bank){  
         return null;  
   }  
 
public Loan getLoan(String loan){  
if(loan == null){  
  return null;  
}  
if(loan.equalsIgnoreCase("Home")){  
  return new HomeLoan();  
} else if(loan.equalsIgnoreCase("Business")){  
  return new BussinessLoan();  
} else if(loan.equalsIgnoreCase("Education")){  
  return new EducationLoan();  
}  
return null;  
}  

}  

class FactoryCreator {  
    public static AbstractFactory getFactory(String choice){  
     if(choice.equalsIgnoreCase("Bank")){  
        return new BankFactory();  
     } else if(choice.equalsIgnoreCase("Loan")){  
        return new LoanFactory();  
     }  
     return null;  
  }  
}//End of the FactoryCreator.  

class AbstractFactoryPatternExample {  
    public static void main(String args[])throws IOException {  
     
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

    System.out.print("Enter the name of Bank from where you want to take loan amount: ");  
    String bankName=br.readLine();  

System.out.print("\n");  
System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");  

String loanName=br.readLine();  
AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
Bank b=bankFactory.getBank(bankName);  

System.out.print("\n");  
System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");  

double rate=Double.parseDouble(br.readLine());  
System.out.print("\n");  
System.out.print("Enter the loan amount you want to take: ");  

double loanAmount=Double.parseDouble(br.readLine());  
System.out.print("\n");  
System.out.print("Enter the number of years to pay your entire loan amount: ");  
int years=Integer.parseInt(br.readLine());  

System.out.print("\n");  
System.out.println("you are taking the loan from "+ b.getBankName());  

AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
         Loan l=loanFactory.getLoan(loanName);  
         l.getInterestRate(rate);  
         l.calculateLoanPayment(loanAmount,years);  
}  
}//End of the  AbstractFactoryPatternExample  

/* *************************************************Singleton Pattern ***************************************/
//Understanding early Instantiation of Singleton Pattern
class A{  
 private static A obj=new A();//Early, instance will be created at load time  
 private A(){}  
   
 public static A getA(){  
  return obj;  
 }  
  
 public void doSomething(){  
 //write your code  
 }  
} 

//Understanding lazy Instantiation of Singleton Pattern
class AA{  
    private static AA obj;  
    private AA(){}  
      
    public static AA getA(){  
      if (obj == null){  
         synchronized(AA.class){  
           if (obj == null){  
               obj = new AA();//instance will be created at request time  
           }  
       }              
       }  
     return obj;  
    }  
     
    public void doSomething(){  
    //write your code  
    }  
   }  

//Significance of Classloader in Singleton Pattern
//Significance of Serialization in Singleton Pattern

class AB implements Serializable {  
    //your code of singleton  
    protected Object readResolve() {  
        return getAB();  
    }  
}

/**************************** Prototype Design Pattern  *************************************************/
interface Prototype {  
    public Prototype getClone();  
}//End of Prototype interface.

class EmployeeRecord implements Prototype{  
    
    private int id;  
    private String name, designation;  
    private double salary;  
    private String address;  
       
    public EmployeeRecord(){  
     System.out.println("   Employee Records of Oracle Corporation ");  
     System.out.println("---------------------------------------------");  
     System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
    }  
   
  public  EmployeeRecord(int id, String name, String designation, double salary, String address) {  
       
     this();  
     this.id = id;  
     this.name = name;  
     this.designation = designation;  
     this.salary = salary;  
     this.address = address;  
     }  
       
   public void showRecord(){  
       System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
    }  
   
     @Override  
     public Prototype getClone() {  
       return new EmployeeRecord(id,name,designation,salary,address);  
     }  
 }//End of EmployeeRecord class.

class PrototypeDemo{  
    public static void main(String[] args) throws IOException {  
         
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
       System.out.print("Enter Employee Id: ");  
       int eid=Integer.parseInt(br.readLine());  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Name: ");  
       String ename=br.readLine();  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Designation: ");  
       String edesignation=br.readLine();  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Address: ");  
       String eaddress=br.readLine();  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Salary: ");  
       double esalary= Double.parseDouble(br.readLine());  
       System.out.print("\n");  
          
       EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
         
       e1.showRecord();  
       System.out.println("\n");  
       EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
       e2.showRecord();  
   }     
}//End of the ProtoypeDemo class.  


/****************************************Example of Builder Design Pattern**********************************/
interface Packing {  
    public String pack();  
    public int price();  
} 

abstract class CD implements Packing{  
public abstract String pack();  
}  

abstract class Company extends CD{  
   public abstract int price();  
}  

class Sony extends Company{  
    @Override  
        public int price(){   
                        return 20;  
      }  
    @Override  
    public String pack(){  
             return "Sony CD";  
        }         
}//End of the Sony class. 

class Samsung extends Company {  
    @Override  
        public int price(){   
                        return 15;  
    }  
    @Override  
    public String pack(){  
             return "Samsung CD";  
        }         
}//End of the Samsung class.

class CDType {  
    private List<Packing> items=new ArrayList<Packing>();  
    public void addItem(Packing packs) {    
           items.add(packs);  
    }  
    public void getCost(){  
     for (Packing packs : items) {  
               packs.price();  
     }   
    }  
    public void showItems(){  
     for (Packing packing : items){  
    System.out.print("CD name : "+packing.pack());  
    System.out.println(", Price : "+packing.price());  
 }       
   }     
}//End of the CDType class.  

class CDBuilder {  
    public CDType buildSonyCD(){   
      CDType cds=new CDType();  
      cds.addItem(new Sony());  
      return cds;  
    }  
    public CDType buildSamsungCD(){  
      CDType cds=new CDType();  
      cds.addItem(new Samsung());  
      return cds;  
    }  
}// End of the CDBuilder class.  

class BuilderDemo{  
	 public static void main(String args[]){  
	   CDBuilder cdBuilder=new CDBuilder();  
	   CDType cdType1=cdBuilder.buildSonyCD();  
	   cdType1.showItems();  
	  
	   CDType cdType2=cdBuilder.buildSamsungCD();  
	   cdType2.showItems();  
	 }  
	}  

/*Another Real world example of Builder Pattern*/

interface  Item   
{  
   public String name();  
    public String size();  
    public float price();  
}// End of the interface Item.  

abstract class Pizza implements Item{  
    @Override  
    public abstract float price();  
}   

abstract class ColdDrink implements Item{  
	 @Override  
	 public abstract float price();
}

abstract class VegPizza extends Pizza{  
    @Override  
    public abstract float price();  
    @Override  
    public abstract  String name();  
    @Override  
    public abstract  String size();  
}// End of the abstract class VegPizza. 

abstract class NonVegPizza extends Pizza{  
    @Override  
    public abstract float price();  
    @Override  
    public abstract String name();  
    @Override  
    public abstract String size();  
}// End of the abstract class NonVegPizza.  

class SmallCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 170.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
       return "Small size";  
    }    
}// End of the SmallCheezePizza class.

class MediumCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
       return  220.f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
     return "Medium Size";  
 }  
}// End of the MediumCheezePizza class.  
 
class LargeCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 260.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
}// End of the LargeCheezePizza class.  

class ExtraLargeCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 300.f;  
    }  
    @Override  
    public String name() {  
        return  "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
        return "Extra-Large Size";  
    }  
}// End of the ExtraLargeCheezePizza class. 

class SmallOnionPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 120.0f;  
    }  
    @Override  
    public String name() {  
        return  "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Small Size";  
    }    
}// End of the SmallOnionPizza class.  

class MediumOnionPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 150.0f;  
    }  
   @Override  
    public String name() {  
        return  "Onion Pizza";  
    }  
   @Override  
    public String size() {  
       return  "Medium Size";  
    }    
}// End of the MediumOnionPizza class.

class LargeOnionPizza extends  VegPizza{  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
    @Override  
    public String name() {  
         return "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Large size";  
    }  
}// End of the LargeOnionPizza class.  

class ExtraLargeOnionPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 200.0f;  
    }  
    @Override  
    public String name() {  
         return  "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Extra-Large Size";  
    }  
}// End of the ExtraLargeOnionPizza class  

class SmallMasalaPizza extends VegPizza{  
    @Override  
    public float price() {  
        return 100.0f;  
    }  
    @Override  
    public String name() {  
        return  "Masala Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Samll Size";  
    }  
}// End of the SmallMasalaPizza class  

class MediumMasalaPizza extends VegPizza {  
    
    @Override  
    public float price() {  
        return 120.0f;  
    }  
  
    @Override  
    public String name() {  
      
        return  "Masala Pizza";  
      
    }  
  
    @Override  
    public String size() {  
       return  "Medium Size";  
    }  
}   

class LargeMasalaPizza extends  VegPizza{  
    @Override  
    public float price() {  
        return 150.0f;  
    }  
  
    @Override  
    public String name() {  
      
        return  "Masala Pizza";  
      
    }  
  
    @Override  
    public String size() {  
       return  "Large Size";  
    }  
} //End of the LargeMasalaPizza class  

class ExtraLargeMasalaPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
  
    @Override  
    public String name() {  
      
        return  "Masala Pizza";  
      
    }  
  
    @Override  
    public String size() {  
       return  "Extra-Large Size";  
    }  
}// End of the ExtraLargeMasalaPizza class   

class SmallNonVegPizza extends NonVegPizza {  
	  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Samll Size";  
    }  
      
}// End of the SmallNonVegPizza class  

class MediumNonVegPizza extends NonVegPizza{  
    
    @Override  
    public float price() {  
        return 200.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Medium Size";  
    }  
}    

class LargeNonVegPizza extends NonVegPizza{  
    
    @Override  
    public float price() {  
        return 220.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
      
}// End of the LargeNonVegPizza class  
    
class ExtraLargeNonVegPizza extends NonVegPizza {  
    @Override  
    public float price() {  
        return 250.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Extra-Large Size";  
    }  
}  
// End of the ExtraLargeNonVegPizza class 

abstract class Pepsi extends ColdDrink {  
	  
    @Override  
    public abstract  String name();  
  
    @Override  
    public abstract  String size();  
      
    @Override  
    public abstract  float price();   
      
}// End of the Pepsi class 

abstract class Coke  extends ColdDrink {  
	  
    @Override  
    public abstract  String name();  
  
    @Override  
    public abstract  String size();  
      
    @Override  
    public abstract  float price();   
      
}// End of the Coke class  
  
class SmallPepsi  extends Pepsi{  
  
    @Override  
    public String name() {  
       return "300 ml Pepsi";  
    }  
  
    @Override  
    public float price() {  
        return 25.0f;  
    }  
  
    @Override  
    public String size() {  
        return "Small Size";  
    }     
}// End of the SmallPepsi class  

class MediumPepsi extends Pepsi {  
    
    @Override  
    public String name() {  
       return "500 ml Pepsi";  
    }  
  
    @Override  
    public String size() {  
        return "Medium Size";  
    }  
  
    @Override  
    public float price() {  
        return 35.0f;  
    }      
}// End of the MediumPepsi class

class LargePepsi extends Pepsi{  
    @Override  
    public String name() {  
       return "750 ml Pepsi";  
    }  
  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
  
    @Override  
    public float price() {  
        return 50.0f;  
    }  
}// End of the LargePepsi class 

class SmallCoke extends Coke{  
    
    @Override  
    public String name() {  
         return "300 ml Coke";    
    }  
  
    @Override  
    public String size() {  
         
        return "Small Size";  
    }  
  
    @Override  
    public float price() {  
      
        return  25.0f;  
    }  
 }// End of the SmallCoke class  

class MediumCoke extends Coke{  
    
    @Override  
    public String name() {  
         return "500 ml Coke";    
    }  
  
    @Override  
    public String size() {  
         
        return "Medium Size";  
    }  
  
    @Override  
    public float price() {  
      
        return  35.0f;  
   }  
}// End of the MediumCoke class  

class LargeCoke extends Coke {  
    @Override  
   public String name() {  
        return "750 ml Coke";    
   }  
 
   @Override  
   public String size() {  
        
       return "Large Size";  
   }  
 
   @Override  
   public float price() {  
     
       return  50.0f;  
   }      
}// End of the LargeCoke class  
 

class OrderedItems {  
    
   List<Item> items=new ArrayList<Item>();  
     
   public void addItems(Item item){  
         
       items.add(item);  
   }  
   public float getCost(){  
         
       float cost=0.0f;  
           for (Item item : items) {  
               cost+=item.price();  
            }  
       return cost;  
   }  
   public void showItems(){  
         
       for (Item item : items) {  
           System.out.println("Item is:" +item.name());  
           System.out.println("Size is:" +item.size());  
           System.out.println("Price is: " +item.price());  
             
       }  
   }  
    
}// End of the OrderedItems class 

class OrderBuilder {  
    public OrderedItems preparePizza() throws IOException{  
          
        OrderedItems itemsOrder=new OrderedItems();  
         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
          
        System.out.println(" Enter the choice of Pizza ");  
        System.out.println("============================");  
        System.out.println("        1. Veg-Pizza       ");  
        System.out.println("        2. Non-Veg Pizza   ");  
        System.out.println("        3. Exit            ");  
        System.out.println("============================");  
          
        int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());  
        switch(pizzaandcolddrinkchoice)  
        {  
           case 1:{  
                       
                     System.out.println("You ordered Veg Pizza");  
                     System.out.println("\n\n");  
                     System.out.println(" Enter the types of Veg-Pizza ");  
                     System.out.println("------------------------------");  
                     System.out.println("        1.Cheeze Pizza        ");  
                     System.out.println("        2.Onion Pizza        ");  
                     System.out.println("        3.Masala Pizza        ");  
                     System.out.println("        4.Exit            ");  
                     System.out.println("------------------------------");  
                                  int vegpizzachoice=Integer.parseInt(br.readLine());  
                     switch(vegpizzachoice)  
                     {  
                          case 1:  
                                {  
                                    System.out.println("You ordered Cheeze Pizza");  
                                      
                                    System.out.println("Enter the cheeze pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Cheeze Pizza ");  
                                    System.out.println("    2. Medium Cheeze Pizza ");  
                                    System.out.println("    3. Large Cheeze Pizza ");  
                                    System.out.println("    4. Extra-Large Cheeze Pizza ");  
                                    System.out.println("------------------------------------");  
                                    int cheezepizzasize=Integer.parseInt(br.readLine());  
                                    switch(cheezepizzasize)  
                                        {  
                                              case 1:  
                                                   itemsOrder.addItems(new SmallCheezePizza());  
                                                   break;  
                                             case 2:  
                                                   itemsOrder.addItems(new MediumCheezePizza());  
                                                   break;    
                                             case 3:  
                                                   itemsOrder.addItems(new LargeCheezePizza());  
                                                   break;    
                                             case 4:  
                                                   itemsOrder.addItems(new ExtraLargeCheezePizza());  
                                                   break;      
                          case 2:  
                                {  
                                    System.out.println("You ordered Onion Pizza");  
                                    System.out.println("Enter the Onion pizza size");  
                                    System.out.println("----------------------------------");  
                                    System.out.println("    1. Small Onion Pizza ");  
                                    System.out.println("    2. Medium Onion Pizza ");  
                                    System.out.println("    3. Large Onion Pizza ");  
                                    System.out.println("    4. Extra-Large Onion Pizza ");  
                                    System.out.println("----------------------------------");  
                                    int onionpizzasize=Integer.parseInt(br.readLine());  
                                    switch(onionpizzasize)  
                                              {  
                                                  case 1:  
                                                   itemsOrder.addItems(new SmallOnionPizza());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrder.addItems(new MediumOnionPizza());  
                                                   break;    
                                                     
                                                  case 3:  
                                                   itemsOrder.addItems(new LargeOnionPizza());  
                                                   break;    
                                                        
                                                  case 4:  
                                                   itemsOrder.addItems(new ExtraLargeOnionPizza());  
                                                   break;        
                                                        
                                              }       
                                   }  
                                break;  
                          case 3:  
                                {  
                                    System.out.println("You ordered Masala Pizza");  
                                    System.out.println("Enter the Masala pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Masala Pizza ");  
                                    System.out.println("    2. Medium Masala Pizza ");   
                                    System.out.println("    3. Large Masala Pizza ");  
                                    System.out.println("    4. Extra-Large Masala Pizza ");  
                                    System.out.println("------------------------------------");  
                                                  int masalapizzasize=Integer.parseInt(br.readLine());  
                                        switch(masalapizzasize)  
                                              {  
                                                  case 1:  
                                                   itemsOrder.addItems(new SmallMasalaPizza());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrder.addItems(new MediumMasalaPizza());  
                                                   break;    
                                                     
                                                  case 3:  
                                                   itemsOrder.addItems(new LargeMasalaPizza());  
                                                   break;    
                                                        
                                                  case 4:  
                                                   itemsOrder.addItems(new ExtraLargeMasalaPizza());  
                                                   break;        
                                                        
                                              }       
                                   
                                }  
                                break;      
                           
                     }      
                  
                   }  
                   break;// Veg- pizza choice completed.  
                  
            case 2:  
                   {  
                       System.out.println("You ordered Non-Veg Pizza");  
                       System.out.println("\n\n");  
                         
                                    System.out.println("Enter the Non-Veg pizza size");  
                                    System.out.println("------------------------------------");  
                                    System.out.println("    1. Small Non-Veg  Pizza ");  
                                    System.out.println("    2. Medium Non-Veg  Pizza ");  
                                    System.out.println("    3. Large Non-Veg  Pizza ");  
                                    System.out.println("    4. Extra-Large Non-Veg  Pizza ");  
                                    System.out.println("------------------------------------");  
                                      
                         
                       int nonvegpizzasize=Integer.parseInt(br.readLine());   
                        
                        switch(nonvegpizzasize)  
                             {  
                                 
                                  case 1:  
                                      itemsOrder.addItems(new SmallNonVegPizza());  
                                      break;  
                                                      
                                  case 2:  
                                      itemsOrder.addItems(new MediumNonVegPizza());  
                                      break;    
                                                     
                                  case 3:  
                                      itemsOrder.addItems(new LargeNonVegPizza());  
                                      break;    
                                                        
                                  case 4:  
                                      itemsOrder.addItems(new ExtraLargeNonVegPizza());  
                                      break;        
                              }  
                                      
                       }    
                        break;  
            default:  
            {  
                  break;  
                  
            }  
                  
 }//end of main Switch  
  
                    //continued?..  
        System.out.println(" Enter the choice of ColdDrink ");  
        System.out.println("============================");  
        System.out.println("        1. Pepsi            ");  
        System.out.println("        2. Coke             ");  
        System.out.println("        3. Exit             ");  
        System.out.println("============================");    
                    int coldDrink=Integer.parseInt(br.readLine());  
        switch (coldDrink)   
            {  
               case 1:  
                                {  
                                    System.out.println("You ordered Pepsi ");  
                                    System.out.println("Enter the  Pepsi Size ");  
                                    System.out.println("------------------------");  
                                    System.out.println("    1. Small Pepsi ");  
                                    System.out.println("    2. Medium Pepsi ");  
                                    System.out.println("    3. Large Pepsi ");  
                                    System.out.println("------------------------");  
                                              int pepsisize=Integer.parseInt(br.readLine());  
                                    switch(pepsisize)  
                                              {  
                                                  case 1:  
                                                   itemsOrder.addItems(new SmallPepsi());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrder.addItems(new MediumPepsi());  
                                                   break;    
                                                     
                                                  case 3:  
                                                   itemsOrder.addItems(new LargePepsi());  
                                                   break;    
                                                        
                                                }  
                                 }    
                                break;  
                         case 2:  
                                {  
                                    System.out.println("You ordered Coke");  
                                    System.out.println("Enter the Coke Size");  
                                    System.out.println("------------------------");  
                                    System.out.println("    1. Small Coke ");  
                                    System.out.println("    2. Medium Coke  ");  
                                    System.out.println("    3. Large Coke  ");  
                                    System.out.println("    4. Extra-Large Coke ");  
                                    System.out.println("------------------------");  
                                      
                                    int cokesize=Integer.parseInt(br.readLine());  
                                    switch(cokesize)  
                                              {  
                                                  case 1:  
                                                   itemsOrder.addItems(new SmallCoke());  
                                                   break;  
                                                      
                                                  case 2:  
                                                   itemsOrder.addItems(new MediumCoke());  
                                                   break;    
                                                     
                                                  case 3:  
                                                   itemsOrder.addItems(new LargeCoke());  
                                                   break;    
                                                        
                                                    
                                              }       
                                   
                                }  
                                break;  
                     default:  
                                      {  
                                                   break;  
                  
                                      }          
                           
                               }//End of the Cold-Drink switch  
                  return itemsOrder;  
  
          } //End of the preparePizza() method
        }
    }
}

class BuilderDemo1 {  
	  
    public static void main(String[] args) throws IOException {  
        // TODO code application logic here  
          
        OrderBuilder builder=new OrderBuilder();  
          
        OrderedItems orderedItems=builder.preparePizza();  
          
        orderedItems.showItems();  
          
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getCost());  
          
    }  
}// End of the BuilderDemo class 


/***************************************************Example of Object Pool Pattern: ********************************************/

abstract class ObjectPool<T> {  
/* 
  pool implementation is based on ConcurrentLinkedQueue from the java.util.concurrent package. 
  ConcurrentLinkedQueue is a thread-safe queue based on linked nodes.  
   Because the queue follows FIFO technique (first-in-first-out). 
 */          
      
   private ConcurrentLinkedQueue<T> pool;  
         
 /*  
   
   ScheduledExecutorService starts a special task in a separate thread and observes 
   the minimum and maximum number of objects in the pool periodically in a specified  
    time (with parameter validationInterval).  
   When the number of objects is less than the minimum, missing instances will be created.  
   When the number of objects is greater than the maximum, too many instances will be removed.  
   This is sometimes useful for the balance of memory consuming objects in the pool. 
*/  
    private ScheduledExecutorService executorService;  
       /* 
     * Creates the pool. 
     * 
     * @param minObjects : the minimum number of objects residing in the pool 
     */  
       
    public ObjectPool(final int minObjects)   
    {  
        // initialize pool  
          
        initialize(minObjects);  
          
    }  
      
    /* 
      Creates the pool. 
      @param minObjects:   minimum number of objects residing in the pool. 
      @param maxObjects:   maximum number of objects residing in the pool. 
      @param validationInterval: time in seconds for periodical checking of  
         minObjects / maxObjects conditions in a separate thread. 
      When the number of objects is less than minObjects, missing instances will be created. 
      When the number of objects is greater than maxObjects, too many instances will be removed. 
    */  
     public ObjectPool(final int minObjects, final int maxObjects, final long validationInterval) {  
        // initialize pool  
         initialize(minObjects);  
          // check pool conditions in a separate thread  
        executorService = Executors.newSingleThreadScheduledExecutor();  
        executorService.scheduleWithFixedDelay(new Runnable()  // annonymous class  
        {  
            @Override  
            public void run() {  
                int size = pool.size();  
                 
                if (size < minObjects) {  
                    int sizeToBeAdded = minObjects + size;  
                    for (int i = 0; i < sizeToBeAdded; i++) {  
                        pool.add(createObject());  
                    }  
                } else if (size > maxObjects) {  
                    int sizeToBeRemoved = size - maxObjects;  
                    for (int i = 0; i < sizeToBeRemoved; i++) {  
                        pool.poll();  
                    }  
                }  
            }  
        }, validationInterval, validationInterval, TimeUnit.SECONDS);  
    }  
      
  /* 
      Gets the next free object from the pool. If the pool doesn't contain any objects, 
      a new object will be created and given to the caller of this method back. 
      
      @return T borrowed object 
  */  
    public T borrowObject() {  
        T object;  
        if ((object = pool.poll()) == null)  
        {  
            object = createObject();  
        }  
        return object;  
    }  
 /* 
      Returns object back to the pool. 
      @param object object to be returned 
  */  
    public void returnObject(T object) {  
        if (object == null) {  
            return;  
        }  
        this.pool.offer(object);  
    }  
   /* 
        Shutdown this pool. 
    */  
      public void shutdown(){  
        if (executorService != null){  
            executorService.shutdown();  
        }  
    }  
    /* 
        Creates a new object. 
         @return T new object 
     */  
    protected abstract T createObject();  
  
    private void initialize(final int minObjects)  {  
        pool = new ConcurrentLinkedQueue<T>();  
        for (int i = 0; i < minObjects; i++) {  
            pool.add(createObject());  
        }  
    }  
}// End of the ObjectPool Class.  

class ExportingProcess {  
    private long processNo;  
     
       public ExportingProcess(long processNo)  {  
            this.processNo = processNo;  
           // do some  expensive calls / tasks here in future  
           // .........  
         System.out.println("Object with process no. " + processNo + " was created");  
        }  
        
       public long getProcessNo() {  
           return processNo;  
       }  
   }// End of the ExportingProcess class.  

class ExportingTask implements Runnable {  
    private ObjectPool<ExportingProcess> pool;  
    private int threadNo;  
    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo){  
        this.pool = pool;  
        this.threadNo = threadNo;  
    }  
  
    public void run() {  
        // get an object from the pool  
        ExportingProcess exportingProcess = pool.borrowObject();  
        System.out.println("Thread " + threadNo + ": Object with process no. "  
                + exportingProcess.getProcessNo() + " was borrowed");  

        //you can  do something here in future  
        // .........  

           // return ExportingProcess instance back to the pool  
        pool.returnObject(exportingProcess);  

        System.out.println("Thread " + threadNo +": Object with process no. "  
               + exportingProcess.getProcessNo() + " was returned");  
    }  

}// End of the ExportingTask class.

class ObjectPoolDemo{  
    private ObjectPool<ExportingProcess> pool;  
    private AtomicLong processNo=new AtomicLong(0);  
    public void setUp() {  
          // Create a pool of objects of type ExportingProcess.  
         /*Parameters: 
           1) Minimum number of special ExportingProcess instances residing in the pool = 4 
           2) Maximum number of special ExportingProcess instances residing in the pool = 10 
           3) Time in seconds for periodical checking of minObjects / maxObjects conditions 
              in a separate thread = 5. 
           -->When the number of ExportingProcess instances is less than minObjects,  
               missing instances will be created. 
           -->When the number of ExportingProcess instances is greater than maxObjects, 
                too many instances will be removed. 
          -->If the validation interval is negative, no periodical checking of  
                minObjects / maxObjects conditions in a separate thread take place. 
            These boundaries are ignored then. 
         */  
    pool = new ObjectPool<ExportingProcess>(4, 10, 5)  
      {  
          protected ExportingProcess createObject()  
          {  
              // create a test object which takes some time for creation  
              return new ExportingProcess( processNo.incrementAndGet());  
          }  
      };  
  }  
  public void tearDown() {  
      pool.shutdown();  
  }  
  public void testObjectPool() {  
      ExecutorService executor = Executors.newFixedThreadPool(8);  

      // execute 8 tasks in separate threads  
        
      executor.execute(new ExportingTask(pool, 1));  
      executor.execute(new ExportingTask(pool, 2));  
      executor.execute(new ExportingTask(pool, 3));  
      executor.execute(new ExportingTask(pool, 4));  
      executor.execute(new ExportingTask(pool, 5));  
      executor.execute(new ExportingTask(pool, 6));  
      executor.execute(new ExportingTask(pool, 7));  
      executor.execute(new ExportingTask(pool, 8));  

      executor.shutdown();  
      try {  
          executor.awaitTermination(30, TimeUnit.SECONDS);  
          } catch (InterruptedException e)  
            
            {  
             e.printStackTrace();  
            }  
  }  
  public static void main(String args[])  {   
      ObjectPoolDemo op=new ObjectPoolDemo();  
      op.setUp();  
      op.tearDown();  
      op.testObjectPool();  
 }   
}//End of the ObjectPoolDemo class.  

/******************************************* Example of Adapter Pattern ****************************************************/
/*
    Target Interface: This is the desired interface class which will be used by the clients.
    Adapter class: This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class.
    Adaptee class: This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use.
    Client: This class will interact with the Adapter class.
*/

//Create a CreditCard interface (Target interface).

interface CreditCard {  
    public void giveBankDetails();  
    public String getCreditCard();  
}// End of the CreditCard interface.  

// Create a BankDetails class (Adaptee class).
// This is the adapter class.  
class BankDetails{  
    private String bankName;  
    private String accHolderName;  
    private long accNumber;  
      
    public String getBankName() {  
        return bankName;  
    }  
    public void setBankName(String bankName) {  
        this.bankName = bankName;  
    }  
    public String getAccHolderName() {  
        return accHolderName;  
    }  
    public void setAccHolderName(String accHolderName) {  
        this.accHolderName = accHolderName;  
    }  
    public long getAccNumber() {  
        return accNumber;  
    }  
    public void setAccNumber(long accNumber) {  
        this.accNumber = accNumber;  
    }  
}// End of the BankDetails class.  

// Create a BankCustomer class (Adapter class).
class BankCustomer extends BankDetails implements CreditCard {  
	 public void giveBankDetails(){  
	  try{  
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      
	   System.out.print("Enter the account holder name :");  
	   String customername=br.readLine();  
	   System.out.print("\n");  
	      
	   System.out.print("Enter the account number:");  
	   long accno=Long.parseLong(br.readLine());  
	   System.out.print("\n");  
	      
	   System.out.print("Enter the bank name :");  
	   String bankname=br.readLine();  
	      
	   setAccHolderName(customername);  
	   setAccNumber(accno);  
	   setBankName(bankname);  
	   }catch(Exception e){  
	        e.printStackTrace();  
	   }  
	  }  
	  @Override  
	  public String getCreditCard() {  
	   long accno=getAccNumber();  
	   String accholdername=getAccHolderName();  
	   String bname=getBankName();  
	          
	   return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");  
	  }  
	}//End of the BankCustomer class. 

//Create a AdapterPatternDemo class (client class).
class AdapterPatternDemo {  
	 public static void main(String args[]){  
	  CreditCard targetInterface=new BankCustomer();  
	  targetInterface.giveBankDetails();  
	  System.out.print(targetInterface.getCreditCard());  
	 }   
	}//End of the BankCustomer class.  


/* ********************************************************Example of Bridge Pattern*************************************************/
/*
    When you don't want a permanent binding between the functional abstraction and its implementation.
    When both the functional abstraction and its implementation need to extended using sub-classes.
    It is mostly used in those places where changes are made in the implementation does not affect the clients.
*/

// Create a Question interface that provides the navigation from one question to another or vice-versa.

// this is the Question interface.  
interface Question {  
    public void nextQuestion();  
    public void previousQuestion();  
    public void newQuestion(String q);  
    public void deleteQuestion(String q);  
    public void displayQuestion();  
    public void displayAllQuestions();  
}  
// End of the Question interface.  

//Create a JavaQuestions implementation class that will implement Question interface.
class JavaQuestions implements Question {  
	 private List <String> questions = new ArrayList<String>();  
	 private int current = 0;  
	 public JavaQuestions(){  
	    questions.add("What is class? ");  
	    questions.add("What is interface? ");  
	    questions.add("What is abstraction? ");  
	    questions.add("How multiple polymorphism is achieved in java? ");  
	    questions.add("How many types of exception  handling are there in java? ");  
	    questions.add("Define the keyword final for  variable, method, and class in java? ");  
	    questions.add("What is abstract class? ");  
	    questions.add("What is multi-threading? ");  
	 }  
	 public void nextQuestion() {  
	    if( current <= questions.size()-1 )  
	    current++;  
	    System.out.print(current);  
	 }  
	  
	 public void previousQuestion() {  
	    if( current > 0 )  
	    current--;  
	 }  
	  
	 public void newQuestion(String quest) {  
	    questions.add(quest);  
	 }  
	  
	 public void deleteQuestion(String quest) {  
	    questions.remove(quest);  
	 }  
	  
	 public void displayQuestion() {  
	    System.out.println( questions.get(current) );  
	 }  
	 public void displayAllQuestions() {  
	    for (String quest : questions) {  
	    System.out.println(quest);  
	 }  
	}  
	}// End of the JavaQuestions class.  

//Create a QuestionManager class that will use Question interface which will act as a bridge..
class QuestionManager  {  
    protected Question q;  
    public String catalog;  
    public QuestionManager(String catalog) {  
    this.catalog=catalog;  
    }  
    public void next() {  
    q.nextQuestion();  
    }  
    public void previous() {  
    q.previousQuestion();  
    }  
    public void newOne(String quest) {  
    q.newQuestion(quest);  
    }  
    public void delete(String quest) {  
    q.deleteQuestion(quest);  
    }  
    public void display() {  
    q.displayQuestion();  
    }  
    public void displayAll() {  
        System.out.println("Question Paper: " + catalog);  
    q.displayAllQuestions();  
    }  
}// End of the QuestionManager class. 

//Create a QuestionFormat class that will extend the QuestionManager class
class QuestionFormat extends QuestionManager {  
    public QuestionFormat(String catalog){  
        super(catalog);  
    }  
    public void displayAll() {  
        System.out.println("\n---------------------------------------------------------");  
        super.displayAll();  
        System.out.println("-----------------------------------------------------------");  
    }  
}// End of the QuestionFormat class.  

//Create a BridgePatternDemo class.
class BridgePatternDemo {  
    public static void main(String[] args) {  
    QuestionFormat questions = new QuestionFormat("Java Programming Language");  
    questions.q = new JavaQuestions();  
        questions.delete("what is class?");  
        questions.display();  
    questions.newOne("What is inheritance? ");  
      
    questions.newOne("How many types of inheritance are there in java?");  
    questions.displayAll();  
    }  
}// End of the BridgePatternDemo class.  


/******************************************Example of Composite Pattern********************************************************/
/*
    When you want to represent a full or partial hierarchy of objects.
    When the responsibilities are needed to be added dynamically to the individual objects without affecting other objects. Where the responsibility of object may vary from time to time.
*/

// Create an Employee interface that will be treated as a component.
// this is the Employee interface i.e. Component.  
interface Employee {  
    public  int getId();  
    public String getName();  
    public double getSalary();  
       public void print();  
    public void add(Employee employee);  
       public void remove(Employee employee);  
       public Employee getChild(int i);  
}// End of the Employee interface.  

//Create a BankManager class that will be treated as a Composite and implements Employee interface.
class BankManager implements Employee {  
    private int id;  
    private String name;  
    private double salary;  
 
    public BankManager(int id,String name,double salary) {  
     this.id=id;      
     this.name = name;  
     this.salary = salary;  
    }  
        List<Employee> employees = new ArrayList<Employee>();  
    @Override  
    public void add(Employee employee) {  
       employees.add(employee);  
    }  
       @Override  
    public Employee getChild(int i) {  
     return employees.get(i);  
    }  
    @Override  
    public void remove(Employee employee) {  
     employees.remove(employee);  
    }    
    @Override  
    public int getId()  {  
     return id;  
    }  
    @Override  
    public String getName() {  
     return name;  
    }  
   @Override  
    public double getSalary() {  
     return salary;  
    }  
    @Override  
    public void print() {  
     System.out.println("==========================");  
     System.out.println("Id ="+getId());  
     System.out.println("Name ="+getName());  
     System.out.println("Salary ="+getSalary());  
     System.out.println("==========================");  
       
     Iterator<Employee> it = employees.iterator();  
       
         while(it.hasNext())  {  
           Employee employee = it.next();  
           employee.print();  
        }  
    }  
}// End of the BankManager class

// Create a Cashier class that will be treated as a leaf and it will implement to the Employee interface.
class Cashier implements Employee{  
    /* 
         In this class,there are many methods which are not applicable to cashier because 
         it is a leaf node. 
     */  
        private int id;  
            private String name;  
        private double salary;  
        public Cashier(int id,String name,double salary)  {  
            this.id=id;  
            this.name = name;  
            this.salary = salary;  
        }  
        @Override  
        public void add(Employee employee) {  
            //this is leaf node so this method is not applicable to this class.  
        }  
        @Override  
        public Employee getChild(int i) {  
            //this is leaf node so this method is not applicable to this class.  
            return null;  
        }  
        @Override  
        public int getId() {  
            // TODO Auto-generated method stub  
            return id;  
        }  
        @Override  
        public String getName() {  
            return name;  
        }  
        @Override  
        public double getSalary() {  
            return salary;  
        }  
        @Override  
        public void print() {  
            System.out.println("==========================");  
            System.out.println("Id ="+getId());  
            System.out.println("Name ="+getName());  
            System.out.println("Salary ="+getSalary());  
            System.out.println("==========================");  
        }  
        @Override  
        public void remove(Employee employee) {  
            //this is leaf node so this method is not applicable to this class.  
        }  
} 

//Create a Accountant class that will also be treated as a leaf and it will implement to the Employee interface.
class Accountant implements Employee{  
/* 
    In this class,there are many methods which are not applicable to cashier because 
    it is a leaf node. 
*/  
    private int id;  
    private String name;  
    private double salary;  
   public Accountant(int id,String name,double salary)  {  
       this.id=id;  
       this.name = name;  
       this.salary = salary;  
   }  
   @Override  
   public void add(Employee employee) {  
       //this is leaf node so this method is not applicable to this class.  
   }  
   @Override  
   public Employee getChild(int i) {  
       //this is leaf node so this method is not applicable to this class.  
       return null;  
   }  
   @Override  
    public int getId() {  
        // TODO Auto-generated method stub  
        return id;  
   }  
   @Override  
   public String getName() {  
       return name;  
   }  
   @Override  
   public double getSalary() {  
       return salary;  
   }  
   @Override  
   public void print() {  
       System.out.println("=========================");  
       System.out.println("Id ="+getId());  
       System.out.println("Name ="+getName());  
       System.out.println("Salary ="+getSalary());  
       System.out.println("=========================");  
   }  
  @Override  
   public void remove(Employee employee) {  
       //this is leaf node so this method is not applicable to this class.  
   }  
}  

//Create a CompositePatternDemo class that will also be treated as a Client and ii will use the Employee interface.
class CompositePatternDemo {  
    public static void main(String args[]){  
         Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);  
         Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);  
         Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);   
         Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  
            
          manager1.add(emp1);  
          manager1.add(emp2);  
          manager1.add(emp3);  
          manager1.print();  
        }  
}  

/***********************************************Decorator Pattern*********************************************************/
/*
    When you want to transparently and dynamically add responsibilities to objects without affecting other objects.
    When you want to add responsibilities to an object that you may want to change in future.
    Extending functionality by sub-classing is no longer practical.
*/

//Step 1:Create a Food interface.
interface Food {  
    public String prepareFood();  
    public double foodPrice();  
}// End of the Food interface.  

//Step 2: Create a VegFood class that will implements the Food interface and override its all methods.
class VegFood implements Food {  
    public String prepareFood(){  
         return "Veg Food";  
    }  
  
        public double foodPrice(){  
        return 50.0;  
    }  
}  

//Step 3:Create a FoodDecorator abstract class that will implements the Food interface and override it's all methods and it has the ability to 
       //decorate some more foods.
abstract class FoodDecorator implements Food{  
    private Food newFood;  
    public FoodDecorator(Food newFood)  {  
        this.newFood=newFood;  
    }  
    @Override  
    public String prepareFood(){  
        return newFood.prepareFood();   
    }  
    public double foodPrice(){  
        return newFood.foodPrice();  
    }  
}  

//Step 4:Create a NonVegFood concrete class that will extend the FoodDecorator class and override it's all methods.
class NonVegFood extends FoodDecorator{    
    public NonVegFood(Food newFood) {  
        super(newFood);  
    }  
    public String prepareFood(){  
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
    }  
    public double foodPrice()   {  
        return super.foodPrice()+150.0;  
    }  
}  

//Step 5:Create a ChineeseFood concrete class that will extend the FoodDecorator class and override it's all methods.
class ChineeseFood extends FoodDecorator{  
	  public ChineeseFood(Food newFood)    {  
	        super(newFood);  
	  }  
	    public String prepareFood(){  
	        return super.prepareFood() +" With Fried Rice and Manchurian  ";   
	    }  
	    public double foodPrice()   {  
	        return super.foodPrice()+65.0;  
	        }  
	}  

//Step 6:Create a DecoratorPatternCustomer class that will use Food interface to use which type of food customer wants means (Decorates).
class DecoratorPatternCustomer {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException    {  
       do{        
        System.out.print("========= Food Menu ============ \n");  
        System.out.print("            1. Vegetarian Food.   \n");  
        System.out.print("            2. Non-Vegetarian Food.\n");  
        System.out.print("            3. Chineese Food.         \n");  
        System.out.print("            4. Exit                        \n");  
        System.out.print("Enter your choice: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine());  
        switch (choice) {  
        case 1:{   
                 VegFood vf=new VegFood();  
              System.out.println(vf.prepareFood());  
              System.out.println( vf.foodPrice());  
            }  
            break;  
              
                case 2:{  
                Food f1=new NonVegFood((Food) new VegFood());  
                    System.out.println(f1.prepareFood());  
                System.out.println( f1.foodPrice());  
        }  
            break;    
     case 3:{  
             Food f2=new ChineeseFood((Food) new VegFood());  
                     System.out.println(f2.prepareFood());  
                    System.out.println( f2.foodPrice());  
              }  
            break;    
              
         default:{    
            System.out.println("Other than these no food available");  
        }         
    return;  
     }//end of switch  
          
}while(choice!=4);  
    }  
}  

/***************************************************Example of Facade Pattern**************************************************/
/*
    When you want to provide simple interface to a complex sub-system.
    When several dependencies exist between clients and the implementation classes of an abstraction.
*/

//Create a MobileShop interface.
interface MobileShop {  
    public void modelNo();  
    public void price();  
}  

//Create a Iphone implementation class that will implement Mobileshop interface. 
class Iphone implements MobileShop {  
    @Override  
    public void modelNo() {  
        System.out.println(" Iphone 6 ");  
    }  
    @Override  
    public void price() {  
    System.out.println(" Rs 65000.00 ");  
    }  
}  

//Create a Samsung implementation class that will implement Mobileshop interface.
class Samsung1 implements MobileShop {  
    @Override  
    public void modelNo() {  
    System.out.println(" Samsung galaxy tab 3 ");  
    }  
    @Override  
    public void price() {  
        System.out.println(" Rs 45000.00 ");  
    }  
}  

//Create a Blackberry implementation class that will implement Mobileshop interface .  
class Blackberry implements MobileShop {  
    @Override  
    public void modelNo() {  
    System.out.println(" Blackberry Z10 ");  
    }  
    @Override  
    public void price() {  
        System.out.println(" Rs 55000.00 ");  
    }  
}  

//Create a ShopKeeper concrete class that will use MobileShop interface.
class ShopKeeper {  
    private MobileShop iphone;  
    private MobileShop samsung;  
    private MobileShop blackberry;  
      
    public ShopKeeper(){  
        iphone= new Iphone();  
        samsung=new Samsung1();  
        blackberry=new Blackberry();  
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void samsungSale(){  
        samsung.modelNo();  
        samsung.price();  
    }  
   public void blackberrySale(){  
    blackberry.modelNo();  
    blackberry.price();  
        }  
}  

//Now, Creating a client that can purchase the mobiles from MobileShop through ShopKeeper.
class FacadePatternClient {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("========= Mobile Shop ============ \n");  
            System.out.print("            1. IPHONE.              \n");  
            System.out.print("            2. SAMSUNG.              \n");  
            System.out.print("            3. BLACKBERRY.            \n");  
            System.out.print("            4. Exit.                     \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();  
              
            switch (choice) {  
            case 1:  
                {   
                  sk.iphoneSale();  
                    }  
                break;  
       case 2:  
                {  
                  sk.samsungSale();        
                    }  
                break;    
       case 3:  
                           {  
                           sk.blackberrySale();       
                           }  
                   break;     
            default:  
            {    
                System.out.println("Nothing You purchased");  
            }         
                return;  
            }  
              
      }while(choice!=4);  
   }  
}  


/*******************************************Example of Proxy Pattern***************************************************/
//Create an OfficeInternetAccess interface
interface OfficeInternetAccess {  
    public void grantInternetAccess();  
}  

//Create a RealInternetAccess class that will implement OfficeInternetAccess interface for granting the permission to the specific employee.
class RealInternetAccess implements OfficeInternetAccess {  
    private String employeeName;  
    public RealInternetAccess(String empName) {  
        this.employeeName = empName;  
    }  
    @Override  
    public void grantInternetAccess() {  
        System.out.println("Internet Access granted for employee: "+ employeeName);  
    }  
}  

//Create a ProxyInternetAccess class that will implement OfficeInternetAccess interface for providing the object of RealInternetAccess class.
class ProxyInternetAccess implements OfficeInternetAccess {  
    private String employeeName;  
    private RealInternetAccess  realaccess;  
        public ProxyInternetAccess(String employeeName) {  
     this.employeeName = employeeName;  
 }  
 @Override  
 public void grantInternetAccess()   
 {  
     if (getRole(employeeName) > 4)   
     {  
         realaccess = new RealInternetAccess(employeeName);  
         realaccess.grantInternetAccess();  
     }   
     else   
     {  
         System.out.println("No Internet access granted. Your job level is below 5");  
     }  
 }  
 public int getRole(String emplName) {  
     // Check role from the database based on Name and designation  
     // return job level or job designation.  
     return 9;  
 }  
}  

//Now, Create a ProxyPatternClient class that can access the internet actually.
class ProxyPatternClient {  
    public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");  
        access.grantInternetAccess();  
    }  
}  

/*********************************************Example of Chain of Responsibility Pattern****************************************/
/*
    When more than one object can handle a request and the handler is unknown.
    When the group of objects that can handle the request must be specified in dynamic way.
*/

//Create a Logger abstract class.
abstract class Logger {  
    public static int OUTPUTINFO=1;  
    public static int ERRORINFO=2;  
    public static int DEBUGINFO=3;  
    protected int levels;  
    protected Logger nextLevelLogger;  
    public void setNextLevelLogger(Logger nextLevelLogger) {  
        this.nextLevelLogger = nextLevelLogger;  
    }  
        public void logMessage(int levels, String msg){  
        if(this.levels<=levels){  
            displayLogInfo(msg);  
        }  
        if (nextLevelLogger!=null) {  
            nextLevelLogger.logMessage(levels, msg);  
        }  
    }  
    protected abstract void displayLogInfo(String msg);  
} 

//Create a ConsoleBasedLogger class.
class ConsoleBasedLogger extends Logger {  
    public ConsoleBasedLogger(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("CONSOLE LOGGER INFO: "+msg);  
    }  
}  

//Create a DebugBasedLogger class.
class DebugBasedLogger extends Logger {  
    public DebugBasedLogger(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("DEBUG LOGGER INFO: "+msg);  
    }  
}// End of the DebugBasedLogger class.  

//Create a ErrorBasedLogger class.
class ErrorBasedLogger extends Logger {  
    public ErrorBasedLogger(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("ERROR LOGGER INFO: "+msg);  
    }  
}// End of the ErrorBasedLogger class.  

//Create a ChainOfResponsibilityClient class.
class ChainofResponsibilityClient {  
    private static Logger doChaining(){  
          Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);  
            
          Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);  
          consoleLogger.setNextLevelLogger(errorLogger);  
            
          Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);  
          errorLogger.setNextLevelLogger(debugLogger);  
            
          return consoleLogger;   
          }  
          public static void main(String args[]){  
          Logger chainLogger= doChaining();  
  
              chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");  
              chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");  
              chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");  
              }  
} 

/******************************************************Example of command pattern**********************************************/
/*
    Command This is an interface for executing an operation.
    ConcreteCommand This class extends the Command interface and implements the execute method. This class creates a binding between the action and the receiver.
    Client This class creates the ConcreteCommand class and associates it with the receiver.
    Invoker This class asks the command to carry out the request.
    Receiver This class knows to perform the operation.
*/

//Create a ActionListernerCommand interface that will act as a Command.
interface ActionListenerCommand {  
    public void execute();  
}  

//Create a Document class that will act as a Receiver.
class Document {  
    public void open(){  
     System.out.println("Document Opened");  
 }  
 public void save(){  
     System.out.println("Document Saved");  
 }  
}  

//Create a ActionOpen class that will act as an ConcreteCommand.
class ActionOpen implements ActionListenerCommand{  
    private Document doc;  
    public ActionOpen(Document doc) {  
        this.doc = doc;  
    }  
    @Override  
    public void execute() {  
        doc.open();  
    }  
}  

//Create a ActionSave class that will act as an ConcreteCommand.
class ActionSave implements ActionListenerCommand{  
	   private Document doc;  
	   public ActionSave(Document doc) {  
	        this.doc = doc;  
	    }  
	    @Override  
	    public void execute() {  
	        doc.save();  
	    }  
	}  

//Create a CommanPatternClient class that will act as a Client.
class MenuOptions  implements ActionListenerCommand{  
	   private Document doc;  
	    public MenuOptions (Document doc , Document doc1) {  
	        this.doc = doc;  
	    }  
	    @Override  
	    public void execute() {  
	        doc.save();  
	    }  
	} 

//Create a CommanPatternClient class that will act as a Client.
class CommandPatternClient {  
    public static void main(String[] args) {  
        Document doc = new Document();  
          
        ActionListenerCommand clickOpen = new ActionOpen(doc);  
        ActionListenerCommand clickSave = new ActionSave(doc);  
          
        //MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
          
        //menu.clickOpen();  
       // menu.clickSave();  
   }  
}  

/********************************************Example of Interpreter Pattern****************************************/
/*
    When the grammar of the language is not complicated.
    When the efficiency is not a priority.
*/

//Create a Pattern interface.
interface Pattern {  
    public String conversion(String exp);  
}  

//Create a InfixToPostfixPattern class that will allow what kind of pattern you want to convert.
class InfixToPostfixPattern implements Pattern{  
	char ch ;
	Stack<Character> s1 = new Stack<Character>();
	@Override  
    public String conversion(String exp) {  
        int priority = 0;// for the priority of operators.  
       String postfix = "";  
       for (int i = 0; i < exp.length(); i++)  
        {  
           char ch = exp.charAt(i);  
           if (ch == '+' || ch == '-' || ch == '*' || ch == '/'||ch=='%')  
           {  
              // check the precedence  
              if (s1.size() <= 0)  
                 s1.push(ch);  
           }  
           else  
              {  
                 Character chTop = (Character) s1.peek();  
                 if (chTop == '*' || chTop == '/')  
                    priority = 1;  
                 else  
                    priority = 0;  
                 if (priority == 1)  
                 {  
                    if (ch == '*' || ch == '/'||ch=='%')  
                    {  
                       postfix += s1.pop();  
                                                  i--;  
                    }  
                    else  
                    { // Same  
                       postfix += s1.pop();  
                       i--;  
                    }  
                 }  
                 else  
                 {  
                    if (ch == '+' || ch == '-')  
                    {  
                       postfix += s1.pop();  
                       s1.push(ch);  
                    }  
                    else  
                       s1.push(ch);  
                 }  
              }  
           }  
        int len = s1.size();  
        for (int j = 0; j < len; j++)  
           postfix += s1.pop();  
        return postfix;  
          
    }   
}// End of the InfixToPostfixPattern class. 


//Create a InterpreterPatternClient class that will use InfixToPostfix Conversion.
class InterpreterPatternClient {  
    public static void main(String[] args)  
       {  
           String infix = "a+b*c";  
             
           InfixToPostfixPattern ip=new InfixToPostfixPattern();  
             
           String postfix = ip.conversion(infix);  
           System.out.println("Infix:   " + infix);  
           System.out.println("Postfix: " + postfix);  
      }  
}  

/**************************************Example of Iterator Pattern*******************************************/
/*
    When you want to access a collection of objects without exposing its internal representation.
    When there are multiple traversals of objects need to be supported in the collection.
*/

//Create a Iterartor interface.
interface Iterator {  
    public boolean hasNext();  
    public Object next();  
}  

//Create a Container interface.
interface Container {  
    public Iterator getIterator();  
}// End of the Iterator interface.  

//Create a CollectionofNames class that will implement Container interface.

class CollectionofNames implements Container {  
public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};   
      
@Override  
    public Iterator getIterator() {  
        return (Iterator) new CollectionofNamesIterate() ;  
    }  
    private class CollectionofNamesIterate implements Iterator{  
        int i;  
        @Override  
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }  
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }
		
    }  
}  

//Create a IteratorPatternDemo class.
class IteratorPatternDemo {  
    public static void main(String[] args) {  
          CollectionofNames cmpnyRepository = new CollectionofNames();  
            
          for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
              String name = (String)iter.next();  
              System.out.println("Name : " + name);  
           }      
    }  
} 
