package com.sunProject.SunLauncher.SunUI.Prefs;

import com.sunProject.SunLauncher.SunUI.SunConnect.SunUpdates;

public class Prefs extends SunUpdates {
	/**
	 * @author sundev79
	 */
	private static final long serialVersionUID = -2881928182590191295L;

	public static String getAppAuthor() {
		
		return SunlauncherAuthor;
		
	}
	
	public static String getSunlauncherVersion() {
		
		return SunlauncherVersion;
		
	}

}
