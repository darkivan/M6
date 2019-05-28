package DAO;

public interface DepartamentoDAO {
	boolean InsertarDep(Departamento dep);
	boolean EliminarDep(int deptno);
	boolean ModificarDep(int deptn, Departamento dep);
	Departamento ConsultarDep(int deptno);
}
