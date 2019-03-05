import primero.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_IV_1_EX1 {
	
	public static void main(String[] args){
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		Emple empl = (Emple) session.get (Emple.class, 7369);
		
		if (empl==null) {
			System.out.println ("No existe el empleado");
		}
		
		else {
			System.out.printf("Nombre: %s Apellido: %s%n", empl.getApellido(),empl.getSalario());
			session.save(empl);
		}
				
		tx.commit();
		session.close();
		System.exit(0);
	}
}
