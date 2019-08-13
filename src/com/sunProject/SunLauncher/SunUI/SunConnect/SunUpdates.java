package com.sunProject.SunLauncher.SunUI.SunConnect;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.github.lalyos.jfiglet.FigletFont;
import com.sunProject.SunLauncher.SunUI.events.Dialog;
import com.sunProject.SunLauncher.SunUI.events.UpdatesEvent;
import com.sunProject.SunLauncher.SunUI.events.applyModificationNetworkedToJson;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import res.Common;

public class SunUpdates extends UpdatesEvent {
	// Path source = Path.of("dfdf", "vdfdf");
	public static String SunlauncherRepo;
	public static String SunlauncherVersion;
	public static String SunlauncherCustomName;
	public static String SunlaucherCustomMinecraftVersion;
	public static Boolean SunlauncherMinecraftForge;
	public static String SunlauncherCustomPackMinePath;
	public static String SunlauncherCustomModsPackPath;
	public static String SunlauncherCustomAppIcon;
	public static String SunlauncherAuthor;
	public static String SunlauncherWiki;
	public static String SunlauncherReadme;
	public static String SunlauncherDecription;
	public static Boolean SunlauncherDevMode;
	public static Boolean SunlauncherAutoUpdates;
	public static Boolean SunlauncherAllowConfigUser;

	private static final long serialVersionUID = 1L;

	public static String VerifiyUpdates() throws IOException {
		OkHttpClient client = new OkHttpClient();
		Request req = new Request.Builder().url(Common.SunProfilePath).build();
		Call call = client.newCall(req);

		Response res;
		try {
			res = call.execute();
			if (res.isSuccessful()) {
				Integer code = res.code();
				String codeToStr = code.toString();

				System.out.println(FigletFont.convertOneLine(codeToStr + ", tout est bon !"));
				
				
				String data = res.body().string();
				JSONObject dataConfig = (JSONObject) JSONValue.parse(data);
				JSONObject SC_ATTRIBUTES = (JSONObject) dataConfig.get("SunLauncher-prop");
				SunlauncherRepo = (String) SC_ATTRIBUTES.get("repository");
				SunlauncherVersion = (String) SC_ATTRIBUTES.get("version");
				JSONObject SC_CUSTOM = (JSONObject) dataConfig.get("custom");
				SunlauncherCustomName = (String) SC_CUSTOM.get("customName");
				JSONObject SC_CUSTOM_PKG = (JSONObject) SC_CUSTOM.get("customPkg");
				JSONObject SC_CUSTOM_PKG_MINECRAFT_VERSION = (JSONObject) SC_CUSTOM_PKG.get("minecraftVersion");
				SunlaucherCustomMinecraftVersion = (String) SC_CUSTOM_PKG_MINECRAFT_VERSION.get("version");
				SunlauncherMinecraftForge = (Boolean) SC_CUSTOM_PKG_MINECRAFT_VERSION.get("forge");
				JSONObject SC_CUSTOM_PKG_PKGS = (JSONObject) SC_CUSTOM_PKG.get("Pkgs");
				SunlauncherCustomPackMinePath = (String) SC_CUSTOM_PKG_PKGS.get("minecraft");
				SunlauncherCustomModsPackPath = (String) SC_CUSTOM_PKG_PKGS.get("mods");
				SunlauncherCustomAppIcon = (String) SC_CUSTOM.get("customIcon");
				JSONObject SC_ABOUT_REPO = (JSONObject) dataConfig.get("aboutRepo");
				SunlauncherAuthor = (String) SC_ABOUT_REPO.get("author");
				SunlauncherWiki = (String) SC_ABOUT_REPO.get("wiki");
				SunlauncherReadme = (String) SC_ABOUT_REPO.get("README");
				SunlauncherDecription = (String) SC_ABOUT_REPO.get("description");
				JSONObject SC_CONFIG = (JSONObject) dataConfig.get("config");
				SunlauncherDevMode = (Boolean) SC_CONFIG.get("enable-DevMode");
				SunlauncherAutoUpdates = (Boolean) SC_CONFIG.get("autoUpdates");
				SunlauncherAllowConfigUser = (Boolean) SC_CONFIG.get("enable-AllowConfigUser");

				onUpdatesfound();
				applyModificationNetworkedToJson.applyJson();
				applyModificationNetworkedToJson.actionListenerActivity();
				Unlock();
			}

		} catch (IOException e) {
			onUpdateError();
				System.out.println(FigletFont.convertOneLine("SunNetwork Not Found ! - 404 !"));
			Dialog.errorDialog("Impossible de joindre le serveur");
			System.exit(0);
			/*
			 * J'ajouterai la possibilité de le lancer en mode offline la launcher.
			 */
		}

		return null;

	}

}
