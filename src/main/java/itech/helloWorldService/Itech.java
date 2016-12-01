package itech.helloWorldService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Itech {

	static final String project_base = new File("").getAbsolutePath();
	
    public static String getResource(String res){
    	
    	StringBuilder sb = new StringBuilder();
    	BufferedReader r;
		try {
			r = new BufferedReader(new FileReader(project_base+"/src/main/resources/"+res));
		      
			String line = null;
			while((line=r.readLine())!=null)
			   sb.append(line);
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return sb.toString();
    }
}