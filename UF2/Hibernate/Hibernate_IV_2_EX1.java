import primero.*;
import java.util.Set;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_IV_2_EX1 {
	
	public static void main(String[] args){
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		Emple emp = new Emple();
		emp = (Emple) session.load ( Emple.class, 7369);
		Depart dep = (Depart) session.get (Depart.class, 30);
		
		if (emp==null) {
			System.out.println ("No existe el empleado");
		}
		
		else {
			emp.setDepart(dep);
			emp.setSalario(emp.getSalario()+1000);
			session.update(emp);
			System.out.println ("Sueldo sumando y departamento actualizado");
		}
		
		tx.commit();
		session.close();
		System.exit(0);
	}
}
