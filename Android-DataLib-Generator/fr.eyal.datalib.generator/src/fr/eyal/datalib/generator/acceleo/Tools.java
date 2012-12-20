package fr.eyal.datalib.generator.acceleo;

import java.io.File;

public class Tools {

	public boolean removeFile(String path){
		File file = new File(path);
		return file.delete();
	}
}
