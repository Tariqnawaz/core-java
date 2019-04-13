package practical.multiThreadingSynchronization;

public class Synchronization_StaticSynchronization {

	public static void main(String t[]){  
		MyThread13 t1=new MyThread13();  
		MyThread24 t2=new MyThread24();  
		MyThread3 t3=new MyThread3();  
		MyThread4 t4=new MyThread4();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
		}  

}
class Table5{  
	  
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	class MyThread13 extends Thread{  
	public void run(){  
	Table5.printTable(1);  
	}  
	}  
	  
	class MyThread24 extends Thread{  
	public void run(){  
	Table5.printTable(10);  
	}  
	}  
	  
	class MyThread3 extends Thread{  
	public void run(){  
	Table5.printTable(100);  
	}  
	}  
	  
	  
	  
	  
	class MyThread4 extends Thread{  
	public void run(){  
	Table5.printTable(1000);  
	}  
	}  