package DesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.management.RuntimeErrorException;

/*Why would we use singleton ? Any Scenario for Exampe
 * 1. In JDK there is a class called runtime is a singleton Class - The reason it is singleton bcoz when we run a our application we have only one runtime available and that is the soleinstance
 * 2. In Real time application , we can use singleton in log manager , that will hold log configuration and how to write log in what pattern
 * 3. Use singleton in where you want to represent heavy chahe or a configuration that is read from various different resource and you dont want to recreate that in different context and use one single instance
 * 4. Singleton are use in resoure management or db managment that manages connection staff like that and you may not want to create it every time when some 1 wants a connection and you dont want a new connection every time when some 1 wants a new connection and mantainig multiple pool of connection and causing a real mess in you application
 * */
public class Singleton {
	
	/*Singleton is not an easy to create , There are lots of hidding error which we have to take care while creating singleton
	 * Below is the simple example of singleton without handling hidding error
	 * With the help of Reflection , Serialization / Deserialization , clone , multhithreaded access , multiple class loaders and G.C
	 * We can vailote singleton object or we can create new instance , which is wrong in singleton concept and this hidden things which
	 * we need to take care.
	 * */
	
	static void print(String name, Object object) {
		System.out.println(String.format("Object : %s, HashCode : %d",name, object.hashCode()));
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println("*********Singleton example with volilation or hidden error****************");
		SingletonWithVoilation s1 = SingletonWithVoilation.getIntsance();
		SingletonWithVoilation s2 = SingletonWithVoilation.getIntsance();
		print("s1",s1);
		print("s2",s2);
		
		System.out.println("******************************Reflection**********************************");
		//Reflection
		Class clazz = Class.forName("DesignPattern.SingletonWithVoilation");
		Constructor<SingletonWithVoilation> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true); // here we are voilating private construtor into public
		SingletonWithVoilation s3 = ctor.newInstance();
		print("s3",s3);
		
		System.out.println("******************************Serialization********************************");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/tariq/temp/s2.ser"));
		oos.writeObject(s2);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/tariq/temp/s2.ser"));
		SingletonWithVoilation s4 = (SingletonWithVoilation)ois.readObject();
		print("s4",s4);
		
		System.out.println("******************************Clone****************************************");
		SingletonWithVoilation s5 = (SingletonWithVoilation) s2.clone();
		print("s5",s5);
		System.out.println("///////////////////////////////////////////////////////////////////////////");
		
		System.out.println("*********Singleton example without volilation no hidden error**************");
		
		SingletonWithOutVoilation s11 = SingletonWithOutVoilation.getIntsance();
		SingletonWithOutVoilation s21 = SingletonWithOutVoilation.getIntsance();
		print("s11",s11);
		print("s21",s21);
		
		System.out.println("******************************Reflection**********************************");
		//Reflection
		/*Class clazz1 = Class.forName("DesignPattern.SingletonWithOutVoilation");
		Constructor<SingletonWithOutVoilation> ctor1 = clazz1.getDeclaredConstructor();
		ctor.setAccessible(true); // here we are voilating private construtor into public
		SingletonWithOutVoilation s31 = ctor1.newInstance();
		print("s31",s31);*/
		
		System.out.println("******************************Serialization********************************");
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("D:/tariq/temp/s2.ser"));
		oos1.writeObject(s21);
		
		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("D:/tariq/temp/s2.ser"));
		SingletonWithOutVoilation s41 = (SingletonWithOutVoilation)ois1.readObject();
		print("s41",s41);
		
		System.out.println("******************************Clone****************************************");
		/*SingletonWithOutVoilation s51 = (SingletonWithOutVoilation) s21.clone();
		print("s51",s51);*/
		System.out.println("///////////////////////////////////////////////////////////////////////////");
		
		System.out.println("*********Singleton example with Enum***************************************");
		EnumSingleton s12 = EnumSingleton.INSTANCE;
		EnumSingleton s22 = EnumSingleton.INSTANCE;
		print("s1",s12);
		print("s2",s22);
	}
}


class SingletonWithVoilation implements Serializable , Cloneable{
	//private static Singleton soleSingleton = new Singleton(); //eager created
	private static SingletonWithVoilation soleSingleton= null; //lazy created
	private SingletonWithVoilation(){
		System.out.println("Creating....");
	}
	
	public static SingletonWithVoilation getIntsance(){
		if(soleSingleton == null){
			soleSingleton = new SingletonWithVoilation(); // lazy Inistialized
		}
		return soleSingleton;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class SingletonWithOutVoilation implements Serializable , Cloneable{
	//private static Singleton soleSingleton = new Singleton(); //eager created
	private static SingletonWithOutVoilation soleSingleton= null; //lazy created
	private SingletonWithOutVoilation(){
		if(soleSingleton!=null){ // this condition is to check when an reflection api new Instance() is called 
			throw new RuntimeException("Cannot create , please use getInstance()");
		}
		// if not null then proceed with creation.
		System.out.println("Creating....");
	}
	
	//synchronized keyword is used at method level to make sure that only one thread gets executed at a time . but it may cause performance issue , so make a synchorized block
	
	//public static synchronized SingletonWithOutVoilation getIntsance(){
	public static SingletonWithOutVoilation getIntsance(){
		if(soleSingleton == null){ // check 1
			synchronized (SingletonWithOutVoilation.class) {
				if(soleSingleton == null){ // double check locking bcoz there might be a chance when 1 thread trying to access a synchornised access another thread may enter in and initialized an object, so double checking is good. this is how multithreaded is resolved.
					soleSingleton = new SingletonWithOutVoilation(); // lazy Inistialized
				}
			}
		}
		return soleSingleton;
	}
	
	/*Note
	 * In double checking locking for multithread there might b a chance it can return an half object creation i.e not fully initialized(1 thread is initializing the object and second checks that it is not null and the half soleInstance).
	 *   To overcome thid problem volatile keyword is introduced with a variable.
	 * volatile keyword : to make sure the change to a variable is fully complete . 
	 * */
	
	protected Object clone() throws CloneNotSupportedException{
			throw new RuntimeException("Cannot clone an object , please use getInstance() for new instance");
	}
	
	/*this method is called during derialization
	 * when deserialization happen this garentee that java will call readResolve method just after the deserializating the object and this happen on top of deserialization  
	 * */
	private Object readResolve() throws ObjectStreamException{ 
		System.out.println("....read resolve...");
		return soleSingleton; // doing this override the instance for deserialization
		
	}
}


//Creating singleton with enum. it gives me automatic safety from hidden issue like reflection , clone , deserialization , multiple Threaded access.
enum EnumSingleton{
	INSTANCE;
	
	public String getConfiguration(){
		return "sdfsdfsdf";
	}
}
















