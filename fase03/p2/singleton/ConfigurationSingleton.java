package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import singleton.util.PropertiesUtil;

/**
 * @author oblancarte
 * @web_site https://github.com/oscarjb1/IntroduccionPatronesDiseno/tree/master/Singleton
 */
public class ConfigurationSingleton {

    private static ConfigurationSingleton singleton;

    private static final String CONFIGURATION_PROP = "singleton/META-INF/Configuration.properties";
    
    private static final String APP_NAME_PROP = "appName";
    private static final String APP_VERSION_PROP = "appVersion";
    private static final String AUTHOR_PROP = "author";
	private static final String EMAIL_PROP = "email";
	private static final String DB_NAME_PROP = "db_name";
	private static final String USER_DB_PROP = "user_db";
	private static final String PASSWORD_PROP = "password";
	private static final String HOST_PROP = "host";
	private static final String PORT_PROP = "port";
	private static final String DESCRIPTION_PROP = "description";

    private String appName;
    private String appVersion;
    private String author;
    private String email;
    private String db_name;
    private String user_db;
    private String password;
    private String host;
    private String port;
    private String description;
    
    private String query;
    private int auto_increment;
    
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultSet;
    

    private ConfigurationSingleton() {
        Properties prop = PropertiesUtil.loadProperty(CONFIGURATION_PROP);
        this.appName = prop.getProperty(APP_NAME_PROP);
        this.appVersion = prop.getProperty(APP_VERSION_PROP);
        this.author = prop.getProperty(AUTHOR_PROP);
        this.email = prop.getProperty(EMAIL_PROP);
        this.db_name = prop.getProperty(DB_NAME_PROP);
        this.user_db = prop.getProperty(USER_DB_PROP);
        this.password = prop.getProperty(PASSWORD_PROP);
        this.host = prop.getProperty(HOST_PROP);
        this.port = prop.getProperty(PORT_PROP);
        this.description = prop.getProperty(DESCRIPTION_PROP);
        
        this.query = "";
        this.auto_increment = 0;
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				// 											"jdbc:mysql://localhost:33061/fp2_23b", "fp2_23b", "12345678"
				this.conexion = DriverManager.getConnection("jdbc:mysql://"+this.host+":"+this.port+"/"+this.db_name, this.user_db, this.password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private static synchronized void createInstance(){
        if(singleton ==null){
            singleton = new ConfigurationSingleton();
        }
    }

    public static ConfigurationSingleton getInstance() {
        if(singleton == null) {
            createInstance();
        }
        return singleton;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAuthor() {
		return author;
	}

	/*public void setAuthor(String author) {
		this.author = author;
	}*/

	public String getEmail() {
		return email;
	}

	/*public void setEmail(String email) {
		this.email = email;
	}*/

	public String getDb_name() {
		return db_name;
	}

	/*public void setDb_name(String db_name) {
		this.db_name = db_name;
	}*/

	public String getUser_db() {
		return user_db;
	}

	/*public void setUser_db(String user_db) {
		this.user_db = user_db;
	}*/

	public String getPassword() {
		return password;
	}

	/*public void setPassword(String password) {
		this.password = password;
	}*/

	public String getHost() {
		return host;
	}

	/*public void setHost(String host) {
		this.host = host;
	}*/

	public String getDescription() {
		return description;
	}

	/*public void setDescription(String description) {
		this.description = description;
	}*/

	@Override
    public String toString() {
        return "ConfigurationSingleton{" + "appName=" + appName + ", appVersion=" + appVersion + '}';
    }
	
	public String fullToString() {
        return "ConfigurationSingleton{" + "appName=" + appName + ", appVersion=" + appVersion + '}';
    }

	public String getQuery() {
		return query;
	}
	
	private void createSentence() {
		try {
			this.sentencia = this.conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void closeSentence() {
		try {
			this.sentencia.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeConection() {
		this.closeResult();
		this.closeSentence();
		try {
			this.conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

	public ResultSet getResultSet() {
		return resultSet;
	}
	
	private void closeResult() {
		try {
			this.resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setQuery(String query) {
		this.query = query;
		try {
			this.createSentence();
			this.resultSet = this.sentencia.executeQuery(this.query);
			this.setAuto_increment();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public int getAuto_increment() {
		return auto_increment;
	}

	public void setAuto_increment() {
		this.auto_increment = this.auto_increment+1;
	}
	
	
}