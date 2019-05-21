package JavaBean;

import java.beans.*;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Empleado implements Serializable{
	private String dni;
    private String nombre;
    private String cargo;
    private int sueldo; 
	private PropertyChangeSupport propertySupport; 
	
    public Empleado() {
    	super();
    	propertySupport = new PropertyChangeSupport (this);
    	this.cargo = "junior";
    	this.sueldo = 1000;
    }
    public Empleado (String dni, String nombre) {
        Empleado emple = new Empleado();
    	propertySupport = new PropertyChangeSupport (this);

        this.dni = dni;
        this.nombre = nombre;
        this.cargo = emple.getCargo();
        this.sueldo = emple.getSueldo();
    }
    
	public void addPropertyChangeListener (PropertyChangeListener listener) {
		propertySupport.addPropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener (PropertyChangeListener listener) {
		propertySupport.removePropertyChangeListener(listener);
	}
    
   	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		if (cargo.equals(null) || cargo.equals("")) {
			
		} else {
			propertySupport.firePropertyChange("cargo", this.cargo, cargo);
			this.cargo = cargo;
		}	
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		
		if (sueldo > 0) {
			propertySupport.firePropertyChange("cargo actual: ", this.sueldo, sueldo);
			this.sueldo = sueldo;
		}
		
	}
    
    
}
