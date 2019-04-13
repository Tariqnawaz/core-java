package practical.iO.iO_Basic;

import java.util.Properties;

public class O6_IO_ClassLoaderFileLoading {

	public static void main(String[] args) {
		Properties appProp = null;
	     
	    static{
	        try{
	            InputStream is =
	                ClassLoaderFileLoading.class.getResourceAsStream("/FileName.properties");
	            appProp = new Properties();
	            appProp.load(is);
	        } catch(IOException ex){
	            ex.printStackTrace();
	        } catch(Exception ex){
	            ex.printStackTrace();
	        }
	}
	}
}
