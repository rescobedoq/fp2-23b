package singleton;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SingletonMain {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//Module 1
        ConfigurationSingleton singletonA = ConfigurationSingleton.getInstance();
        //Module 2
        ConfigurationSingleton singletonB = ConfigurationSingleton.getInstance();
        
        System.out.println(singletonA);
        System.out.println(singletonB);
        System.out.println("Hash Code - Singleton A : " + singletonA.hashCode());
        System.out.println("Hash Code - Singleton B : " + singletonB.hashCode());
        System.out.println("Same reference ==> " + (singletonA == singletonB));
        
        singletonA.setAppName("Singleton Pattern");
        singletonB.setAppName("Singleton Pattern 2");
        singletonB.setAppVersion("1.0x");
        System.out.println("Hash Code - Singleton B : " + singletonB.hashCode());
        
        System.out.println("SingletonA ==> " + singletonA);
        System.out.println("SingletonB ==> " + singletonB);
        
        singletonA = null;
        singletonB = null;
        
        singletonA = ConfigurationSingleton.getInstance();
        System.out.println("singletonA ==> " + singletonA);
        
        System.out.println("Hash Code - Singleton A : " + singletonA.hashCode());
        
        /**
         * ---------- INICIO DE CONSULTA SQL ----------
         */
        singletonA.setQuery("SELECT * FROM pets");
        ResultSet res;
       	try {
			while (singletonA.getResultSet().next()) {
				res = singletonA.getResultSet();
				System.out.format("%15s%15s%15s%n",res.getString("id"),res.getString("name"),res.getString("birth_date"));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       	
       	//singletonA.closeConection();
       	/**
         * ---------- ****** ** ******** *** ----------
         */
       	
       	/**
         * ---------- INICIO DE CONSULTA SQL ----------
         */
       	singletonB = ConfigurationSingleton.getInstance();
        singletonB.setQuery("SELECT name,birth_date FROM pets ORDER BY birth_date");
        //ResultSet res;
       	try {
			while (singletonB.getResultSet().next()) {
				res = singletonB.getResultSet();
				System.out.format("%15s%15s%n",res.getString("name"),res.getString("birth_date"));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       	
       	singletonB.closeConection();
       	/**
         * ---------- ****** ** ******** *** ----------
         */
		
	}

}
