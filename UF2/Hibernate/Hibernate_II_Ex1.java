import primero.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_II_Ex1 {
	
	public static void main(String[] args){
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Inserto una fila en depart");
		
		Depart dep = new Depart();
		Emple empl = new Emple();
		
		dep.setDeptNo((byte) 10);
		empl.setEmpNo(9992);
		empl.setDepart(dep);
		empl.setApellido("serrano");
		empl.setOficio("Consultortecnico");
		empl.setSalario(2222);
		empl.setDir(7902);
		empl.setComision(111);
		session.save(empl);
		
		tx.commit();
		session.close();
		System.exit(0);
	}
}
