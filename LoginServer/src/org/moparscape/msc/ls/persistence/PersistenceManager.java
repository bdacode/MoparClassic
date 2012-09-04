package org.moparscape.msc.ls.persistence;

import java.io.File;
import java.io.FileReader;

import org.moparscape.msc.ls.Server;
import org.moparscape.msc.ls.util.Config;

import com.google.gson.Gson;

public class PersistenceManager {

	public static <T> T load(String file, Class<T> type) {
		try {
			return (T) new Gson().fromJson(new FileReader(new File(
					Config.CONF_DIR, file)), type);
		} catch (Exception e) {
			Server.error(e);
			return null;
		}
	}

}
