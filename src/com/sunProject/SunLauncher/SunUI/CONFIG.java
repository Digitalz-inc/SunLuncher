package com.sunProject.SunLauncher.SunUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.sunProject.SunLauncher.SunUI.events.Dialog;

import res.Common;

public class CONFIG {
	public static File CONFIG_PATH = new File(Common.SystemPath + "/SunLauncher/");
	public static File CONFIG_FILE = new File(Common.SystemPath + "/SunLauncher/User-Config.scl");
	private static List<String> DataFileConfig = Arrays.asList("ENABLE_DEV_MODE=0", "ENABLE_USER_TWEAK=0", "AUTO_UPDATES=1");

	public static void ConfigInit(){

		if (!CONFIG_PATH.exists() || !CONFIG_FILE.exists()) {
			try {
				CONFIG_PATH.mkdir();
				CONFIG_FILE.createNewFile();
				ConfigFilesBufferProfile();
				Dialog.filesCreated();
			
			
				
			} 
			catch (Exception e) {
				e.printStackTrace();
				Dialog.errorCreatingFiles();
			}
		}
	}

	static void ConfigFilesBufferProfile() {

		try {
			FileWriter writerConfig = new FileWriter(CONFIG_FILE);
			BufferedWriter bufferWriter = new BufferedWriter(writerConfig);
			for (String config : DataFileConfig) {
				bufferWriter.write(config);
				bufferWriter.newLine();
			}
			
			bufferWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			Dialog.errorCreatingFiles();
		}
	}

	

}
