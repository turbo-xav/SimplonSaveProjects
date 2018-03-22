package TurboXav.Model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModelAliment extends AbstractTableModel {

	private ArrayList<Aliment> aliments = new ArrayList<Aliment>();
	
	private String[] fields;
	private String[] entetes;
   	
	public TableModelAliment() {		
		//Appel au constructeur parent
		super();
		//Remplissage des aliments
		//this.aliments = Aliment.listAliments();
		//Entetes automatiques
		String[] entetes = Aliment.getHeaderTable();
		this.entetes = new String[entetes.length - 1];
		for(int i = 1 ; i < entetes.length; i++) {
			this.entetes[i-1] = entetes[i].replace("_aliment", " aliment");
		}	
	}
	
	public void setAliments(ArrayList<Aliment> aliments) {
		this.aliments = aliments;
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.aliments.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.entetes.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch(columnIndex) {
			case 0 :
				return this.aliments.get(rowIndex).getNomAliment();
			case 1 :
				return this.aliments.get(rowIndex).getProteine();	
			case 2 :
				return this.aliments.get(rowIndex).getGlucide();
			case 3 :
				return this.aliments.get(rowIndex).getLipide();	
		}
		return "";			
	}
	
	public String getColumnName(int columnIndex) {
        
		return this.entetes[columnIndex];
    }

}
