package com.sunProject.SunLauncher.SunUI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer extends CONFIG {

	public Buffer() {
	
	}
	
	public String reader(int LineNumber) throws IOException {
		String lineConfig = "";
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream(CONFIG_FILE)));
			
			for (int i = 0; i < LineNumber; i++) {
				lineConfig = bufferReader.readLine();
				
			}
			
			bufferReader.close();
		
		return lineConfig.toString();
		
	}
}
