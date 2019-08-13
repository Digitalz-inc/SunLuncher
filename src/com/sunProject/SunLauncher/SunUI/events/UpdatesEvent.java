package com.sunProject.SunLauncher.SunUI.events;

import com.sunProject.SunLauncher.SunUI.MainActivity.MainActivityUI;

import res.Common;

@SuppressWarnings("serial")
public class UpdatesEvent extends MainActivityUI {
	
	public static void onUpdatesfound() {
		serverOKInfoLabel.setText("No Updates found !");
		serverOKInfoLabel.setIcon(Common.OK_ICON);
	}
	
	public static void onUpdateError() {
		serverOKInfoLabel.setText("Sorry, update check failed");
		serverOKInfoLabel.setIcon(Common.FAIL_ICON);
	}
	
	public static void Unlock() {
		MainActivityUI.btnConnect.setEnabled(true);
		MainActivityUI.PremiumButton.setEnabled(true);
		MainActivityUI.CrackButton.setEnabled(true);
		
	}
	
	
}
