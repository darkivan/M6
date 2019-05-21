package JavaBean;

public class PruebaEmple {
    public static void main(String[] args) {
        Empleado emple = new Empleado("41010935A", "Ivan");
        PanelEmpleado panelEmple =new PanelEmpleado();
        
        emple.addPropertyChangeListener (panelEmple);
        
        //emple.setSueldo(2000);
        emple.setCargo("Aprobado");

        
    }
}
