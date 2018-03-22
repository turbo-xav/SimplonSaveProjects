package TurboXav.View;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;
import javax.swing.table.TableModel;

import com.sun.xml.internal.bind.v2.model.impl.ModelBuilder;

import TurboXav.Model.AbstractDb;
import TurboXav.Model.Aliment;
import TurboXav.Model.MyComboBoxModel;
import TurboXav.Model.TableModelAliment;
import sun.tools.jar.resources.jar_pt_BR;

import javax.swing.Box;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Dimension;

public class Fenetre extends JFrame implements ActionListener, WindowListener{
	
	private ArrayList<Aliment> aliments;
	private JTable tableAliments;
	private TableModelAliment tableModel;
	private MyComboBoxModel jComboBoxModel;
	
	private JButton boutonClose;
	private JButton boutonAdd;
	private JButton boutonDel;
	private JButton boutonRefresh;
	private JComboBox<String> jCombo;
	
	private JPanel panel ;
	
	
	private JLabel labelName;
	private JTextField name;
	private JLabel labelProtein;
	private JTextField protein;
	private JLabel labelGlucid;
	private JTextField glucid;
	private JLabel labelLipid;
	private JTextField lipid;
	
	
	/**
	  * Construit le panel et le renvoie
	  * 
	  * @access public
	  * @name Fenetre
	  * @return void	
	  * 
	  */
	
	public Fenetre(){		
		super();
		this.aliments = Aliment.listAliments();
		setBackground(new Color(255, 222, 173));
		build();
	}
	
	/**
	  * Construit le panel et le renvoie
	  * 
	  * @access private
	  * @name build
	  * @return void	
	  * 
	  */
	
	private void build(){
		this.setTitle("Fenêtre qui affiche des boutons"); //On donne un titre à l'application
		this.setSize(500,800); //On donne une taille à notre fenêtre
		this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		this.setResizable(true); //On permet le redimensionnement
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		this.setContentPane(buildContentPane());		
		this.addWindowListener(this);	
	}
	
	/**
	  * Construit le panel et le renvoie
	  * 
	  * @access private
	  * @name buildContentPane
	  * @return JPanel	
	  * 
	  */
	
	private JPanel buildContentPane(){
		
		//Créatio du panel
		this.panel = new Panel();		
		this.panel.setLayout(new FlowLayout());
		
		//Bouton en haut pour fermer créer
		this.boutonClose = new JButton("fermer l'application");
		this.boutonClose.addActionListener(this);
		//this.panel.add(this.boutonClose);
				
		this.boutonAdd = new JButton("Créer un aliment");
		this.boutonAdd.addActionListener(this);
		//this.panel.add(this.boutonAdd);
		
		Box Upbuttons = Box.createHorizontalBox();		
		this.panel.add(Upbuttons);
		Upbuttons.add(this.boutonAdd);
		Upbuttons.add(this.boutonClose);			
	    
		//Champs, Label du formulaire
		this.labelName = new JLabel();
		this.labelName.setSize(90,10);
		this.labelName.setText("Nom aliment : ");
		
		this.name = new JTextField();
		name.setColumns(20); 
				
		this.labelProtein = new JLabel();
		this.labelProtein.setSize(90,10);		
		this.labelProtein.setText("Protéines : ");	
		
		this.protein = new JTextField();
		protein.setColumns(20); 
				
		this.labelGlucid = new JLabel();
		this.labelGlucid.setSize(90,10);
		this.labelGlucid.setText("Glucides : ");	
		
		this.glucid = new JTextField();
		glucid.setColumns(20);
				
		this.labelLipid = new JLabel();
		this.labelLipid.setSize(90,10);
		this.labelLipid.setText("Lipides : ");	
		
		this.lipid = new JTextField();
		lipid.setColumns(20); 
			
		//Création du formulaire
		Box form = Box.createVerticalBox();
		this.panel.add(form);
		form.add(this.labelName);
		form.add(this.name);
		form.add(this.labelProtein);
		form.add(this.protein);
		form.add(this.labelGlucid);
		form.add(this.glucid);
		form.add(this.labelLipid);
		form.add(this.lipid);				
		
		//Formulaire de suppression		
		this.jCombo = new JComboBox<String>();	
		this.jComboBoxModel = new MyComboBoxModel();
		this.jComboBoxModel.setAliments(this.aliments);
		this.jCombo.setModel(this.jComboBoxModel);
		
		//ArrayList<TurboXav.Model.Aliment> aliments = TurboXav.Model.Aliment.listAliments();		
		//for(int i = 0 ; i < aliments.size() ; i++) { jCombo.addItem(aliments.get(i).getNomAliment()); }		
		this.boutonDel = new JButton("Supprimer");
		this.boutonDel.addActionListener(this);
		
		
								
		//Tableau de données		
		Box formTableau = Box.createVerticalBox();
		
		this.tableModel = new TableModelAliment();
		this.tableModel.setAliments(this.aliments);
		this.tableAliments = new JTable(this.tableModel);
		
		formTableau.add(new JScrollPane(this.tableAliments));				
		this.panel.add(formTableau);
		
		this.boutonRefresh = new JButton("refresh");
		this.boutonRefresh.addActionListener(this);
		formTableau.add(this.boutonRefresh);
		
		Box formDelete = Box.createHorizontalBox();		
		formDelete.add(jCombo);		
		formDelete.add(this.boutonDel);		
		this.panel.add(formDelete);
		
		return this.panel;
	}
	
	/**
	  * Méthode déclenchée lors d'event sur la Fenetre
	  * 
	  * @access private
	  * @name closeApplication
	  * @return void
	  * @param 	ActionEvent
	  * 
	  */
			
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
			
		if(source == this.boutonClose){
			this.closeApplicationAction();			
		} else if(source == this.boutonAdd){
			this.createAlimentAction();			
		}
		else if(source == this.boutonRefresh) {
			
			this.tableAliments.revalidate();	
		}
		else if(source == this.boutonDel) {		
			this.deleteAlimentAction();
						
		}
	}
	
	/**
	  * Créer un aliment
	  * 
	  * @access private
	  * @name createAlimentAction
	  * @return void
	  * 
	  */
	
	private void deleteAlimentAction() {
		Aliment selectedAliment = this.aliments.get(this.jCombo.getSelectedIndex());
		selectedAliment.delete();
		this.aliments.remove(this.jCombo.getSelectedIndex());	
		this.jComboBoxModel.setAliments(this.aliments);				
		//this.jCombo.repaint();
		this.tableAliments.revalidate();
	}
	
	/**
	  * Créer un aliment
	  * 
	  * @access private
	  * @name createAlimentAction
	  * @return void
	  * 
	  */
	
	private void createAlimentAction() {		
		
		String name	= this.name.getText();
		int prot	= this.protein.getText().matches("\\p{Digit}+")?Integer.parseInt(this.protein.getText()):0;		
		int gluc	= this.glucid.getText().matches("\\p{Digit}+")?Integer.parseInt(this.glucid.getText()):0;		
		int lip 	= this.lipid.getText().matches("\\p{Digit}+")?Integer.parseInt(this.lipid.getText()):0;
		
		Aliment aliment = new Aliment( name, prot, gluc, lip );
		if(aliment.create()) {	System.out.println("creation d'aliment bien effectuée"); }
		this.aliments.add(aliment);		
		
		this.jComboBoxModel.setAliments(this.aliments);	
		//this.jCombo.repaint();
		this.tableAliments.revalidate();
				
	}
	
	
	/**
	  * Ferme l'application en 3 secondes
	  * 
	  * @access private
	  * @name closeApplicationAction
	  * @return void
	  * 
	  */
	
	private void closeApplicationAction() {			
		
		try { 
			AbstractDb.closeConnection();
			System.out.println("Vous allez quitter dans :");			
			int t = 3;
			for(int i = t ; i > 0 ; i--) {
				System.out.println(i+" secondes");				
				Thread.sleep(200);
			}
			
		}catch(InterruptedException e1)
		{
			System.out.println(e1.getMessage());
		}
		finally {
			System.exit(0);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub		
		this.closeApplicationAction();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}