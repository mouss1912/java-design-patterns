package fr.diginamic.singleton1;

import java.util.ResourceBundle;

public class Configuration {
	public static Configuration instance = new Configuration();
	private String url;
	private String user;
	private String password;

	

		// TODO Auto-generated constructor stub
	
	public static Configuration getInstance() {
		return instance;
		
	}

	private Configuration() {
		ResourceBundle bundle = ResourceBundle.getBundle("configuration");
		url = bundle.getString("db.url");
		user = bundle.getString("db.user");
		password = bundle.getString("db.password");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void setInstance(Configuration instance) {
		Configuration.instance = instance;
	}

}
