package server;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
  * 
  * Classe de connection JDBC à n'importe quel Driver (MySql, Postgresql,....)
  * @author Xavier Tagliarino <xavier.tagliarino@gmail.com>
  * @name SqlQuery
  * @access public abstract
  *
  */

public abstract class SqlQuery {
	
	/**
	 * 
	 * Ressource de connection à la base de données
	 * 
	 * @access private static 
	 * @var Connection
	 * @name connection
	 */
	
	private static Connection connection= null;
	
	/**
	 * Méthode (Singleton) qui tente de se connecter au moteur de base de données
	 * 
	 * 
	 * @access public static
	 * @name getConnection
	 * @return Connecion : Ressource de connection
	 * 
	 */	
	
	public static Connection getConnection() {		
		
		
		//Si on a déjà une connection on la renvoie pour ne maintenir qu'une seule connection
		if(SqlQuery.connection != null) { return SqlQuery.connection; }
		
		//Message de bienvenu
		System.out.println("-------- PostgreSQL JDBC Connection Test ------------");
		
		//On récupère les infos dans le fichier de config "config.properties"
		try {
			
			ResourceBundle rs 	=	ResourceBundle.getBundle("config");
			String driver 		=	rs.getString("sgbd.driver");
			String dsn 			=	rs.getString("sgbd.dsn");
			String login 		=	rs.getString("sgbd.login");
			String password 	=	rs.getString("sgbd.password");
			
			try {
				
					Class.forName(driver);					
	
					try {
						SqlQuery.connection = DriverManager.getConnection(dsn, login, password);
					} catch (SQLException e) {
	
						System.err.println("Pb de connection");
						e.printStackTrace();
						return null;
	
					}
	
					if (SqlQuery.connection != null) {
						System.out.println("Accès à la base de données ouvert");
						return SqlQuery.connection;
					} else {
						System.err.println("Aucune connexion à la base de données");
					}
					return SqlQuery.connection;			
				
				
				} catch (ClassNotFoundException e) {
					System.out.println("Le driver PosqtGreSQL est introuvable");
					e.printStackTrace();
					return null;
				}	
						
			}
			catch(MissingResourceException e) {
			  System.out.println("il faut vérifier le chemin du fichier properties, il est introuvable");		 
			}		
		

		return null;		
	}
}
