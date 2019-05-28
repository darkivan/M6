package DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class CasoPrueba {

	public static void main(String[] args) throws IOException, InterruptedException {
		DepartamentoDAO departDAO = new DepartamentoImpl();
		
		//GENERAMOS UN DEPARTAMENTO
		Departamento newDepart = new Departamento(1, "I+D", "Barcelona");
		
		//LLAMAMOS AL PRIMER METODO PARA INSERTAR EL DEPARTAMENTO
		departDAO.InsertarDep(newDepart);
		
		//IMPRIMIMOS LOS DATOS PARA COMPROBAR QUE SE HA INSERTADO
		System.out.println(departDAO.ConsultarDep(1).getDeptno());
		System.out.println(departDAO.ConsultarDep(1).getDnombre());
		System.out.println(departDAO.ConsultarDep(1).getLoc());

		//CREAMOS UN NUEVO DEPARTAMENTO CON LAS MODIFICACIONES
		Departamento modifDepart = new Departamento(1, "Producto", "Barcelona");
		
		//APLICAMOS LAS MODIFICACIONES LLAMANDO AL MEDOTO MODIFICARDEP
		departDAO.ModificarDep(1, modifDepart);
		
		//IMPRIMIMOS EL DEPARTAMENTO CON LAS MODIFICACIONES
		System.out.println(departDAO.ConsultarDep(1).getDeptno());
		System.out.println(departDAO.ConsultarDep(1).getDnombre());
		System.out.println(departDAO.ConsultarDep(1).getLoc());
	
		//ELIMINAMOS EL DEPARTAMENTO INDICADO
		departDAO.EliminarDep(1);
		try {
			System.out.println(departDAO.ConsultarDep(1).getDeptno());
			System.out.println(departDAO.ConsultarDep(1).getDnombre());
			System.out.println(departDAO.ConsultarDep(1).getLoc());
		} catch (Exception e) { }
}
}
