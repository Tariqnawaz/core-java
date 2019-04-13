package practical.iO.iO_Basic;

import java.io.File;
import java.io.FilenameFilter;

public class O3_IO_FilenameFilter {

	public static void main(String[] args) {
		File file = new File("E/tariq/");
		
		String[] fileName = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(name.toLowerCase().endsWith(".pdf")){
					return true;
				}
				return false;
			}
		});
		if(fileName!=null){
			for(String name  : fileName){
				System.out.println(name);
			}
		}
		
	}

}
