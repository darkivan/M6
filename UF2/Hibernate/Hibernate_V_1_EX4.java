import primero.*;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Hibernate_V_1_EX4 {
	
	public static void main(String[] args){
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Query q = session.createQuery("select avg(salario) from Emple");
		List <Emple> lista =q.list();
		Iterator <Emple> iter = lista.iterator();
		
		while (iter.hasNext()){
			
			System.out.printf("Salario medio: %s%n",iter.next());
		}
		
		session.close();
		System.exit(0);
	}
}

