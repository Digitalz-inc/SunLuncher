package com.sunProject.SunLauncher;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println("Launching " + SunLauncherTasks.class.getSimpleName() + "...");
		
			SunLauncherTasks.SunLauncherExecuteTasks();
	}

}
