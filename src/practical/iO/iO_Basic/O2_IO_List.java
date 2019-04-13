package practical.iO.iO_Basic;

import java.io.File;
import java.util.List;

public class O2_IO_List {

	public static void main(String[] args) {
	
		File file = new File("E:/tariq/");
		
		String[] fileName = file.list();
		
		for(String name : fileName){
			System.out.println("FileName is: " +name);
		}
	}

}
