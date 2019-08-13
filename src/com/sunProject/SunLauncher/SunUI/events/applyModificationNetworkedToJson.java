package com.sunProject.SunLauncher.SunUI.events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sunProject.SunLauncher.SunUI.MainActivity.MainActivityUI;
import com.sunProject.SunLauncher.SunUI.MainActivity.Strings;
import com.sunProject.SunLauncher.SunUI.Prefs.Prefs;

public class applyModificationNetworkedToJson extends MainActivityUI {
	
	private static final long serialVersionUID = 1272781821001484266L;

	public static void applyJson() {
		lblAbout.setText(
				"<html><b><i>by " + Prefs.getAppAuthor() + "</i></b> | " + Prefs.getSunlauncherVersion() + "</html>");
		lblAbout.setVisible(true);
		Containerform.setVisible(true);
		inputUsername.setText(Strings.getString("MainActivityUI.inputUsername.text"));

	}

	public static void actionListenerActivity() {

		PremiumButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				inputPasswd.setEnabled(true);
				inputUsername.setText(Strings.getString("mainActivityUI.lbluserName.PremiumstateMode.text"));
				clear();
			}
		});
		CrackButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				inputUsername.setText(Strings.getString("MainActivityUI.inputUsername.text"));
				inputPasswd.setEnabled(false);
				clear();
			}
		});
	}

	private static void clear() {
		if (inputPasswd.getText().isEmpty() || !inputPasswd.getText().isEmpty()) {
			inputPasswd.setText(Strings.getString("MainActivityUI.txtPasswd.text"));
		}
		inputUsername.setForeground(Color.gray);
		inputPasswd.setForeground(Color.gray);
	}
}
