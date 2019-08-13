package com.sunProject.SunLauncher.SunUI.SunConnect;

import javax.swing.UnsupportedLookAndFeelException;

import com.sunProject.SunLauncher.SunUI.MainActivity.MainActivityUI;
import com.sunproject.sunlauncher.packmine.PackMine;



public class SunUIConnect extends MainActivityUI {

	private static final long serialVersionUID = 1L;

	public 	SunUIConnect() {
		
	}
	
	public static void test() throws UnsupportedLookAndFeelException {
		
		PackMine pack = new PackMine("/home/sundev79/SunLauncher/");
		pack.install();
		System.out.println("RAS !");
	}
}
