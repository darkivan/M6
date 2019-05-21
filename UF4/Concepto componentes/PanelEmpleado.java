package JavaBean;

import java.beans.*;
import java.io.Serializable;
@SuppressWarnings("serial")

public class PanelEmpleado implements Serializable, PropertyChangeListener  {
	private int limiteVariacionSueldo;
    private String[] listaDeCargos = {"Aprobado", "Suspendido"};
    private Empleado empleado;

  
    public PanelEmpleado() { 
    	this.limiteVariacionSueldo = 10;
    }
    public PanelEmpleado (int limiteVariacionSueldo) {
            this.limiteVariacionSueldo = limiteVariacionSueldo;
    }
   
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    	if (evt.getPropertyName().equals("cargo")) {
    		for(int i=0; i < listaDeCargos.length; i++) {
    			
    			
    		if(listaDeCargos[i].equals(evt.getNewValue())) {
	        	System.out.printf("Cargo anterior: %s%n",evt.getOldValue());
	        	System.out.printf("Cargo nuevo: %s%n",evt.getNewValue());
        	}
    	}
    	
    	} else {
        	System.out.printf("limite de variacion anterior: %d%n",evt.getOldValue());
        	System.out.printf("limite de variacion nuevo: %d%n",evt.getNewValue());
    	}
     }
    
	public int getLimiteVariacionSueldo() {
		return limiteVariacionSueldo;
	}
	public void setLimiteVariacionSueldo(int limiteVariacionSueldo) {
		this.limiteVariacionSueldo = limiteVariacionSueldo;
	}
	public String[] getListaDeCargos() {
		return listaDeCargos;
	}
	public void setListaDeCargos(String[] listaDeCargos) {
		this.listaDeCargos = listaDeCargos;
	}
    
    

}
