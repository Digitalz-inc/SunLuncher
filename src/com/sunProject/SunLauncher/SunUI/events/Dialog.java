package com.sunProject.SunLauncher.SunUI.events;

import javax.swing.JOptionPane;

import res.Common;

public class Dialog  {
	
	
	public static void alertDialog(String Content) {
		JOptionPane.showMessageDialog(null, Content, "Oops !", JOptionPane.WARNING_MESSAGE);
	}
	
	public static void errorDialog(String Content) {
		JOptionPane.showMessageDialog(null, Content, Common.AppName + " error Occured !", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void infoDialog(String content) {
		JOptionPane.showMessageDialog(null, content, Common.AppName +  " - Info", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void filesCreated() {
		 System.out.println("Folder and config Files Created !");
		 Dialog.infoDialog("Folder and config Files Created !");
	}
	
	public static void errorCreatingFiles(){
		System.out.println("Failed to create DataConfig for SunLauncher\n\n");
		Dialog.errorDialog("Oops !, I can not create the configuration files for SunLauncher\n see error in console.");
		System.exit(0);
	}
}
