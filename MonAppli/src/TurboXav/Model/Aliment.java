package TurboXav.Model;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


/**
  * 
  * Classe de gestion des aliments
  * 
  * @author turbo-xav : Xavier Tagliarino <xavier.tagliarino@gmail.com>
  * @name Aliment
  * 
  *
  **/


public class Aliment{
	
	
	
	
	/**
	  * Unité commune pour la valeur énergétique
	  * 
	  * @access private static
	  * @var String
	  * @name  energyUnit
	  * 
	  **/
	
	private static final String energyUnit = "KCal";
	
	/**
	  * Valeur de référence pour le poids
	  * 
	  * @access private static
	  * @var String
	  * @name  refWeitght
	  * 
	  **/
	
	private static final String refWeitght = "100 g";
	
	/**
	  * Clef primaire de l'aliment
	  *
	  * @access private
	  * @name id_aliment
	  * @var int
	  * 
	  */
	
	private int id_aliment;
	
	/**
	  * Nom de l'aliment
	  * 
	  * @access private 
	  * @var String
	  * @name  name
	  * 
	  **/
	
	private String nom_aliment	= "";
	
	/**
	  * Teneur en protéines
	  * 
	  * @access private 
	  * @var int
	  * @name  proteine_aliment
	  * 
	  **/
	
	private int proteine_aliment	= 0;
	
	/**
	  * Teneur en glucide
	  * 
	  * @access private 
	  * @var int
	  * @name  glucide_aliment
	  * 
	  **/
	
	private int glucide_aliment	= 0;
	
	/**
	  * Teneur en lipide
	  * 
	  * @access private 
	  * @var int
	  * @name  lipide_aliment
	  * 
	  **/
	
	private int lipide_aliment	= 0;
	
	/**
	  * Constructeur vide
	  * 
	  * @access public 
	  * @name   Aliment
	  * 
	  */
	public Aliment() {
		
	}
	
	/**
	  * Constructeur avec toutes les données sauf l'id_aliment
	  * 
	  * @access public 
	  * @name   Aliment	  
	  * @param  string name
	  * @param  int protein
	  * @param  int glucid
	  * @param  int lipid	  
	  * 
	  **/
	
	public Aliment(String name, int protein, int glucid, int lipid) {
		// TODO Auto-generated method stub
		this.setNomAliment(name);
		this.setProteine(protein);
		this.setGlucide(glucid);
		this.setLipide(lipid);
			
		
	}
			
	/**
	  * Constructeur avec toutes les données
	  * 
	  * @access public 
	  * @name   Aliment
	  * @param  int id_aliment
	  * @param  string name
	  * @param  int protein
	  * @param  int glucid
	  * @param  int lipid	  
	  * 
	  **/
	
	
	public Aliment( int id_aliment, String name,int protein,int glucid,int lipid ) {
		this.setIdAliment(id_aliment);
		this.setNomAliment(name);
		this.setProteine(protein);
		this.setGlucide(glucid);
		this.setLipide(lipid);
		
	}
	

	/**
	  * Renvoie l'id aliment
	  * 
	  * @access public
	  * @name getIdAliment
	  * return int
	  * 
	  */
	
	public int getIdAliment(int id_aliment) {
		return this.id_aliment;
	}
	
	/**
	  * Renseigne l'id aliment
	  * 
	  * @access public
	  * @name setIdAliment
	  * @param int
	  * 
	  */
	
	public void setIdAliment(int id_aliment) {
		this.id_aliment = id_aliment;
	}
	
	
	
	/**
	  * Renseigne la teneur en protéine de l'aliment
	  * 
	  * @access public
	  * @name setProteine
	  * @param int
	  * 
	  */
	
	public void setProteine(int proteine) {
		this.proteine_aliment = proteine;
	}
	
	/**
	  * Renseigne la teneur en glucide de l'aliment
	  * 
	  * @access public
	  * @name setGlucide
	  * @param int	 
	  * 
	  */
	
	public void setGlucide(int glucide) {
		this.glucide_aliment = glucide;
	}
	
	/**
	  * Renseigne la teneur en lipide de l'aliment
	  * 
	  * @access public
	  * @name getLipide
	  * @param int
	  * 
	  */
	
	public void setLipide(int lipide) {
		this.lipide_aliment = lipide;
	}
	
	
	/**
	  * Renseigne le nom de l'aliment
	  * 
	  * @access public
	  * @name setNomAliment
	  * @param String
	  * 
	  */
	
	public void setNomAliment(String nom) {
		this.nom_aliment = nom;
	}
	
	/**
	  * Renvoit la teneur en protéine de l'aliment
	  * 
	  * @access public
	  * @name getProteine
	  * 
	  */
	
	public int getProteine() {
		return this.proteine_aliment;
	}
	
	/**
	  * Renvoit la teneur en glucide de l'aliment
	  * 
	  * @access public
	  * @name getGlucide
	  * @return String
	  * 
	  */
	
	public int getGlucide() {
		return this.glucide_aliment;
	}
	
	/**
	  * Renvoit la teneur en lipide de l'aliment
	  * 
	  * @access public
	  * @name getLipide
	  * @return int
	  * 
	  */
	
	public int getLipide() {
		return this.lipide_aliment;
	}
	
	/**
	  * Renvoit le nom de l'aliment
	  * 
	  * @access public
	  * @name getNomAliment
	  * @return String
	  * 
	  */
	
	public String getNomAliment() {
		return this.nom_aliment;
	}
	
	
	
	/**
	  * Calcule la valeur énergétique de l'aliment et la renvoie
	  * 
	  * @access public 
	  * @name   getEnergy		 
	  * @return int 
	  * 
	  **/
	
	public int getEnergy()
	{
		return this.proteine_aliment * 4 + this.glucide_aliment * 4 + this.lipide_aliment * 9;
	}
	
	/**
	  * Décrit l'aliment
	  * 
	  * @access public 
	  * @name   toString
	  * @return String	 	  
	  * 
	  **/
	
	public String toString()
	{
		return this.getNomAliment();
		//String strBilan = "Je suis \""+this.nom_aliment+"\". Voici mon bilan énergétique : protéine="+this.proteine_aliment+" g /"+Aliment.refWeitght+" Glucide = "+this.glucide_aliment+" g /"+Aliment.refWeitght+" Lipide "+this.lipide_aliment+" g /"+Aliment.refWeitght;
		//return  strBilan+= " Je fournis "+this.getEnergy()+" "+Aliment.energyUnit;
	}
	
	
	/**
	  * Liste les aliments
	  * 
	  * @access public 
	  * @name   listAliments
	  * @return List 	  
	  * @throws SQLException 
	  * @throws ClassNotFoundException 
	  * 
	  **/
	
	public static ArrayList<Aliment> listAliments()
	{	
		
		ArrayList<Aliment> aliments = new ArrayList<Aliment>();
		
		try {
			
			String sqlSelect = "SELECT "
					+ "id_aliment		,	"
					+ "nom_aliment		,	"
					+ "proteine_aliment	,	"
					+ "glucide_aliment	,	"
					+ "lipide_aliment		"
					+ "FROM diet_aliment	";
			
			ResultSet rs = AbstractDb.__executeSqlSelect( sqlSelect);
			
			while(rs.next()) {
					int idAliment				=	rs.getInt("id_aliment");
					String nomAliment			=	rs.getString("nom_aliment");
					int proteinAliment			=	rs.getInt("proteine_aliment");
					int glucidAliment			=	rs.getInt("glucide_aliment");
					int lipidAliment			=	rs.getInt("lipide_aliment");
					Aliment aliment = new Aliment (idAliment, nomAliment, proteinAliment, glucidAliment, lipidAliment);
					aliments.add(aliment);				
				}			
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
		return aliments;
		
	}
	
	/**
	  *
	  * @access public
	  * @name load
	  * @param int : id de l'aliment à charger
	  * 
	  */
	
	public boolean load(int id_aliment) {
		
		String sqlSelect = "SELECT "
				+ "id_aliment		,	"
				+ "nom_aliment		,	"
				+ "proteine_aliment	,	"
				+ "glucide_aliment	,	"
				+ "lipide_aliment		"
				+ "FROM diet_aliment	"
				+ "WHERE id_aliment = ? ";
		
		String[] params = { String.valueOf(id_aliment) };
		
		try {
		ResultSet rs = AbstractDb.__executeSqlSelect( sqlSelect,params);
		
		while(rs.next()) {
			this.setIdAliment(rs.getInt("id_aliment"));
			this.setNomAliment(rs.getString("nom_aliment"));
			this.setProteine(rs.getInt("proteine_aliment"));
			this.setGlucide(rs.getInt("glucide_aliment"));
			this.setLipide(rs.getInt("lipide_aliment"));
			return true;	
						
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
	
	/**
	  * Créer un Aliment
	  * 
	  * @access public
	  * @name create
	  *	@return boolean   
	  */
	
	public boolean create() {
		String sqlInsert	= "";
		sqlInsert += " INSERT INTO `diet_aliment` "
				+ "(`id_aliment`		,	"
				+ " `nom_aliment`		,	"
				+ " `proteine_aliment`	,	"
				+ " `glucide_aliment`	,	"
				+ " `lipide_aliment`		"
				+ ")";
		sqlInsert += " VALUES (	NULL, ?	,	?	,	?	,	 ?	)";
		String[] params = { this.getNomAliment(),	String.valueOf(this.getProteine()), String.valueOf(this.getGlucide()), String.valueOf(this.getLipide()) };
		
		int rs = AbstractDb.__executeSqlUpdate( sqlInsert, params);
		return true;
	}
	
	/**
	  * Efface un enregistrement
	  * 
	  * @access public
	  * @name delete	  
	  * 
	  * 
	  */
	
	public boolean delete() {
		String sqlDelete	= " DELETE FROM `diet_aliment` WHERE id_aliment = ?";
		String[] params = { String.valueOf(this.id_aliment) };
		int rs = AbstractDb.__executeSqlUpdate( sqlDelete, params);
		return true;
	}
	
	/**
	  *
	  * @access public
	  * @name getHeaderTable
	  * @return 
	  * 
	  */
	
	public static String[] getHeaderTable() {
				
		try {

			ResultSet rs = AbstractDb.__executeSqlSelect( "SHOW COLUMNS FROM diet_aliment");			
			rs.last();
			int nbRows = rs.getRow();
			String[] entetes = new String[nbRows];
			rs.beforeFirst();
			int i = 0;
			while(rs.next()) {
				String entete =  rs.getString("Field");				
				entetes[i] = entete;
				i++;
			}
			return entetes;
		}			
		catch(SQLException e) {
				e.printStackTrace();
		}
		
		return null;
		
	}
		
}