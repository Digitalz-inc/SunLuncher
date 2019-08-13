package res;

import javax.swing.ImageIcon;

import org.json.simple.JSONObject;

import com.sunProject.SunLauncher.SunUI.MainActivity.MainActivityUI;

public class Common { 
	public static final String SunluancherFilePath = Common.SystemPath + "/SunLauncher/";
	public static final String RessourcePath = "/res/";
	public static final String Appicon = RessourcePath + "icon.png";
	public static final String AppName = "Sunlauncher";
	public static final String SystemPath = System.getenv("HOME");
	public static final String SunlauncherRepo = "https://framagit.org/sunmediaproject/SunLauncherServerDATA/raw/master/";
	public static final String SunProfilePath = SunlauncherRepo + "profile.json";
	public static final ImageIcon OK_ICON = new ImageIcon(MainActivityUI.class.getResource(Common.RessourcePath + "OK.png"));
	public static final ImageIcon FAIL_ICON = new ImageIcon(MainActivityUI.class.getResource(Common.RessourcePath + "FAIL.png"));
	
	
	
}

