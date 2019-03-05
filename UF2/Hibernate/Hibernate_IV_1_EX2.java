import primero.*;
import java.util.Set;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_IV_1_EX2 {
	
	public static void main(String[] args){
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		Depart dep = (Depart) session.get (Depart.class, 10);
		
		if (dep==null) {
			System.out.println ("No existe el departamento");	
		}
		
		else {
			Set<Emple> listaemp = dep.getEmples();
			Iterator<Emple> it = listaemp.iterator();
			
			while(it.hasNext()) {
				Emple emp = it.next();
				System.out.printf("Apellido: %s Salario: %s%n", emp.getApellido(),emp.getSalario());				
			}
			session.save(dep);
		}
		
		tx.commit();
		session.close();
		System.exit(0);
	}
}
