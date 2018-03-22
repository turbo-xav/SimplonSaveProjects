package TurboXav.Model;

import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class MyComboBoxModel extends AbstractListModel implements ComboBoxModel {
     
	private ArrayList<Aliment> aliments = new ArrayList<Aliment>();
      
      private Object selected ;
      
      public void setAliments(ArrayList<Aliment> aliments) {
  		this.aliments = aliments;
  	}
      
      public MyComboBoxModel() {
    	//Appel au constructeur parent
  		super();
  		//Remplissage des aliments
  		//this.aliments = Aliment.listAliments();
      }

        @Override
      public Aliment getSelectedItem() {
        	return (Aliment) this.selected;
      }

        public void setSelectedItem(Object newValue) {
        	this.selected = newValue;
      }
        
      @Override
      public int getSize() {        
    	  return this.aliments.size();
      }

        @Override
      public Aliment getElementAt(int i) {
        return this.aliments.get(i);
      }
		
    }