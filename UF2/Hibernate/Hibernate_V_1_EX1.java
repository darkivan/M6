import primero.*;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Hibernate_V_1_EX1 {
	
	public static void main(String[] args){
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Query q = session.createQuery("from Emple as e where e.depart.deptNo=20");
		List <Emple> lista =q.list();
		Iterator <Emple> iter = lista.iterator();
		
		while (iter.hasNext()){
			Emple emp = (Emple) iter.next();
			System.out.printf("Apellido: %s, Salario: %s%n", emp.getApellido(), emp.getSalario());
		}
		
		session.close();
		System.exit(0);
	}
}
