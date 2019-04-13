package practical.iO.sequenceInputStream;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class O11_SequenceInputStream {

	private Enumeration files; 
	public O11_SequenceInputStream(Vector files) { 
	this.files = files.elements(); 
	} 
	public boolean hasMoreElements() { 
	return files.hasMoreElements(); 
	} 
	public Object nextElement() { 
	try { 
	return new FileInputStream(files.nextElement().toString()); 
	} catch (Exception e) { 
	return null; 
	} 
	} 
}
