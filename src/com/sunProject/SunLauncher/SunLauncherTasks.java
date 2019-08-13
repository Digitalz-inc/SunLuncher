package com.sunProject.SunLauncher;

import java.io.IOException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.github.lalyos.jfiglet.FigletFont;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.sunProject.SunLauncher.SunUI.CONFIG;
import com.sunProject.SunLauncher.SunUI.SunUI;
import com.sunProject.SunLauncher.SunUI.MainActivity.MainActivityUI;
import com.sunProject.SunLauncher.SunUI.Prefs.Prefs;
import com.sunProject.SunLauncher.SunUI.SunConnect.SunUIConnect;
import com.sunProject.SunLauncher.SunUI.SunConnect.SunUpdates;

import res.Common;

/*
 * SunLaunchertasks
 */


public class SunLauncherTasks {
	
	
	public static void SunLauncherExecuteTasks()  {
		
		try {
			SunLauncherInitTasks();
			SunLauncherLaunchTasksUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	 static void SunLauncherInitTasks() throws IOException, InterruptedException {
		CONFIG.ConfigInit();
		System.out.println(FigletFont.convertOneLine("Sunlauncher"));
		
		
		
		
		System.out.println(Common.SystemPath);
	
	}
	
	 static void SunLauncherBackgroundActivityTasks() throws IOException, UnsupportedLookAndFeelException {
		 
		SunUpdates.VerifiyUpdates();
		Prefs.getAppAuthor();
		SunUIConnect.test();
	}

	 
	 
	 
	 static void SunLauncherLaunchTasksUI() throws Exception {
		System.out.println("Loading Theme ...");
		UIManager.setLookAndFeel(new GraphiteLookAndFeel());
		System.out.println("Loading MainWindow ...");
		SunUI UISPLASH = new SunUI();
		UISPLASH.setVisible(true);
		System.out.println("loading MainActivity ...");
		new MainActivityUI().setVisible(true);
		System.out.println("SunUI, is ready !");
		UISPLASH.dispose();
		
		SunLauncherBackgroundActivityTasks();
		
	}
}

